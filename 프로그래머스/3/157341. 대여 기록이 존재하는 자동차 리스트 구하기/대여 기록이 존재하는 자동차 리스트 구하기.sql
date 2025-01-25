-- 코드를 입력하세요
SELECT distinct c.car_id
from car_rental_company_car c, car_rental_company_rental_history h
where car_type = '세단'
and c.car_id = h.car_id
and to_char(start_date, 'YYYY-MM') = '2022-10'
order by car_id desc