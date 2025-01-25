--01064534911
select user_id, nickname
    , city || ' ' || street_address1 || ' ' || street_address2 as "전체주소"
    , substr(tlno,0,3) || '-' || substr(tlno, 4, 4) || '-' || substr(tlno, 8,12) as "전화번호"
    from (
        select writer_id, count(writer_id) as cnt
        from used_goods_board
        group by writer_id 
        having count(writer_id) >= 3
        ) a, used_goods_user u
    where a.writer_id = u.user_id
    order by user_id desc