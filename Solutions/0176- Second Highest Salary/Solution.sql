-- solution 1
with RankedSalary as (
    select distinct salary from Employee
    order by salary desc
    limit 1 
    offset 1
)
select COALESCE((select salary from RankedSalary), NULL) as SecondHighestSalary


-- solution 2
select (
    select distinct salary from Employee
    order by salary desc
    limit 1 
    offset 1
) as SecondHighestSalary
