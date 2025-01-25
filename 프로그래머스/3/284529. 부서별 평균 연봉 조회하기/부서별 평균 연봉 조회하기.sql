select d.DEPT_ID, d.DEPT_NAME_EN, round(avg(SAL),0) as AVG_SAL
    from HR_DEPARTMENT d, HR_EMPLOYEES  e
    where d.DEPT_ID = e.DEPT_ID
    group by d.DEPT_ID, d.DEPT_NAME_EN
    order by avg(SAL) desc