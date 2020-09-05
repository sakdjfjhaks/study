create table if not exists shop
(
	shop_id bigint null,
	user_id bigint null,
	sys_user_id bigint null,
	shop_type int null,
	shop_title tinytext null,
	shop_description varchar(512) null,
	shop_url varchar(512) null,
	shop_name tinytext null,
	shop_price decimal(10,2) null,
	shop_technical_fee decimal(10,2) null,
	shop_sale_bond decimal(10,2) null,
	shop_general_deduct_points decimal(3,1) null,
	shop_serious_deduct_points decimal(3,1) null,
	shop_fake_deduct_points decimal(3,1) null,
	shop_certificate int null,
	provide_identity_card int null,
	provide_personal_photo int null,
	provide_hand_identity_card int null,
	provide_household_register int null,
	shop_state int null,
	creator bigint null,
	create_time timestamp null,
	modify_time timestamp null,
	modifyor bigint null,
	old_or_new int null
)
comment '网店发布';

