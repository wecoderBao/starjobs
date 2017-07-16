
drop table if exists t_user_like_com;

create table t_user_like_com(
	id int(11) not null auto_increment,
	user_phone varchar(255) not null comment '用户手机号',
	com_phone varchar(255) not null comment '公司手机号',
	like_desc varchar(255) default null comment '描述信息',
	PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

