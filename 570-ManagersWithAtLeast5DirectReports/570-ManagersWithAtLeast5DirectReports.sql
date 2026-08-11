-- Last updated: 11/08/2026, 16:05:44
# Write your MySQL query statement below
select e.name 
from Employee e
join Employee  emp  
on e.id = emp.managerId 
group by e.name,e.id
having count(*) > 4 ;