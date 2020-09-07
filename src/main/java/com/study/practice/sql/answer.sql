create table if not exists answer
(
	answer_id bigint null,
	ask_id bigint null,
	customer_id bigint null,
	customer_nick_name tinytext null,
	customer_avatar tinytext null,
	customer_sign varchar(256) null,
	answer_content mediumtext null,
	creator bigint null,
	create_time timestamp null,
	modify_time timestamp null,
	modifyor bigint null,
	delete_state int null
)
comment '回答';
