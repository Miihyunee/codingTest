select flavor from (
select flavor, sum(total_order)
    from (
        select flavor, sum(total_order) as total_order from july
        group by flavor
        union
        select flavor, total_order from first_half
    )
    group by flavor
    order by sum(total_order) desc
    )
   where rownum < 4