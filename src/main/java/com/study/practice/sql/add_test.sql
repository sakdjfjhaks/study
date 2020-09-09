create table if not exists add_test
(
	add_test_id bigint not null
		primary key,
	add_test_name varchar(20) null,
	add_test_lat decimal(10,7) null,
	add_test_lon decimal(10,7) null,
	`create-time` datetime null
);

create procedure delete_add_test_data()
begin
    declare i int default 0;
    while  i<100000 do
        delete from add_test where true limit 1000;
        end while;
end;
call delete_add_test_data();
drop procedure delete_add_test_data;