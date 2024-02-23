SELECT
    customer_number
FROM orders
GROUP BY customer_number
order by count(customer_number) desc
limit 1;