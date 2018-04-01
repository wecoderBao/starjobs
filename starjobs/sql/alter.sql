---modify user_info table

alter table t_user_info add  c_user_desc text COMMENT '个人简介';

alter table t_user_info add  c_user_doneTimes varchar(255) DEFAULT "0" COMMENT '兼职次数';

alter table t_user_info modify column c_user_score varchar(255);

alter table t_user_info modify column c_user_balance varchar(255);

alter table t_user_info modify column c_user_birth_date varchar(255);

----modify com_info table

alter table t_company_info add c_com_hasLicense varchar(255) default '0' comment '是否上传营业证标志，0没有上传，1上传';

alter table t_company_info modify column c_com_balance varchar(255);

alter table t_company_info modify column c_com_score varchar(255);

alter table t_company_info modify column c_extra_balance varchar(255);