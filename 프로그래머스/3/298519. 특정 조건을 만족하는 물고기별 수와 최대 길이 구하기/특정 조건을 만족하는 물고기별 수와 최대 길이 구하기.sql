select count(a.FISH_TYPE) as FISH_COUNT, max(length) as MAX_LENGTH, a.FISH_TYPE 
    from (select z.FISH_TYPE 
            from (select FISH_TYPE, 
                    case when length is null then 10
                    else length
                    end length
                from FISH_INFO) z
                group by z.FISH_TYPE
                having avg(length) >= 33) a
            , FISH_INFO t
                where a.FISH_TYPE = t.FISH_TYPE
                group by a.FISH_TYPE
                order by a.FISH_TYPE