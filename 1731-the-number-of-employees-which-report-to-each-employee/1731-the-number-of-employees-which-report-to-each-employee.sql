# Write your MySQL query statement below
select e.employee_id,e.name,
count(r.reports_to) as reports_count,round(avg(r.age)) as average_age
from Employees e,Employees  as r
WHERE E.employee_id = r.reports_to
group by e.employee_id order by employee_id