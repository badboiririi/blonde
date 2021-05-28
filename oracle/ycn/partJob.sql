create table partJob(
	title VARCHAR(20) primary key,
	cost int not null,
	place varchar(20) not null,
	time varchar(15) not null,
	num int not null,
	phone varchar(20) not null,
	other varchar(50),
	state integer not null£¬
	no number(6,6) not null
)
create sequence partJob_sequence
increment by 1
start with 1
nomaxvalue
minvalue 1
nocycle
nocache;

create or replace trigger tr_partJob
before insert on partJob
begin
        select partJob_sequence.nextval into :new.no from dual;
end;

	

