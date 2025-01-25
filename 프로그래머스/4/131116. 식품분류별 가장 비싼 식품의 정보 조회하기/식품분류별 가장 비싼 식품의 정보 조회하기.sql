select f.category, f.price as max_price, product_name
from (
    SELECT category, max(price) as price
    from food_product
        where category in ('과자', '국', '김치', '식용유')
    group by category
        ) f , food_product p
    where (f.category = p.category and f.price=p.price)
order by max_price desc