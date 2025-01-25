select a.author_id, AUTHOR_NAME, category, total_sales
from (
    select author_id, category, sum(sales) as total_sales
        from (
            select author_id, category, (price*sales) as sales
                from book b,
                (select book_id, sum(sales) as sales
                    from book_sales
                    where to_char(SALES_DATE, 'YYYY-MM') = '2022-01'
                    group by book_id
                 ) s
                 where b.book_id = s.book_id
                ) group by author_id, category
    ) h, AUTHOR a
    where h.author_id = a.author_id
    order by a.author_id, category desc