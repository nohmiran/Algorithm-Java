package kr.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.domain.Board;
import kr.board.domain.Member;
import kr.board.mapper.BoardMapper;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;

	// 글 목록
	public List<Board> boardListAjax() {
		List<Board> list = mapper.boardList();
		return list;
	}	
	
	// 글쓰기
	public void boardInsertAjax(Board vo) { 
		mapper.boardInsert(vo);
	}
	
	// 게시글 수정하기
	public void boardContentUpdateAjax(Board vo) {
		mapper.boardContentUpdateAjax(vo);
	}
	
	// 게시물 리스트에서 삭제하기
	public void boardDeleteAjax(int idx) {
		mapper.boardDelete(idx);
	}
	
	// 게시물 리스트에서 제목과 작성자 수정하기
	public void boardTWUpdateAjax(Board vo) {
		mapper.boardTWUpdateAjax(vo);
	}
	
	// 로그인
	public Member login(Member vo) {
		return mapper.login(vo);
	}

	// 조회수
	public Board boardCountAjax(int idx) {
		// 1. 조회수를 업데이트해주고
		mapper.boardCountAjax(idx);
		
		// 2. 다시 게시판 정보를 가져온다.

		return null;
	}

}
