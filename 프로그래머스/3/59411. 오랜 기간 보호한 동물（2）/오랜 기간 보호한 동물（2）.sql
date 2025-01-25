-- 코드를 입력하세요
select animal_id, name 
from (
select i.animal_id, i.name, trunc(o.datetime - i.datetime) as datetime
from animal_ins i, animal_outs o
where i.animal_id = o.animal_id
order by datetime desc
) 
where rownum < 3