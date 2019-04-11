create sequence hibernate_sequence start with 1 increment by 1
create table blob_storage (id integer not null, xml blob, primary key (id))
create table city (id binary(255) not null, name varchar(255), population integer, province_id binary(255), primary key (id))
create table country (id binary(255) not null, code varchar(255), name varchar(255), primary key (id))
create table province (id binary(255) not null, code varchar(255), name varchar(255), country_id binary(255), primary key (id))
alter table city add constraint FKll21eddgtrjc9f40ueeouyr8f foreign key (province_id) references province
alter table province add constraint FKipakwfceswwc0lb3esew9hqqv foreign key (country_id) references country

create table country_type (id varchar(1), primary key(id))
insert into country_type VALUES ('A')
insert into country_type VALUES ('B')
insert into country_type VALUES ('C')

-- alter table country add constraint aaaaaaaaa foreign key (code) references country_type
