--스프링 게시판 정보 테이블 작성, top_munu.jsp

create table board_info_table(
    board_info_idx number
        constraint board_info_pk primary key,
    board_info_name varchar2(100) not NULL
);

drop table board_info_table;

insert into board_info_table(board_info_idx, board_info_name) values(1,'JavaBoard');
insert into board_info_table(board_info_idx, board_info_name) values(2,'JSPBoard');
insert into board_info_table(board_info_idx, board_info_name) values(3,'SpringBoard');
insert into board_info_table(board_info_idx, board_info_name) values(4,'ProjectBoard');

--사용자 정보 테이블, join.jsp

create sequence user_seq
    start with 1
    increment by 1
    maxvalue 10000
    NOCYCLE;
    
create table user_table(
    user_idx number
        constraint user_table_pk primary key,
    user_name varchar2(50) not null,
    user_id varchar2(50) not null,
    user_pw varchar2(50) not null
);

drop table user_table;
    
--게시글 저장 테이블 작성
create sequence content_seq
start with 1    --시작번호
   INCREMENT by 1  -- 증가수 (1씩 증가)
   MAXVALUE 10000 -- 10000 까지
   nocycle;
   
create table content_table(
    content_idx number
        CONSTRAINT content_table_pk primary key,
    content_subject varchar2(50) not null,
    content_text long not null,
    content_file varchar2(3000),
    content_write_idx number not null
        constraint content_fk1 references user_table(user_idx),
    content_board_idx number not null
        constraint content_fk2 references board_info_table(board_info_idx),
    content_date date not null
);

drop table user_table;
   
insert into user_table values(1, '강성욱', 'kang1014', '12341234');


--session area에 저장하기 위하여 테스트
	select * from USER_TABLE;
   select * from user_table
   		where user_id='kang1014' and user_pw='12345678';
   		

  commit;

commit;