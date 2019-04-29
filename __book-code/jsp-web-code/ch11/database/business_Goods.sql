drop database business;
create database business;
use business;
create table My_GoodsAdminuser(			
	AdminUser varchar(20),			
	AdminPass varchar(20)			
	);

insert into My_GoodsAdminuser			
values('admin','admin');

create table My_Users (				
	Id int not null auto_increment,		
	UserName varchar(20) not null,		
	PassWord varchar(20) not null,		 
	Names varchar(20),			 
	Sex varchar(2),			 
	Address varchar(150),			 
	Phone varchar(25),			 
	Post varchar(8),			 
	Email varchar(50),			 
	RegTime	Date,				 
	RegIpAddress varchar(20),		 
PRIMARY KEY  (Id)
	);


create table My_GoodsClass(			 
	Id int Not Null ,		 
	ClassName varchar(30) not null,		 
PRIMARY KEY  (Id)
	);

insert into My_GoodsClass values(1,'印刷品');
insert into My_GoodsClass values(2,'化妆品');
insert into My_GoodsClass values(3,'运动商品');
insert into My_GoodsClass values(4,'电子商品');
insert into My_GoodsClass values(5,'乐器');
insert into My_GoodsClass values(6,'衣饰品');


create table My_Goods(				 
	Id int NOT NULL auto_increment,			 
	GoodsName varchar(40) NOT NULL,		 
	GoodsClass int not null,		 
	Author varchar(25) NULL,		
	Publish varchar(150) NULL,		 
	GoodsNo varchar(30) NULL,		 
	Content varchar(3000) NULL,		 
	Prince	float NULL,		 
	Amount int NULL,			 
	Leav_number int NULL,		 
	RegTime date NOT NULl,			 
PRIMARY KEY  (Id)
	);



create table My_Indent(				 
	Id int not null auto_increment,			 
	IndentNo varchar(20) not null,		 
	UserId int not null,			 
	SubmitTime date not null,		 
	ConsignmentTime varchar(20),		 
	TotalPrice float,		 
	content varchar(400),			 
	IPAddress varchar(20),			 
	IsPayoff int null,			 
	IsSales int null,			 
PRIMARY KEY  (Id)
	);


create table My_IndentList(			 
	Id int not null auto_increment,	 
	IndentNo int not null,		 
	GoodsNo int not null,		 
	Amount int,				 
PRIMARY KEY  (Id)
);




