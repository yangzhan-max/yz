/*
 Navicat Premium Data Transfer

 Source Server         : mysqlConn
 Source Server Type    : MySQL
 Source Server Version : 50520
 Source Host           : localhost:3306
 Source Schema         : stuems

 Target Server Type    : MySQL
 Target Server Version : 50520
 File Encoding         : 65001

 Date: 26/12/2019 21:50:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for base_info
-- ----------------------------
DROP TABLE IF EXISTS `base_info`;
CREATE TABLE `base_info`  (
  `student_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '学生学号',
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '123456' COMMENT '密码',
  `head_pic` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '个人头像',
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '电子邮箱',
  `phone` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '电话号码',
  `resident_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '身份证号',
  PRIMARY KEY (`student_id`, `resident_id`) USING BTREE,
  INDEX `resident_id`(`resident_id`) USING BTREE,
  CONSTRAINT `base_info_ibfk_2` FOREIGN KEY (`resident_id`) REFERENCES `resident_info` (`resident_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `base_info_ibfk_3` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of base_info
-- ----------------------------
INSERT INTO `base_info` VALUES ('516300213205', '123456', '', '', '', '439988199702255598');
INSERT INTO `base_info` VALUES ('516300214203', '111111', '516300214203.jpg', '', '', '42122319980116671X');
INSERT INTO `base_info` VALUES ('516300214204', '123456', '516300214204.jpg', '2458069139@qq.com', '15926823552', '421223199801166721');

-- ----------------------------
-- Table structure for course_info
-- ----------------------------
DROP TABLE IF EXISTS `course_info`;
CREATE TABLE `course_info`  (
  `course_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '课程编号',
  `course_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程名称',
  `course_place` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程地点',
  `course_teacher` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程教师',
  `course_week` int(2) UNSIGNED NULL DEFAULT NULL COMMENT '课程时间',
  `course_section` int(5) UNSIGNED NULL DEFAULT NULL COMMENT '课程节次',
  `course_cycle` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程周期',
  `course_credit` float(10, 1) UNSIGNED NULL DEFAULT 0.0 COMMENT '课程学分',
  `course_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程类型',
  PRIMARY KEY (`course_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of course_info
-- ----------------------------
INSERT INTO `course_info` VALUES ('1000001', '人工智能', '化学楼203', '武云云', 3, 2, '1-16周', 2.0, '公共必修课');
INSERT INTO `course_info` VALUES ('1000002', '人工智能', '化学楼307', '武云云', 4, 2, '1-16周', 2.0, '公共必修课');
INSERT INTO `course_info` VALUES ('1000003', 'Pascal语言程序设计', '文学楼506', '李三', 4, 3, '5-16周', 1.5, '公共选修课');

-- ----------------------------
-- Table structure for exam_info
-- ----------------------------
DROP TABLE IF EXISTS `exam_info`;
CREATE TABLE `exam_info`  (
  `exam_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '考试信息编号',
  `student_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '学生学号',
  `course_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程编号',
  `exam_time` date NULL DEFAULT NULL COMMENT '考试时间',
  `exam_place` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '考试地点',
  `exam_section` int(5) NULL DEFAULT NULL COMMENT '考试节次',
  `exam_Invigilator` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '监考教师',
  `exam_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '考试类型',
  PRIMARY KEY (`exam_id`) USING BTREE,
  INDEX `student_id`(`student_id`) USING BTREE,
  INDEX `course_id`(`course_id`) USING BTREE,
  CONSTRAINT `exam_info_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `exam_info_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_info` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of exam_info
-- ----------------------------
INSERT INTO `exam_info` VALUES ('KJ5266332', '516300214204', '1000001', '2019-12-14', '化学楼304', 2, '张天凡', '开卷');

-- ----------------------------
-- Table structure for exam_second_info
-- ----------------------------
DROP TABLE IF EXISTS `exam_second_info`;
CREATE TABLE `exam_second_info`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '编号',
  `statue` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '状态',
  `student_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '学生学号',
  `course_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程编号',
  `exam_second_time` date NULL DEFAULT NULL COMMENT '考试时间',
  `exam_second_place` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '考试地点',
  `exam_second_section` int(5) NULL DEFAULT NULL COMMENT '考试节次',
  `exam_second_Invigilator` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '监考教师',
  `exam_second_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '考试类型',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `student_id`(`student_id`) USING BTREE,
  INDEX `course_id`(`course_id`) USING BTREE,
  CONSTRAINT `exam_second_info_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `exam_second_info_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_info` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for final_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `final_exam_info`;
CREATE TABLE `final_exam_info`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '编号',
  `statue` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '状态',
  `student_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '学生学号',
  `course_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程编号',
  `final_exam_time` date NULL DEFAULT NULL COMMENT '考试时间',
  `final_exam_place` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '考试地点',
  `final_exam_section` int(5) NULL DEFAULT NULL COMMENT '考试节次',
  `final_exam_Invigilator` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '监考教师',
  `final_exam_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '考试类型',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `student_id`(`student_id`) USING BTREE,
  INDEX `course_id`(`course_id`) USING BTREE,
  CONSTRAINT `final_exam_info_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `final_exam_info_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_info` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for level_exam_info
-- ----------------------------
DROP TABLE IF EXISTS `level_exam_info`;
CREATE TABLE `level_exam_info`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `student_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '学生学号',
  `resident_id` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '身份证号',
  `level_exam_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '考级名称',
  `level_exam_score` int(5) NULL DEFAULT 0 COMMENT '考级分数',
  `cost` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '报名费用',
  `sign_year` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '2016-2017' COMMENT '报名学年',
  `sign_term` int(2) UNSIGNED NULL DEFAULT 1 COMMENT '报名学期',
  `is_paid` bit(1) NULL DEFAULT b'0' COMMENT '缴费状态',
  `sign_state` bit(1) NULL DEFAULT b'0' COMMENT '报名状态',
  `admission_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '准考证号',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `student_id`(`student_id`) USING BTREE,
  INDEX `resident_id`(`resident_id`) USING BTREE,
  CONSTRAINT `level_exam_info_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `level_exam_info_ibfk_2` FOREIGN KEY (`resident_id`) REFERENCES `resident_info` (`resident_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of level_exam_info
-- ----------------------------
INSERT INTO `level_exam_info` VALUES (1, '516300214204', '42122319980116671X', '四级考试', 0, 30.00, '2017-2018', 1, b'0', b'0', '12456999');

-- ----------------------------
-- Table structure for resident_info
-- ----------------------------
DROP TABLE IF EXISTS `resident_info`;
CREATE TABLE `resident_info`  (
  `resident_id` char(18) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '身份证号',
  `name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '姓名',
  `gender` char(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '性别',
  `native_place` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '籍贯',
  `borth_date` date NOT NULL COMMENT '出生日期',
  `nation` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '国籍',
  `minority` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '名族',
  `political_face` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '政治面貌',
  `resident_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '证件类型',
  PRIMARY KEY (`resident_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of resident_info
-- ----------------------------
INSERT INTO `resident_info` VALUES ('42122319980116671X', '陈淼涛', '男', '湖北咸宁崇阳', '1998-01-16', '中国', '汉族', '共青团员', '身份证');
INSERT INTO `resident_info` VALUES ('421223199801166721', '李四', '男', '湖北武汉', '1998-01-16', '中国', '汉族', '共青团员', '身份证');
INSERT INTO `resident_info` VALUES ('439988199702255598', '张三', '男', '湖北孝感孝南', '1997-02-25', '中国', '汉族', '党员', '身份证');

-- ----------------------------
-- Table structure for select_course_info
-- ----------------------------
DROP TABLE IF EXISTS `select_course_info`;
CREATE TABLE `select_course_info`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '选课表编号',
  `student_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '学生学号',
  `course_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程编号',
  `course_term` int(5) UNSIGNED NULL DEFAULT 1 COMMENT '学期',
  `course_year` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '2016-2017' COMMENT '学年',
  `course_score` int(5) UNSIGNED NULL DEFAULT 0 COMMENT '课程分数',
  `course_score_second` int(5) UNSIGNED NULL DEFAULT 0 COMMENT '补考分数',
  `course_score_final` int(5) UNSIGNED NULL DEFAULT 0 COMMENT '终极补考分数',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `select_course_info_ibfk_1`(`student_id`) USING BTREE,
  INDEX `course_id`(`course_id`) USING BTREE,
  CONSTRAINT `select_course_info_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `select_course_info_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_info` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of select_course_info
-- ----------------------------
INSERT INTO `select_course_info` VALUES (2, '516300214204', '1000001', 1, '2019-2020', 0, 0, 0);
INSERT INTO `select_course_info` VALUES (3, '516300214204', '1000002', 1, '2019-2020', 0, 0, 0);
INSERT INTO `select_course_info` VALUES (5, '516300214204', '1000003', 1, '2019-2020', 0, 0, 0);

-- ----------------------------
-- Table structure for student_info
-- ----------------------------
DROP TABLE IF EXISTS `student_info`;
CREATE TABLE `student_info`  (
  `student_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '学生学号',
  `join_time` date NOT NULL COMMENT '入学日期',
  `join_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '入学类型',
  `education` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '学制',
  `college` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '院系',
  `major` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '专业',
  `department` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '系别',
  `classes` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '班级',
  `is_study` varchar(2) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '是否在读',
  PRIMARY KEY (`student_id`) USING BTREE,
  INDEX `cno`(`classes`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = sjis COLLATE = sjis_japanese_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student_info
-- ----------------------------
INSERT INTO `student_info` VALUES ('516300213205', '2019-11-07', '应届生', '四学年制', '计科院', '计算机科学与技术', '信息工程系', '5163002132', '是');
INSERT INTO `student_info` VALUES ('516300214203', '2019-09-01', '', '', '', '', '', '', '');
INSERT INTO `student_info` VALUES ('516300214204', '2016-09-01', '应届生', '四学年制', '新院', '计算机科学与技术', '信息工程系', '5163002142', '是');

-- ----------------------------
-- Table structure for teach_program_info
-- ----------------------------
DROP TABLE IF EXISTS `teach_program_info`;
CREATE TABLE `teach_program_info`  (
  `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT,
  `student_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '学生学号',
  `course_id` varchar(15) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '课程编号',
  `sign_year` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '2016' COMMENT '报名学年',
  `sign_term` int(2) UNSIGNED NULL DEFAULT 1 COMMENT '报名学期',
  `sign_time` datetime NULL DEFAULT NULL COMMENT '报名时间',
  `program_type` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '' COMMENT '教学项目类型',
  `is_accept` bit(1) NULL DEFAULT NULL COMMENT '是否受理',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `student_id`(`student_id`) USING BTREE,
  INDEX `course_id`(`course_id`) USING BTREE,
  CONSTRAINT `teach_program_info_ibfk_1` FOREIGN KEY (`student_id`) REFERENCES `student_info` (`student_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `teach_program_info_ibfk_2` FOREIGN KEY (`course_id`) REFERENCES `course_info` (`course_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of teach_program_info
-- ----------------------------
INSERT INTO `teach_program_info` VALUES (2, '516300214204', '1000001', '2018-2019', 1, '2019-12-14 16:13:54', '重修', b'0');

-- ----------------------------
-- View structure for base_resident_view
-- ----------------------------
DROP VIEW IF EXISTS `base_resident_view`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `base_resident_view` AS SELECT
base_info.student_id,
resident_info.resident_id,
resident_info.`name`,
resident_info.gender,
resident_info.native_place,
resident_info.borth_date,
resident_info.nation,
resident_info.minority,
resident_info.political_face,
resident_info.resident_type
FROM
base_info
INNER JOIN resident_info ON base_info.resident_id = resident_info.resident_id ; ;

-- ----------------------------
-- View structure for view_final_exam
-- ----------------------------
DROP VIEW IF EXISTS `view_final_exam`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_final_exam` AS SELECT
final_exam_info.statue,
final_exam_info.final_exam_time,
final_exam_info.final_exam_place,
final_exam_info.final_exam_section,
final_exam_info.final_exam_Invigilator,
final_exam_info.final_exam_type,
course_info.course_name,
student_info.student_id,
student_info.college,
student_info.major,
student_info.department,
student_info.classes,
select_course_info.course_term,
select_course_info.course_year,
course_info.course_credit
FROM
course_info
INNER JOIN final_exam_info ON final_exam_info.course_id = course_info.course_id
INNER JOIN select_course_info ON select_course_info.course_id = course_info.course_id
INNER JOIN student_info ON final_exam_info.student_id = student_info.student_id AND select_course_info.student_id = student_info.student_id ;

-- ----------------------------
-- View structure for view_second_exam
-- ----------------------------
DROP VIEW IF EXISTS `view_second_exam`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_second_exam` AS SELECT
course_info.course_name,
course_info.course_type,
select_course_info.course_term,
select_course_info.course_year,
student_info.student_id,
exam_second_info.statue,
exam_second_info.exam_second_time,
exam_second_info.exam_second_place,
exam_second_info.exam_second_section,
exam_second_info.exam_second_Invigilator,
exam_second_info.exam_second_type
FROM
course_info
INNER JOIN exam_second_info ON exam_second_info.course_id = course_info.course_id
INNER JOIN select_course_info ON select_course_info.course_id = course_info.course_id
INNER JOIN student_info ON exam_second_info.student_id = student_info.student_id AND select_course_info.student_id = student_info.student_id ;

-- ----------------------------
-- View structure for view_select_course
-- ----------------------------
DROP VIEW IF EXISTS `view_select_course`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_select_course` AS SELECT
select_course_info.id,
select_course_info.student_id,
course_info.course_id,
course_info.course_name,
course_info.course_place,
course_info.course_teacher,
course_info.course_week,
course_info.course_section,
course_info.course_cycle,
course_info.course_credit,
select_course_info.course_term,
select_course_info.course_year,
course_info.course_type,
select_course_info.course_score,
select_course_info.course_score_second
FROM
select_course_info
INNER JOIN course_info ON select_course_info.course_id = course_info.course_id ;

SET FOREIGN_KEY_CHECKS = 1;
