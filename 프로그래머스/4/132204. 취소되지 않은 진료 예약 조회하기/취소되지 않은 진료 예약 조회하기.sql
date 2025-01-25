-- 코드를 입력하세요
SELECT apnt_no, pt_name, p.pt_no, d.mcdp_cd, dr_name, apnt_ymd 
from patient p, doctor d, appointment a
where d.dr_id = a.mddr_id
and p.pt_no = a.pt_no
and to_char(apnt_ymd, 'YYYY-MM-DD') = '2022-04-13'
and apnt_cncl_yn = 'N'
and a.mcdp_cd = 'CS'
order by apnt_ymd