/*
Navicat MySQL Data Transfer

Source Server         : 10.10.23.160
Source Server Version : 50621
Source Host           : 10.10.23.160:3306
Source Database       : database1

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-09-18 19:23:24
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
INSERT INTO `blog` VALUES ('110', 'database1-管理云平台', 'mybatis-云平台开发使用，请各个分局，进行学习。进一步提高工作效率。');
INSERT INTO `blog` VALUES ('120', 'database1-月度会议', 'mybatis-关于开始人员招聘，及人员信息包括Java架构师，应用开发工程师，测试工程师，大数据分析师等岗位');

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
