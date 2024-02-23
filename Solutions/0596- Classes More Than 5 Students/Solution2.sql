with CountTable as (
    select class, COUNT(class) AS count
    from courses
    group by class
) select class from CountTable
where count >= 5;