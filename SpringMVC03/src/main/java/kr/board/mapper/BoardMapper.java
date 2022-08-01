package kr.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import kr.board.domain.Board;

//JDBC -> CRUD기능 
//1. Java + SQL 혼합된 형태 : 유지보수가 어렵다.
//2. 개발 생산성이 떨어진다. : 어렵고, 개발 속도가 느리다.
//MyBatis Framework : http://mybatis.org
//Spring JPA

public interface BoardMapper {
	
	// 게시판 리스트 보기 ==========================================================
	// 1. 접속기능 (X)
	// 2. 게시판 리스트 가져오는 기능(메소드 생성)
	public List<Board> boardList(); // 추상메서드 -> SQL(select~)
	// ArrayList 보다는 이 녀석의 부모타입인 List로 받아오는게 일반적(범용성)
	
	// 게시판 글쓰기 =============================================================
	public void boardInsert(Board vo); // SQL(insert~)
	
	// 게시물 상세보기  ===========================================================
	public Board boardContent(int idx); // SQL(select ~ where idx = 8)
	
	// 게시물 삭제 ==============================================================
	/* delete를 하는 방법 
	 * 1. Mapper인터페이스와 Mapper.xml을 연동해 쿼리문을 적는 방법
	 * 2. Mapper.java에 인터페이스 안에 @Delete어노테이션을 작성하는 방법
	 */
	@Delete("delete from board where idx=#{idx}") 
	public void boardDelete(int idx); // SQL(delete~)
	
	// 게시물 수정
	public void boardUpdate(Board vo); // SQL(update~)

	// MVC02 게시글 수정
	@Update("update board set contents=#{contents} where idx=#{idx}")
	public void boardContentUpdateAjax(Board vo);

	// MVC02 제목 작성자 수정
	@Update("update board set title=#{title},writer=#{writer} where idx=#{idx}")
	public void boardTWUpdateAjax(Board vo);

}
