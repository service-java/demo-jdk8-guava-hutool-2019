drop database if exists lab;
create database if not exists lab;

USE lab;

DROP TABLE IF EXISTS admin;
CREATE TABLE admin (
  `name` varchar(16) default NULL,
  `password` varchar(16) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert  into admin(`name`,`password`) values ('dd','dd'),('admin','admin');

DROP TABLE IF EXISTS grade;
CREATE TABLE grade (
  `id` int(8) NOT NULL,
  grade varchar(50) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert  into grade(`id`,grade) values (1,'2009'),(2,'2010'),(3,'2011'),(4,'2012');

DROP TABLE IF EXISTS news;
CREATE TABLE news (
  `id` int(8) NOT NULL auto_increment,
  `title` varchar(60) default NULL,
  `content` varchar(255) default NULL,
  `datetime` varchar(60) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
insert  into news(`id`,`title`,`content`,`datetime`) values (1,'阳光体育运动会','现场直播春季运动会最新状况!','2013-4-2 21:45:38'),(2,'获奖通知','获得省挑战杯1等奖','2012-12-2 21:43:57');

DROP TABLE IF EXISTS project;
CREATE TABLE project (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(64) default NULL,
  `info` varchar(255) default NULL,
  `time` varchar(16) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert  into project(`id`,`name`,`info`,`time`) values (1,'校园门户','关于开发一个多平台的校园门户系统','2012-7-2'),(2,'云学习平台','开发一个基于云计算的在线学习平台\r\n							\r\n							','2013-1-1');

DROP TABLE IF EXISTS achievement;
CREATE TABLE achievement (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(64) default NULL,
  `info` varchar(255) default NULL,
  `time` varchar(64) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert  into achievement (`id`,`name`,`info`,`time`) values (1,'大型仪器共享平台','实现大型仪器开发和共享的平台','2010-7-2~2011-9-1'),(2,'基于微信的实验教学辅助平台','利用微信技术，辅助实验教学的系统\r\n							\r\n							','2012-04-01~2012-12-1');


DROP TABLE IF EXISTS student;
CREATE TABLE student (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(16) default NULL,
  `grade_id` int(11) default NULL,
  `image` varchar(50) default NULL,
  `sex` char(6) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

insert  into student(`id`,`name`,`grade_id`,`image`,`sex`) values (1,'彭慧玲',3,'2-1.gif','female'),(2,'李威力',2,'pinfo.gif','male'),(3,'何家全',3,'xong7.gif','male');



DROP TABLE IF EXISTS teacher;
CREATE TABLE teacher (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(32) default NULL,
  `sex` char(6) default NULL,
  `zhicheng` varchar(32) default NULL,
  `image` varchar(50) default NULL,
  `info` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
insert  into teacher(`id`,`name`,`sex`,`zhicheng`,`image`,`info`) values (1,'李老师','male','教授','xong6.gif','是教育部重点攻关项目、多项省科技攻关项目和自然科学基金项目的主持人'),(2,'王老师','女','讲师','s10.gif','青年骨干教师');

