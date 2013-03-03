# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table store (
  id                        bigint not null,
  name                      varchar(255),
  city                      varchar(255),
  constraint pk_store primary key (id))
;

create sequence store_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists store;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists store_seq;

