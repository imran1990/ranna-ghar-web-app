CREATE TABLE IF NOT EXISTS tbl_employee (
   uuid varchar primary key,
   first_name varchar,
   last_name varchar,
   email varchar,
   age integer,
   gender varchar,
   city_uuid varchar
);

CREATE TABLE IF NOT EXISTS tbl_city (
   uuid varchar primary key,
   city_code varchar,
   city_name varchar
);

ALTER TABLE tbl_employee
    ADD CONSTRAINT fk_employee_city FOREIGN KEY (city_uuid) REFERENCES tbl_city (uuid);
    
    
select e.uuid,e.first_name,e.last_name,e.email,e.age,e.gender,c.city_name
from tbl_employee e, tbl_city c
where e.city_uuid = c.uuid
and c.city_name ilike '%?%' ;