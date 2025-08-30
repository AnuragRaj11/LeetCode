# Write your MySQL query statement below
select person_name from Queue where turn=(select max(turn) from
(select case when sum(weight) over (order by turn) <=1000 then turn end as turn
from queue))