/*
Navicat MySQL Data Transfer

Source Server         : 10.10.23.160
Source Server Version : 50621
Source Host           : 10.10.23.160:3306
Source Database       : database1

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-09-29 09:36:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `blog`
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int(10) NOT NULL DEFAULT '0',
  `title` varchar(200) DEFAULT NULL,
  `content` varchar(4000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES ('110', 'database1-管理云平台', 'mybatis-大数据智云平台开发使用，请各个分局，进行学习。进一步提高工作效率。');
INSERT INTO `blog` VALUES ('120', 'database1-科技月度会议', 'mybatis-关于开始人员招聘，及人员信息包括Java架构师，应用开发工程师，测试工程师，大数据分析师等岗位');

-- ----------------------------
-- Table structure for `oauth_access_token`
-- ----------------------------
DROP TABLE IF EXISTS `oauth_access_token`;
CREATE TABLE `oauth_access_token` (
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `token_id` varchar(255) NOT NULL,
  `token` blob,
  `authentication_id` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `client_id` varchar(255) DEFAULT NULL,
  `authentication` blob,
  `refresh_token` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`token_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oauth_access_token
-- ----------------------------

-- ----------------------------
-- Table structure for `oauth_refresh_token`
-- ----------------------------
DROP TABLE IF EXISTS `oauth_refresh_token`;
CREATE TABLE `oauth_refresh_token` (
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `token_id` varchar(255) NOT NULL,
  `token` blob,
  `authentication` blob,
  PRIMARY KEY (`token_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of oauth_refresh_token
-- ----------------------------

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', 'ROLE_ADMIN');
INSERT INTO `role` VALUES ('2', 'SCOPE_READ');
INSERT INTO `role` VALUES ('3', 'ROLE_USER');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `username` varchar(36) DEFAULT NULL,
  `password` varchar(36) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_fe6nqh4mlcjr068gcfrstmh2y` (`role_id`),
  CONSTRAINT `FK_fe6nqh4mlcjr068gcfrstmh2y` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('aa', 'aa', '1', '1');
INSERT INTO `user` VALUES ('bb', 'bb', '2', '2');
INSERT INTO `user` VALUES ('cc', 'cc', '3', '1');
INSERT INTO `user` VALUES ('dd', 'dd', '4', '2');

-- ----------------------------
-- Table structure for `user_info`
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `id` varchar(100) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `net_name` varchar(255) DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  `family_native_place` varchar(255) DEFAULT NULL,
  `mobile` varchar(100) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'deane', 'deane', 'java后端开发', '深圳市宝安区', '15010699876', '123456@qq.com');
