create table test(id integer primary key identity, username varchar(20), java decimal, os decimal, math decimal);


insert into test("USERNAME", "JAVA", "MATH", "OS") values('zhangshan', 100, 100, 100);
select * from test;
select * from test where username = 'zhangshan';
