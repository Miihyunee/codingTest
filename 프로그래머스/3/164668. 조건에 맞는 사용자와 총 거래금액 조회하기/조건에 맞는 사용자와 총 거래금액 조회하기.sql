-- 코드를 입력하세요
select u.user_id, nickname, a.total_sales 
from (
select writer_id, sum(price) as total_sales
from used_goods_board
where status = 'DONE'
group by writer_id
) a , used_goods_user u
where a.total_sales >= 700000
and a.writer_id = u.user_id
order by a.total_sales