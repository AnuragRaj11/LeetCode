# Write your MySQL query statement below
select substr(trans_date,1,7) month,country,
count(distinct id) trans_count,
count(distinct case when state='approved' then id else null end ) approved_count,
sum(amount) trans_total_amount,
sum( case when state='approved' then amount else 0 end) approved_total_amount
from Transactions group by 1,2
order by 1