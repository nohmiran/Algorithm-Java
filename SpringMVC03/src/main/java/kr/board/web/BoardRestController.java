package kr.board.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.board.domain.Board;
import kr.board.mapper.BoardMapper;
import kr.board.service.BoardService;

@RestController
public class BoardRestController { // OpenAPI-JSON
	
	@Autowired
	private BoardService service;

	// 글 목록
	@RequestMapping("/boardListAjax.do")
	public List<Board> boardListAjax() {
		List<Board> list = service.boardListAjax();
		// 여기서 json data format으로 응답을 해야한다.
		// List<Board> --> Gson API --> String(JSON)
		return list; // List<Board> --> jackson --> String(JSON)
	}	
	
	// 글쓰기
	@RequestMapping("/boardInsertAjax.do")
	public void boardInsertAjax(Board vo) { 
		service.boardInsertAjax(vo);
	}
	
	// 게시글 수정하기
	@RequestMapping("/boardContentUpdateAjax.do")
	public void boardContentUpdateAjax(Board vo) { // 두개 이상이기 때문에 vo로
		service.boardContentUpdateAjax(vo);
	}
	
	// 게시물 리스트에서 삭제하기
	@RequestMapping("/boardDeleteAjax.do")
	public void boardDeleteAjax(int idx) {
		service.boardDeleteAjax(idx);
	}
	
	// 게시물 리스트에서 제목과 작성자 수정하기
	@RequestMapping("/boardTWUpdateAjax.do")
	public void boardTWUpdateAjax(Board vo) {
		service.boardTWUpdateAjax(vo);
	}
	
	// 게시물 조회수 올리기
	@RequestMapping("/boardCountAjax.do")
	public Board boardCountAjax(int idx) { // 글의 인덱스를 매개변수로 받는다.
		Board vo = service.boardCountAjax(idx);
		return vo; // 게시판정보를 리턴해준다(json형태) -> { , , , ,"count":조회수 몇~}
	}

}
