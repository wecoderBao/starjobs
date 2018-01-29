drop table if exists refresh_job;

create table refresh_job(
	id int(11) not null auto_increment primary key,
	com_id int(11) comment '公司id',
	job_id int(11) comment 'job id',
	create_time datetime comment '创建时间',
	refresh_cost decimal(18,2) default '0.00' comment'费用',
	refresh_type tinyint(2) unsigned default '1' comment'消费类型，1发布，2推广，3刷新',
	constraint fk_com_id foreign key (com_id) references t_company_info (c_com_id),
	constraint fk_job_id foreign key (job_id) references t_job_info (c_job_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

drop table if exists job_apply_restrict;

create table job_apply_restrict(
	id int(11) not null auto_increment primary key comment '主键',
	user_id int(11)  comment '用户id 外键',
	job_id int(11)  comment '职位id外键',
	create_time datetime default null comment '创建时间',
	constraint fk_apply_user_id foreign key (user_id) references t_user_info(c_user_id),
	constraint fk_apply_job_id foreign key (job_id) references t_job_info(c_job_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
