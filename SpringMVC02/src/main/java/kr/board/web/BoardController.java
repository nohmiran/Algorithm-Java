package kr.board.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.board.domain.Board;
import kr.board.mapper.BoardMapper;

@Controller // POJO
public class BoardController { // -> new BoardController();

	@Autowired
	private BoardMapper mapper; // mapper객체

	// 게시판 리스트  ============================================================
	// 1. 게시판 리스트를 보여주라는 요청을 받아서 DB에서 가져오는 일
	// HandlerMapping
	
	@RequestMapping("/")
	public String main() {
		return "basic";
	}
	
	@RequestMapping("/boardList.do")
	public String boardList(Model model) { // 요청에 대한 맵핑

		List<Board> list = mapper.boardList(); // mapper객체 호출!
		model.addAttribute("list", list);

		// 뷰의 논리적인 이름
		// 실제 경로(물리적인 이름) : /WEB-INF/views/boardList.jsp
		return "boardList";
	}

	// 게시물 쓰기  ============================================================
	// 물리적 경로를 적으면 나중에 유지보수 하기가 어려워지기 때문에
	// ViewResolver라는 녀석이
	// servlet-context.xml의 prefix와 suffix를 붙여주도록 도와준다

	@RequestMapping(value = "/boardInsert.do", method = RequestMethod.GET) 
	public String boardInsertGet() {
		
		  return "boardInsertForm"; // forward 
	}
		
	// 글쓰기 요청을 처리하는 부분
	// form의 parameter3개가 넘어온다(title, contents, writer)
	@RequestMapping(value = "/boardInsert.do", method = RequestMethod.POST)

	public String boardInsertPost(Board vo) {

		// 파라미터 수집(VO, DTO) -> 스프링은 자동으로 해준다.
		mapper.boardInsert(vo); // 저장

		// forward, redirect
		return "redirect:/boardList.do";
	}

	// 게시물 상세보기 =============================================================
	@RequestMapping("/boardContent.do/{idx}")
	public String boardContent(@PathVariable("idx") int idx, Model model) { // ?idx = 8
		Board vo = mapper.boardContent(idx);
		model.addAttribute("vo", vo);
		System.out.println(idx);
		return "boardContent"; // 여기서부터~
	}

	// 게시물 삭제 ===============================================================
	@RequestMapping("/boardDelete.do")
	public String boardDelete(@RequestParam("idx") int idx) { // ?idx = 10
		mapper.boardDelete(idx);
		return "redirect:/boardList.do";
	}
	
	// 게시물 수정  ===============================================================
	@RequestMapping(value = "/boardUpdate.do/{idx}", method = RequestMethod.GET)
	public String boardUpdateGet(@PathVariable("idx") int idx, Model model) {
		Board vo = mapper.boardContent(idx);
		model.addAttribute("vo", vo);
		return "boardUpdateForm"; // boardUpdateForm.jsp
		}
	
	@RequestMapping(value = "/boardUpdate.do", method = RequestMethod.POST)
	public String boardUpdatePost(Board vo) {
		mapper.boardUpdate(vo);
		return "redirect:/boardList.do";
		}
	
	@RequestMapping("/boardListAjax.do")
	public @ResponseBody List<Board> boardListAjax() {
		List<Board> list = mapper.boardList();
		// 여기서 json data format으로 응답을 해야한다.
		// List<Board> --> Gson API --> String(JSON)
		return list; // List<Board> --> jackson --> String(JSON)
		
	}
	
	
}
