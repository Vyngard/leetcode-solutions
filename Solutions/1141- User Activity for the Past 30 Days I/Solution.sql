SELECT activity_date AS day, COUNT(distinct user_id) AS active_users
FROM activity
WHERE activity_date <= '2019-07-27' AND '2019-07-27' - activity_date < 30
GROUP BY activity_date