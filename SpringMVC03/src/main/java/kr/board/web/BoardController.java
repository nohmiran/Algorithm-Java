package kr.board.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.domain.Member;
import kr.board.service.BoardService;

@Controller // POJO
public class BoardController { // -> new BoardController();

	@Autowired
	BoardService service;
	
	// HandlerMapping
	@RequestMapping("/")
	public String main() {
		return "basic"; // basic.jsp로
	}
	
	// 로그인
	@RequestMapping("login.do")
	public String login(Member vo, HttpSession session) { // memId, memPass
		
		Member mvo = service.login(vo); // 서비스 호출
		if(mvo != null) { // 로그인 성공 -> 객체바인딩(HttpSession) 
			session.setAttribute("mvo", mvo); // jsp
		}
		return "redirect:/";
	}
	
	// 로그아웃
	@RequestMapping("logout.do")
	public String logout(HttpSession session) {
		session.invalidate(); // 세션 무효화(로그아웃)
		return "redirect:/";
	}

}
