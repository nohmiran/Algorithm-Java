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

	// HandlerMapping
	@RequestMapping("/")
	public String main() {
		return "basic"; // basic.jsp로
	}

}
