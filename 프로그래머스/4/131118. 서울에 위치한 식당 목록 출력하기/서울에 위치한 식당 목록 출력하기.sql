-- 코드를 입력하세요
select r.rest_id, rest_name, food_type, favorites, address, score
from rest_info r, 
(
select rest_id, round(avg(review_score),2) as score
from rest_review
group by rest_id
) v
where r.rest_id = v.rest_id
and address like '서울%'
order by score desc, favorites desc