select ('/home/grep/src/' || f.board_id || '/' || file_id || file_name || file_ext) as file_path
from used_goods_board b, used_goods_file f
where b.board_id = f.board_id
and b.views = (select max(views) from used_goods_board) 
order by file_id desc