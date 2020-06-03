/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50725
Source Host           : 127.0.0.1:3306
Source Database       : ssmbuild

Target Server Type    : MYSQL
Target Server Version : 50725
File Encoding         : 65001

Date: 2020-06-02 14:29:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` varchar(32) NOT NULL COMMENT '书籍id',
  `book_name` varchar(50) NOT NULL COMMENT '数据名称',
  `book_count` int(10) NOT NULL COMMENT '书籍数量',
  `detail` varchar(255) NOT NULL COMMENT '书籍描述',
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user` varchar(32) DEFAULT NULL COMMENT '创建人',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `update_user` varchar(32) DEFAULT NULL COMMENT '最后更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('c575fdb2628944a889b231ab2de0b210', '西游记', '20', '《西游记》是中国古代第一部浪漫主义章回体长篇神魔小说。', '2020-06-01 21:07:08', 'c575fdb2628944a889b231ab2de0b213', null, null);
INSERT INTO `book` VALUES ('c575fdb2628944a889b231ab2de0b214', '水浒传', '20', '《水浒传》是以白话文写成的章回小说。', '2020-06-01 21:08:25', 'fb29cd5c0233462fb39458143b48f419', null, null);
