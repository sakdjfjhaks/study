create table if not exists ask
(
	ask_id bigint null,
	customer_id bigint null,
	customer_nick_name tinytext null,
	customer_avatar tinytext null,
	customer_sign varchar(256) null,
	ask_content mediumtext null,
	moments_lat decimal(10,7) null,
	moments_lng decimal(10,7) null,
	address tinytext null,
	short_content varchar(256) null,
	short_picture tinytext null,
	like_num int null,
	visit_num int null,
	answer_num int null,
	creator bigint null,
	create_time timestamp null,
	modify_time timestamp null,
	modifyor bigint null,
	delete_state int null
)
comment '提问' engine=MyISAM;

create fulltext index full_text_content
	on ask (ask_content);