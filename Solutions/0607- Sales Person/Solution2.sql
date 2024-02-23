WITH RedOrders AS (
    SELECT o.com_id, o.sales_id
    FROM orders o
    JOIN company c ON o.com_id = c.com_id
    WHERE c.name = 'RED'
)
SELECT sp.name
FROM salesperson sp
LEFT JOIN RedOrders ro ON sp.sales_id = ro.sales_id
where ro.sales_id is null;