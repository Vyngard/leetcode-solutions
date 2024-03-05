-- Solution 1
alter table triangle
add column triangle VARCHAR(255) default 'No';

update triangle
set triangle = 'Yes'
where x + y > z
and x + z > y
and y + z > x;

select * from triangle;

-- Solution 2
select *,
case when x + y > z
and x + z > y
and y + z > x then 'Yes'
else 'No'
end triangle
from triangle;