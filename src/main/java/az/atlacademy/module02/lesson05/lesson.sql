select * from students
where pin = 'Abc1234';

select * from phone_numbers
where id = (select phone_number_id from students
            where pin = 'Abc1234');

select * from students s
                  full outer join phone_numbers pn
                                  on s.phone_number_id = pn.id
where s.phone_number_id is null;

select * from students s
                  right join phone_numbers pn
                             on s.phone_number_id = pn.id;

select * from students s
                  inner join phone_numbers pn
                             on pn.id = s.phone_number_id;

select id, name from students
union
select id, phone_number from phone_numbers pn order by id;
