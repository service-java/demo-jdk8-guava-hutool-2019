/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : student

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-03-08 14:26:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `stu_info`
-- ----------------------------
DROP TABLE IF EXISTS `stu_info`;
CREATE TABLE `stu_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，自增，int',
  `stu_id` int(11) NOT NULL COMMENT '学生id',
  `name` varchar(255) NOT NULL COMMENT '学生姓名',
  `gender` tinyint(4) NOT NULL COMMENT '学生性别， 1♂ 0♀',
  `born_date` date NOT NULL COMMENT '出生日期',
  `chinese` float(4,1) NOT NULL COMMENT '语文成绩',
  `math` float(4,1) NOT NULL COMMENT '数学成绩',
  `english` float(4,1) NOT NULL COMMENT '英语',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=186 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of stu_info
-- ----------------------------
INSERT INTO `stu_info` VALUES ('64', '20142', '送终鸡', '2', '2016-12-04', '89.0', '79.0', '90.0');
INSERT INTO `stu_info` VALUES ('119', '20148', '金正恩', '1', '2016-12-08', '99.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('120', '201410', '吴彦祖', '1', '2016-12-08', '99.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('125', '201488', 'JavaScript', '0', '2016-12-08', '19.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('150', '201488', '宋慧乔', '1', '2016-12-08', '99.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('156', '201488', '金喜善', '0', '2016-12-09', '19.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('165', '201488', 'Java', '0', '2016-12-08', '19.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('166', '201488', 'ECMAScript', '0', '2016-12-08', '19.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('167', '201488', 'C++', '0', '2016-12-08', '19.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('169', '201488', 'Ruby', '0', '2016-12-08', '19.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('170', '201488', 'Node.js', '0', '2016-12-08', '78.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('171', '201488', 'Expresss', '1', '2016-12-18', '78.0', '89.0', '100.0');
INSERT INTO `stu_info` VALUES ('172', '201488', 'MongoDB', '1', '2016-11-18', '78.0', '89.0', '100.0');
INSERT INTO `stu_info` VALUES ('173', '201410', '犬志龙', '2', '2016-12-08', '99.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('175', '201488', '金喜善', '1', '2016-12-08', '88.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('176', '8999', '宋佳', '1', '2016-12-08', '99.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('177', '87', 'ECMAScript', '0', '2016-12-08', '19.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('180', '788', '吴彦祖', '1', '2016-12-11', '99.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('183', '117', '金证', '1', '2016-12-08', '99.0', '89.0', '99.9');
INSERT INTO `stu_info` VALUES ('184', '20141', '骆金参', '1', '1996-04-12', '12.0', '12.0', '12.0');
INSERT INTO `stu_info` VALUES ('185', '20129', '张三', '1', '1997-09-08', '100.0', '99.0', '100.0');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(255) NOT NULL COMMENT '用户名',
  `user_pwd` char(32) NOT NULL COMMENT 'md5加密后的密码',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '7917f2596f8bb70c954893f200ba6274');
