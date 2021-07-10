-- campuscard数据库创建
create database campuscard2 character set gbk;
use campuscard2;

-- 设计客户端默认字符集
SET @saved_cs_client = @@character_set_client;
SET @@character_set_client = gbk;

-- 含指定引擎和默认字符集

create table card(
                     cid char(6) primary key,
                     uid char(8) not null,
                     balance float,
                     status boolean
)ENGINE=InnoDB DEFAULT CHARSET=gbk;

set names gbk;
insert into card values('100001','10001001',200.0,1);
insert into card values('100002','10001002',220.0,1);
insert into card values('100003','10001003',88.5,1);
insert into card values('100004','10001004',156.6,1);
insert into card values('100005','10001005',110.0,1);
insert into card values('100006','10001006',100.0,1);
insert into card values('100007','10001007',405.0,1);
insert into card values('100008','10001008',29.0,1);

create table record(
                       reid char(8) primary key,
                       cid char(6),
                       retype varchar(30),
                       reamount float,
                       retime datetime,
                       re_place varchar(60),
                       constraint fk_record_card foreign key(cid) references card(cid)
)ENGINE=InnoDB DEFAULT CHARSET=gbk;

set names gbk;
insert into record values('00000001','100001','充值',200.0,'2021-5-10 10:15:03','充值模块');
insert into record values('00000002','100001','消费',20.0,'2021-5-11 10:15:03','北苑一楼');
insert into record values('00000003','100001','消费',10.0,'2021-5-11 10:16:03','北苑一楼');
insert into record values('00000004','100001','消费',50.0,'2021-5-11 12:15:03','北苑二楼');
insert into record values('00000005','100001','充值',300.0,'2021-5-12 10:15:03','充值模块');
insert into record values('00000006','100001','消费',20.0,'2021-5-13 10:15:03','北苑一楼');
insert into record values('00000007','100001','消费',15.0,'2021-5-15 10:16:03','北苑一楼');
insert into record values('00000008','100001','消费',30.0,'2021-5-15 12:15:03','北苑二楼');



create table user(
                     uid char(8) primary key,
                     username varchar(20),
                     password varchar(30),
                     cid char(6)
)ENGINE=InnoDB DEFAULT CHARSET=gbk;

set names gbk;
INSERT INTO user VALUES ('10001001', 'kiki', '123456', '100001');
INSERT INTO user VALUES ('10001002', 'xiaochuna', '123456', '100002');
INSERT INTO user VALUES ('10001003', 'kunkuna', '123456', '100003');
INSERT INTO user VALUES ('10001004', 'aixue', '123456', '100004');

create table manager(
                        mid char(3) primary key,
                        mname varchar(20),
                        mpassword varchar(30)
)ENGINE=InnoDB DEFAULT CHARSET=gbk;

set names gbk;
INSERT INTO manager VALUES ('001', 'lo', '123');
INSERT INTO manager VALUES ('002', 'co', '123');
INSERT INTO manager VALUES ('003', 'ko', '123');

create table electric(
                         eno varchar(6) primary key,
                         eremain int
)ENGINE=InnoDB DEFAULT CHARSET=gbk;

set names gbk;
insert into electric values('20a212',60);
insert into electric values('20b103',30);
insert into electric values('22b207',80);
insert into electric values('22b208',90);