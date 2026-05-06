# Write your MySQL query statement below
select Department,Employee,Salary from (
select d.name as Department, e.name as Employee,e.salary as Salary, dense_rank() over(partition by e.departmentid order by e.salary desc) as ranks
from employee e left join department d
on e.departmentid=d.id
)t
where ranks<=3; 