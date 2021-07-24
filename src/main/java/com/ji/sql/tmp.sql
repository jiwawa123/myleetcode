# 查询供应商数量大于5个的工程的工程编码和零件供应总数量 QTY是零件供应数量
select pnum, sum(QTY) from scp
group by pnum having distinct(snum) > 5;
