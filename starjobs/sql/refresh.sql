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

drop table if exists balance_history;

create table balance_history(
	id int(11) not null auto_increment primary key,
	create_time datetime comment '创建时间',
	cost decimal(18,2) default '0.00' comment'费用',
	cost_type tinyint(2) unsigned default '1' comment'消费类型，1发布，2推广，3刷新，4充值，5，提现',
	trade_no varchar(200) default null comment '订单编号',
	phone varchar(200) default null comment '用户手机号'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='余额变动历史表';

drop table if exists order_form;
create table order_form(
	id int(11) not null auto_increment primary key,
	create_time datetime comment '创建时间',
	cashnum decimal(18,2) default '0.00' comment '金额',
	phone varchar(200) default null comment '用户手机号',
	trade_no varchar(200) default null comment '订单编号',
	status varchar(200) default "0" comment '订单状态',
	activity_flag varchar(200) default '0' comment'活动标志，0 没有活动'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='订单表';

drop table if exists charge_activity;
create table charge_activity(
	id int(11) not null auto_increment primary key,
	create_time datetime comment '创建时间',
	cashnum decimal(18,2) default '0.00' comment '金额',
	activity_desc varchar(200) default '' comment '活动描述'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='充值活动表';

insert into charge_activity(id,cashnum,activity_desc)
values(1,'100','100送10'),(2,'200','200送30'),(3,'500','500送80'),
	(4,'1000','1000送200'),(5,'2000','2000送500'),(6,'5000','5000送1500');
