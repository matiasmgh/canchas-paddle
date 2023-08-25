create sequence hibernate_sequence start with 1 increment by 1;
create table Color (codigo bigint not null, descripcion varchar(255), primary key (codigo));
