create table if not exists add_test
(
	add_test_id bigint not null
		primary key,
	add_test_name varchar(20) null,
	add_test_lat decimal(10,7) null,
	add_test_lon decimal(10,7) null,
	`create-time` datetime null
);