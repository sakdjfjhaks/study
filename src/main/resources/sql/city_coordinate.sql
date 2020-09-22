create table city_coordinate
(
    city_id     bigint         not null
        primary key,
    city_name   varchar(20)    null,
    city_lat    decimal(10, 7) null,
    city_lon    decimal(10, 7) null,
    create_time datetime       null
);