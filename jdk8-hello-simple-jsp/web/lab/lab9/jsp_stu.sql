/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : jsp_stu

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-04-20 08:34:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `age` int(3) NOT NULL DEFAULT '0',
  `gender` char(1) NOT NULL,
  `hobby` varchar(100) DEFAULT NULL,
  `qualification` varchar(10) NOT NULL,
  `introduction` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('11', '令狐冲', '43', '男', '旅游 健身 ', '本科生', '                                                                                                                                                                        大侠\r\n                        \r\n                        \r\n                        \r\n     ');
INSERT INTO `student` VALUES ('15', '佟湘玉', '48', '女', '登山 健身 ', '研究生', '                                                                                                                                            掌柜的\r\n                        \r\n                        \r\n                        \r\n                        \r\n      ');
INSERT INTO `student` VALUES ('16', 'hello', '45', '男', '登山 ', '研究生', 'hello jsp');
