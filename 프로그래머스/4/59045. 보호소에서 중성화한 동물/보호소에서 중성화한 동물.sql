-- 코드를 입력하세요
select i.animal_id, i.animal_type, o.name
from 
(select *
from animal_outs
where (sex_upon_outcome like '%Spayed%' or sex_upon_outcome like '%Neutered%')
) i,
(
SELECT *
from animal_ins 
where sex_upon_intake like '%Intact%'
    ) o
    where i.animal_id = o.animal_id