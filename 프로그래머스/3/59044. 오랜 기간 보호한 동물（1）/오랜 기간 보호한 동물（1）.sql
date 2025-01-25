-- 코드를 입력하세요
SELECT a.name, a.datetime
from ( select animal_id, name, datetime from animal_ins order by datetime) a
where a.animal_id not in (select animal_id from animal_outs)
and rownum <= 3