select to_char(sales_date, 'YYYY') as YEAR
    , to_number(to_char(sales_date, 'MM')) as MONTH
    , gender
    , count(distinct user_id) as users
from (
    select s.user_id, sales_date, gender
    from online_sale s, user_info i
    where s.user_id = i.user_id
    and gender is not null
    )
group by to_char(sales_date, 'YYYY'), to_char(sales_date, 'MM'), gender
order by to_char(sales_date, 'YYYY'), to_char(sales_date, 'MM'), gender