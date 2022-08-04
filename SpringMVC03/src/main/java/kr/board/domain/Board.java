package kr.board.domain;

import lombok.Data;

@Data  // lombok API
public class Board { // lombok(롬복)

	// property(프로퍼티, 속성)
	private int idx; // 번호
	private String memId; // -> 새로 추가 : 사용자ID
	private String title; // 제목
	private String contents; // 내용
	private String writer; // 작성자
	private String indate; // 작성일
	private int count; // 조회수
		
}
