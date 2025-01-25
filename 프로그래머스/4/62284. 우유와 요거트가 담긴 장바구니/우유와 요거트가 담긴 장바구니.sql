-- 코드를 입력하세요
select * from (
SELECT cart_id 
from cart_products
where name = 'Milk'
) a
where cart_id in (
select cart_id
from cart_products
where name = 'Yogurt')
group by cart_id
order by cart_id