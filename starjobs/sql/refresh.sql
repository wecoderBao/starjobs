create table refresh_job(
	id int(11) not null auto_increment primary key,
	com_id int(11) comment '公司id',
	create_time datetime comment '创建时间',
	refresh_cost decimal(18,2) default '0.00' comment'费用',
	constraint fk_com_id foreign key (com_id) references t_company_info (c_com_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;