/*
Navicat MySQL Data Transfer

Source Server         : 10.10.23.160
Source Server Version : 50621
Source Host           : 10.10.23.160:3306
Source Database       : database2

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-09-18 19:23:48
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
INSERT INTO `blog` VALUES ('110', 'database2-智慧警务云平台', 'mybatis-龙岗大数据智慧警务云平台开发使用，请各个分局，进行学习。进一步提高工作效率。');
INSERT INTO `blog` VALUES ('120', 'database2-信义科技月度会议', 'mybatis-关于开始人员招聘，及人员信息包括Java架构师，应用开发工程师，测试工程师，大数据分析师等岗位');
INSERT INTO `blog` VALUES ('130', 'database2-优比选云平台', 'mybatis-优比选云平台，开发设计');

-- ----------------------------
-- Table structure for `user_detail`
-- ----------------------------
DROP TABLE IF EXISTS `user_detail`;
CREATE TABLE `user_detail` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `qq` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_detail
-- ----------------------------
INSERT INTO `user_detail` VALUES ('1', 'deane', '284276995');
