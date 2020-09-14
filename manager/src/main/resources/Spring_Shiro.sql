/*
 Navicat Premium Data Transfer

 Source Server         : 本地数据库
 Source Server Type    : MySQL
 Source Server Version : 80013
 Source Host           : localhost:3306
 Source Schema         : Spring_Shiro

 Target Server Type    : MySQL
 Target Server Version : 80013
 File Encoding         : 65001

 Date: 28/03/2019 09:43:21
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_auth
-- ----------------------------
DROP TABLE IF EXISTS `tb_auth`;
CREATE TABLE `tb_auth` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '权限id',
  `auth_name` varchar(200) DEFAULT NULL COMMENT '权限名称',
  `permission` varchar(200) DEFAULT NULL COMMENT '权限标识',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of tb_auth
-- ----------------------------
BEGIN;
INSERT INTO `tb_auth` VALUES (1, '用户查看', 'userInfo');
INSERT INTO `tb_auth` VALUES (2, '用户添加', 'userInfoAdd');
INSERT INTO `tb_auth` VALUES (3, '用户删除', 'userInfoDel');
INSERT INTO `tb_auth` VALUES (4, '用户修改', 'userInfoUpd');
COMMIT;

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(200) DEFAULT NULL COMMENT '角色名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='角色表';

-- ----------------------------
-- Records of tb_role
-- ----------------------------
BEGIN;
INSERT INTO `tb_role` VALUES (1, '管理员');
INSERT INTO `tb_role` VALUES (2, '游客');
COMMIT;

-- ----------------------------
-- Table structure for tb_role_auth
-- ----------------------------
DROP TABLE IF EXISTS `tb_role_auth`;
CREATE TABLE `tb_role_auth` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色权限id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  `auth_id` int(11) DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='角色权限关联表';

-- ----------------------------
-- Records of tb_role_auth
-- ----------------------------
BEGIN;
INSERT INTO `tb_role_auth` VALUES (1, 1, 1);
INSERT INTO `tb_role_auth` VALUES (2, 1, 2);
INSERT INTO `tb_role_auth` VALUES (3, 1, 3);
INSERT INTO `tb_role_auth` VALUES (4, 1, 4);
INSERT INTO `tb_role_auth` VALUES (5, 2, 1);
COMMIT;

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(200) DEFAULT NULL COMMENT '用户名',
  `account` varchar(200) DEFAULT NULL COMMENT '账号',
  `password` varchar(200) DEFAULT NULL COMMENT '密码',
  `state` int(1) DEFAULT NULL COMMENT '状态：0-未认证，1-已认证，2-冻结不可以',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of tb_user
-- ----------------------------
BEGIN;
INSERT INTO `tb_user` VALUES (1, '管理员', 'admin', '123456', 1);
INSERT INTO `tb_user` VALUES (2, 'lisi', 'lisi', '123456', 1);
INSERT INTO `tb_user` VALUES (3, 'wangwu', 'wangwu', '123456', 1);
INSERT INTO `tb_user` VALUES (4, 'zhaoliu', 'zhaoliu', '123456', 2);
INSERT INTO `tb_user` VALUES (5, 'zhangsan', 'zhangsan', '123456', 2);
COMMIT;

-- ----------------------------
-- Table structure for tb_user_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_role`;
CREATE TABLE `tb_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户角色id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `role_id` int(11) DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='用户角色关联表';

-- ----------------------------
-- Records of tb_user_role
-- ----------------------------
BEGIN;
INSERT INTO `tb_user_role` VALUES (1, 1, 1);
INSERT INTO `tb_user_role` VALUES (2, 2, 2);
INSERT INTO `tb_user_role` VALUES (3, 3, 2);
INSERT INTO `tb_user_role` VALUES (4, 4, 2);
INSERT INTO `tb_user_role` VALUES (5, 5, 2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
