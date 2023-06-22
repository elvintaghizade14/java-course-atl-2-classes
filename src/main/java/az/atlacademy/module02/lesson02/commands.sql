SELECT *
FROM accounts
WHERE user_id != 4
  and username like '%r%';

delete
from accounts
where username is null;

select *
from accounts
order by username desc, password desc;

update accounts
set username = 'Samir'
where username = 'Elvin2';

INSERT INTO accounts(username, password, email)
values ('Ilqar', '365', '3');

update accounts
set password = 548
where user_id = 7;

select user_id, username, password as military_days
from accounts;

select distinct(username)
from accounts
         limit 2;

select *
from accounts
order by password;
select *
from accounts
where password between '1' and '2';
-- select * from accounts where password >= '1' and password <= '2';

select * from accounts where user_id in (2, 3, 4, 6);

select * from accounts;

delete from accounts;

truncate accounts;

drop table accounts;