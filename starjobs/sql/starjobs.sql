/*
SQLyog Trial v12.01 (64 bit)
MySQL - 5.7.16 : Database - starjobs
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`starjobs` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `starjobs`;

/*Table structure for table `city` */

DROP TABLE IF EXISTS `city`;

CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(50) NOT NULL DEFAULT '' COMMENT '行政代码',
  `name` varchar(255) NOT NULL DEFAULT '' COMMENT '名称',
  `parent_id` int(11) NOT NULL COMMENT '父id',
  `first_letter` varchar(10) NOT NULL DEFAULT '' COMMENT '首字母',
  `level` int(8) NOT NULL COMMENT '城市等级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `t_admin`;

CREATE TABLE `t_admin` (
  `c_admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_admin_name` varchar(255) DEFAULT NULL,
  `c_admin_password` varchar(255) DEFAULT NULL,
  `c_admin_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`c_admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;



insert  into `t_admin`(`c_admin_id`,`c_admin_name`,`c_admin_password`,`c_admin_desc`) values (1,'nihao','202cb962ac59075b964b07152d234b70',NULL);



DROP TABLE IF EXISTS `t_com_address`;

CREATE TABLE `t_com_address` (
  `c_com_address_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '地址ID',
  `c_province` varchar(255) DEFAULT NULL COMMENT '省',
  `c_city` varchar(255) DEFAULT NULL COMMENT '市',
  `c_town` varchar(255) DEFAULT NULL COMMENT '区县',
  `c_address_detail` text COMMENT '详细地址',
  PRIMARY KEY (`c_com_address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `t_company_info`;

CREATE TABLE `t_company_info` (
  `c_com_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `c_com_phone` varchar(255) DEFAULT NULL COMMENT '手机号',
  `c_com_password` varchar(255) DEFAULT NULL COMMENT '密码',
  `c_com_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `c_com_balance` varchar(255) DEFAULT '0' COMMENT '公司账户余额',
  `c_com_ali_account` varchar(255) DEFAULT '0' COMMENT '支付宝账号',
  `c_com_score` varchar(255) DEFAULT '0' COMMENT '公司测评分',
  `c_com_head_img` varchar(255) DEFAULT 'default.png' COMMENT '公司头像',
  `c_com_address_id` int(255) DEFAULT NULL COMMENT '公司地址id分开省市区，详细地址',
  `c_com_desc` text COMMENT '公司简介',
  `c_com_license_img` varchar(255) DEFAULT NULL COMMENT '营业执照图片图片链接',
  `c_extra_balance` varchar(255) default '0' comment '招聘专用余额',
  `c_user_state` varchar(2) DEFAULT '0' COMMENT '公司状态0，待审核，1，活的，2，取消发布权限',
  `c_com_hasLicense` varchar(255) DEFAULT '0' COMMENT '是否上传营业证标志，0没有上传，1上传',
  PRIMARY KEY (`c_com_id`),
  KEY `FK_c_com_address_id` (`c_com_address_id`),
  CONSTRAINT `FK_c_com_address_id` FOREIGN KEY (`c_com_address_id`) REFERENCES `t_com_address` (`c_com_address_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `t_job_choice`;

CREATE TABLE `t_job_choice` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(255) DEFAULT NULL COMMENT '条件代码	varchar(255)，唯一约束',
  `name` varchar(255) DEFAULT NULL COMMENT '条件名称',
  `desc` varchar(255) DEFAULT NULL COMMENT '描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `t_job_type`;

CREATE TABLE `t_job_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `code` varchar(255) DEFAULT NULL COMMENT '类型代码	varchar(255)，唯一约束',
  `name` varchar(255) DEFAULT NULL COMMENT '类型名称',
  `desc` varchar(255) DEFAULT NULL COMMENT '描述信息',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_location`;

CREATE TABLE `t_location` (
  `c_location_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_location_longitude` varchar(255) DEFAULT NULL,
  `c_location_latitude` varchar(255) DEFAULT NULL,
  `c_location_name` varchar(255) DEFAULT NULL,
  `c_location_type` varchar(2) DEFAULT NULL,
  `c_location_desc` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`c_location_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_job_info`;

CREATE TABLE `t_job_info` (
  `c_job_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'Id	主键',
  `c_com_id` int(11) DEFAULT NULL COMMENT '信息发布者id	外键/即公司主键',
  `c_job_city` varchar(255) DEFAULT NULL COMMENT '城市名字',
  `c_job_area` varchar(255) DEFAULT NULL COMMENT '所在区域名字',
  `c_job_position` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `c_job_type_id` int(11) DEFAULT NULL COMMENT '兼职类型',
  `c_job_publish_date` datetime DEFAULT NULL COMMENT '发布日期',
  `c_job_work_date` varchar(255) DEFAULT NULL COMMENT '兼职工作日期',
  `c_job_work_time` varchar(255) DEFAULT NULL COMMENT '每天工作时间',
  `c_job_gather_time` varchar(255) DEFAULT NULL COMMENT '集合时间',
  `c_job_gather_location_id` int(11) DEFAULT NULL COMMENT '集合地点id	地理位置表，外键',
  `c_job_title` varchar(255) DEFAULT NULL COMMENT '兼职名称',
  `c_job_location_id` int(11) DEFAULT NULL COMMENT '兼职地点坐标id	位置坐标表，外键',
  `c_job_salary` varchar(255) DEFAULT NULL COMMENT '薪资待遇',
  `c_job_pay_method` varchar(255) DEFAULT NULL COMMENT '结算方式	日结等',
  `c_job_choice_op_id` int(11) DEFAULT NULL COMMENT '筛序条件	暑假、周日等',
  `c_job_total_person` int(20) DEFAULT NULL COMMENT '招聘人数',
  `c_job_person_gender` varchar(255) DEFAULT NULL COMMENT '性别要求	男女、或不限',
  `c_job_desc` text COMMENT '职位描述',
  `c_job_state` varchar(255) DEFAULT NULL COMMENT '信息状态	0：进行中；1、结束，2，待审核3,删除',
  ‘c_user_like' int(11) default 0 comment '查看次数',
  PRIMARY KEY (`c_job_id`),
  KEY `fk_c_com_id` (`c_com_id`),
  KEY `fk_c_job_location_id` (`c_job_location_id`),
  KEY `fkc_job_gather_location_id` (`c_job_gather_location_id`),
  KEY `fkc_job_type_id` (`c_job_type_id`),
  KEY `fkc_job_choice_op_id` (`c_job_choice_op_id`),
  CONSTRAINT `fk_c_com_id` FOREIGN KEY (`c_com_id`) REFERENCES `t_company_info` (`c_com_id`),
  CONSTRAINT `fk_c_job_location_id` FOREIGN KEY (`c_job_location_id`) REFERENCES `t_location` (`c_location_id`),
  CONSTRAINT `fkc_job_choice_op_id` FOREIGN KEY (`c_job_choice_op_id`) REFERENCES `t_job_choice` (`id`),
  CONSTRAINT `fkc_job_gather_location_id` FOREIGN KEY (`c_job_gather_location_id`) REFERENCES `t_location` (`c_location_id`),
  CONSTRAINT `fkc_job_type_id` FOREIGN KEY (`c_job_type_id`) REFERENCES `t_job_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;








DROP TABLE IF EXISTS `t_user_info`;

CREATE TABLE `t_user_info` (
  `c_user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_user_phone` varchar(255) DEFAULT NULL COMMENT '用户手机号',
  `c_user_password` varchar(255) DEFAULT NULL COMMENT '密码',
  `c_user_nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `c_username` varchar(255) DEFAULT NULL COMMENT '用户姓名',
  `c_user_ali_account` varchar(255) DEFAULT NULL COMMENT '支付宝账号',
  `c_user_gender` varchar(255) DEFAULT NULL COMMENT '性别',
  `c_user_birth_date` varchar(255) DEFAULT '1990-01-01' COMMENT '出生日期',
  `c_user_height` varchar(50) DEFAULT NULL COMMENT '身高',
  `c_user_edu_state` varchar(255) DEFAULT NULL COMMENT '教育状况已毕业/在读',
  `c_user_school_name` varchar(255) DEFAULT NULL COMMENT '学校名字',
  `c_user_balance` varchar(255) DEFAULT "0" COMMENT '用户余额',
  `c_user_score` varchar(255) DEFAULT "0" COMMENT '用户测评分',
  `c_user_img` varchar(255) DEFAULT 'default.png' COMMENT '用户头像',
  `c_user_state` varchar(2) DEFAULT NULL COMMENT '用户状态',
  `c_user_desc` text COMMENT '个人简介',
  `c_user_doneTimes` varchar(255) DEFAULT "0" COMMENT '兼职次数',
  PRIMARY KEY (`c_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `t_user_job_apply`;

CREATE TABLE `t_user_job_apply` (
  `c_apply_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_user_id` int(11) DEFAULT NULL COMMENT '用户id	外键',
  `c_job_id` int(11) DEFAULT NULL COMMENT '职位id	外键',
  `c_apply_time` datetime DEFAULT NULL COMMENT '申请时间',
  `c_apply_state` varchar(2) DEFAULT NULL COMMENT '申请状态	0，通过，1，未通过',
  `c_apply_desc` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`c_apply_id`),
  KEY `fk_c_user_id` (`c_user_id`),
  KEY `fk_c_job_id` (`c_job_id`),
  CONSTRAINT `fk_c_job_id` FOREIGN KEY (`c_job_id`) REFERENCES `t_job_info` (`c_job_id`),
  CONSTRAINT `fk_c_user_id` FOREIGN KEY (`c_user_id`) REFERENCES `t_user_info` (`c_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `t_user_recharge`;

CREATE TABLE `t_user_recharge` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录表id	主键',
  `user_phone` varchar(255) DEFAULT NULL COMMENT '用户手机号',
  `recharge_money` decimal(18,2) DEFAULT NULL COMMENT '充值金额',
  `create_time` datetime DEFAULT NULL COMMENT '充值日期',
  `trade_no` varchar(255) DEFAULT NULL COMMENT '订单号',
   status int default 0 comment '充值记录状态0生成，1操作完成',
`balance` decimal(18,2) DEFAULT NULL COMMENT '充值后余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `t_user_token`;

CREATE TABLE `t_user_token` (
  `c_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_token_value` varchar(255) DEFAULT NULL COMMENT 'Token值',
  `c_phone_num` varchar(255) DEFAULT NULL COMMENT '用户手机号	外键',
  `c_create_time` datetime DEFAULT NULL COMMENT '记录创建时间',
  `c_token_expire` int(20) DEFAULT NULL COMMENT 'Token失效时间',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `t_user_withdraw`;

CREATE TABLE `t_user_withdraw` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '记录表id',
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `withdraw_money` decimal(18,2) DEFAULT NULL COMMENT '提现金额',
  `create_time` datetime DEFAULT NULL COMMENT '提现日期',
  `balance` decimal(18,2) DEFAULT NULL COMMENT '提现后用户余额',
  status tinyint unsigned default null comment '提现状态1申请2已提现0取消提现',
  PRIMARY KEY (`id`),
  KEY `fk_user` (`user_id`),
  CONSTRAINT `fk_user` FOREIGN KEY (`user_id`) REFERENCES `t_user_info` (`c_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



DROP TABLE IF EXISTS `t_withdraw_verify`;

CREATE TABLE `t_withdraw_verify` (
  `c_verify_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_user_id` int(11) DEFAULT NULL COMMENT '学生用户id',
  `c_withdraw_money` int(11) DEFAULT NULL COMMENT '提现金额',
  `c_user_ali_account` varchar(255) DEFAULT NULL COMMENT '支付宝账号',
  `c_verify_state` varchar(2) DEFAULT NULL COMMENT '审核状态	0：审核通过1：待审核，',
  PRIMARY KEY (`c_verify_id`),
  KEY `c_user_id` (`c_user_id`),
  CONSTRAINT `c_user_id` FOREIGN KEY (`c_user_id`) REFERENCES `t_user_info` (`c_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_friend`;

CREATE TABLE `t_friend` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_uid` varchar(255) DEFAULT NULL COMMENT '用户标识',
  `c_fid` varchar(255) DEFAULT NULL COMMENT '好友标识',
  `c_state` varchar(255) DEFAULT '0' COMMENT '关系状态0陌生人，手机号请求待确认，2好友'
   primary key (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_group`;

CREATE TABLE `t_group` (
  `c_group_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_group_creater_id` varchar(255) DEFAULT NULL COMMENT '创建者标识，手机号',
  `c_group_head_img` varchar(255) DEFAULT NULL COMMENT '群组头像url',
  `c_group_name` varchar(255) DEFAULT NULL COMMENT '群组昵称',
  `c_group_statu` varchar(255) DEFAULT NULL COMMENT '群组状态标识0活的1失效',
  `c_job_id` varchar(255) DEFAULT NULL COMMENT '兼职信息的id',
   primary key (`c_group_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_group_member`;

CREATE TABLE `t_group_member` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_group_id` int(11) NOT NULL  COMMENT 't_group外键',
  `c_group_member_id` varchar(255) DEFAULT NULL COMMENT '群组成员标识，手机号',
  `c_group_member_identity` varchar(255) DEFAULT NULL COMMENT '群组成员身份标识0群主1成员',
   primary key (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_com_score`;

CREATE TABLE `t_com_score` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `c_com_id` int(11) NOT NULL  COMMENT 't_company_info外键',
  `c_total_user` int(10) DEFAULT NULL COMMENT '评分人数',
  `c_total_score` int(10) DEFAULT NULL COMMENT '总得分',
   primary key (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `t_system`;

CREATE TABLE `t_system` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL  COMMENT '键',
  `value` varchar(255) DEFAULT NULL COMMENT '值',
  `extra_desc` varchar(255) DEFAULT NULL COMMENT '描述',
   primary key (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
insert into t_system(name,value) values('ios_version', '1.0.0'),('android_version','1.0.0');


drop table if exists t_feedback;
create table t_feedback(
	id int(11) primary key auto_increment comment '主键',
	phone varchar(255) default null comment '用户手机号',
	pic_one varchar(255) default null comment '截图1',
	pic_tow varchar(255) default null comment '截图2',
	pic_three varchar(255) default null comment '截图3',
	content varchar(255) default null comment '反馈内容',
	create_time datetime default null comment '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_withdraw_verify` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
