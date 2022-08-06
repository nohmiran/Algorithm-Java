-- board table
create table board(
	idx int not null auto_increment,
	memId varchar(20) not null, -- 추가
	title varchar(100) not null,
	contents varchar(2000) not null,
	writer varchar(20) not null, -- memName
	indate datetime default now(),
	count int default 0,
	primary key(idx)
);

drop table board;

insert into board(title, contents, writer)
values('스프링게시판', '스프링게시판', '관리자');
insert into board(title, contents, writer)
values('스프링게시판', '스프링게시판', '예스맨');

select * from board;

-- member table
create table member(
	memId varchar(20) not null, -- 아이디
	memPass varchar(20) not null, -- 패스워드
	memName varchar(20) not null, -- 이름
	primary key(memId)
)

insert into member values('smhrd1', '1234', '예스맨1');
insert into member values('smhrd2', '1234', '예스맨2');
insert into member values('smhrd3', '1234', '예스맨3');

select * from member;


