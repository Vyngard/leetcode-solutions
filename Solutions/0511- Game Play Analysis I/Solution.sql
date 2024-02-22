--- Solution 1
SELECT player_id, MIN(event_date) AS first_login
FROM Activity group by player_id;
--- Solution 2
with new_table as (
    select * from activity order by player_id, event_date
) select distinct on (player_id) player_id, event_date as first_login
    from new_table;
