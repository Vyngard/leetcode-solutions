-- Solution 1
select c.name as Customers 
from customers c 
left join orders o 
on o.customerId = c.id 
where o.customerId is NULL;

-- Solution 2
select name as Customers
from Customers
where
    id not in (
        select customerId
        from Orders
    );