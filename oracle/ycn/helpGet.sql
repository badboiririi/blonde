create table helpGet(
	title VARCHAR(20) primary key,
	cost int not null,
	placeGet varchar(20) not null,
	place varchar(20) not null,
	time varchar(15) not null,
	phone varchar(20) not null,
	other varchar(50),
	state integer not null,
	no number(6,0) not null
)
create sequence helpGet_sequence
increment by 1
start with 1
nomaxvalue
minvalue 1
nocycle
nocache;

create or replace trigger tr_helpGet
before insert on helpGet
begin
        select helpGet_sequence.nextval into :new.no from dual;
end;
