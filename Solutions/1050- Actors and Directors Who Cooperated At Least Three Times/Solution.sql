select actor_id, director_id from ActorDirector
group by (actor_id, director_id)
having COUNT(actor_id) > 2