select a.product_id, z.product_name, (cnt*price) as total_sales
from (
    select f.product_id , product_name, sum(amount) as cnt
    from food_product f, food_order o
    where f.product_id = o.product_id
    and to_char(PRODUCE_DATE, 'YYYY-MM') = '2022-05'
    group by f.product_id, product_name
    ) a , food_product z
where a.product_id = z.product_id
order by total_sales desc, a.product_id