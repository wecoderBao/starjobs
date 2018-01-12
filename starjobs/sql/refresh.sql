create table company_refresh(
	id int(11) not null auto_increment primary key,
	com_id int(11) comment '公司id'，
	create_time datetime comment '创建时间',
	refresh_cost decimal(18,2) default '0.00' comment'费用'
	
)ENGINE=InnoDB DEFAULT CHARSET=utf8;