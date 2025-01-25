select a.food_type, rest_id, rest_name, i.favorites
from (
        select food_type, max(favorites) as fav
        from rest_info
        group by food_type
    ) a , rest_info i
    where (a.food_type = i.food_type and a.fav = i.favorites)
    order by food_type desc