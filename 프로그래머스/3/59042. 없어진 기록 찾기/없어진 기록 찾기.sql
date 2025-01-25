-- 코드를 입력하세요
select animal_id, name 
from animal_outs
where animal_id in (
select animal_id
from animal_outs 
minus
select animal_id
from animal_ins
    )
    order by animal_id