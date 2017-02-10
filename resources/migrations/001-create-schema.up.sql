create table test (
  id              integer,
  string_column   varchar,
  number_column   integer,
  date_column     date,
  keyword_column  varchar
);

create sequence test_id_seq
  start with 1
  increment by 1
  no minvalue
  no maxvalue
  cache 1;

alter sequence test_id_seq owned by test.id;
