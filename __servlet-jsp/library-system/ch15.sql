/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50523
Source Host           : localhost:3306
Source Database       : ch15

Target Server Type    : MYSQL
Target Server Version : 50523
File Encoding         : 65001

Date: 2013-11-25 08:44:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminId` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员编号',
  `adminName` varchar(50) NOT NULL COMMENT '管理员名字',
  `adminUserName` varchar(50) NOT NULL COMMENT '管理员用户名',
  `adminUserPwd` varchar(50) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (`adminId`),
  UNIQUE KEY `UN_ADMIN_USERNAME` (`adminUserName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', 'admin', 'admin');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `postId` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门编号',
  `postName` varchar(50) NOT NULL COMMENT '部门名称',
  `postNum` int(11) NOT NULL DEFAULT '0' COMMENT '部门人数',
  `postRemark` varchar(200) NOT NULL DEFAULT '暂无' COMMENT '部门简介',
  PRIMARY KEY (`postId`),
  UNIQUE KEY `UK_POST_NAME` (`postName`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', '外交部', '1', '暂无');
INSERT INTO `post` VALUES ('3', '财务部', '2', '管理财务');
INSERT INTO `post` VALUES ('4', '后勤部', '0', '管理后勤');
INSERT INTO `post` VALUES ('6', '营销部', '0', '暂无');
INSERT INTO `post` VALUES ('8', '保卫部', '1', '维护公司治安！');
INSERT INTO `post` VALUES ('9', '保卫部2部', '0', '暂无');
INSERT INTO `post` VALUES ('10', '策划部', '0', '策划公司活动！');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工编号',
  `name` varchar(50) NOT NULL COMMENT '员工姓名',
  `userName` varchar(50) NOT NULL COMMENT '员工登录用户名',
  `userPass` varchar(50) NOT NULL COMMENT '员工登录密码',
  `sex` varchar(2) NOT NULL COMMENT '员工性别',
  `birthday` date NOT NULL COMMENT '出生日期',
  `entryDate` date NOT NULL COMMENT '入职日期',
  `photo` varchar(100) NOT NULL COMMENT '头像地址',
  `postId` int(11) NOT NULL COMMENT '部门编号',
  `remark` varchar(100) DEFAULT '无' COMMENT '个人介绍',
  PRIMARY KEY (`userId`),
  UNIQUE KEY `UK_USERNAME` (`userName`),
  KEY `FK_POST_ID` (`postId`),
  CONSTRAINT `FK_POST_ID` FOREIGN KEY (`postId`) REFERENCES `post` (`postId`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '王华', 'wanghua', '123456', '男', '2013-11-19', '2013-11-19', '20131122052254755.jpg', '8', '无');
INSERT INTO `user` VALUES ('3', '李丽', 'lili', '123456', '女', '1990-12-11', '2004-05-06', '20131122051711406.jpg', '3', '优秀');
INSERT INTO `user` VALUES ('5', '何娟娟', 'hejjuan', '123456', '女', '1990-10-03', '2011-02-03', '20131122052201234.jpg', '1', '优秀，吃苦耐劳');
INSERT INTO `user` VALUES ('7', '孙明明', 'sunmingm', 'sunmingm', '女', '1990-11-11', '2012-10-01', '20131122050148857.jpg', '3', '无');
