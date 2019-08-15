# 三目运算 在进行if判断的时候使用一个等于号即可
update user set sex = if(sex='m','f','m');

# 统计连续出现三次的数字
select distinct a.Num ConsecutiveNums
from Logs a,Logs b,Logs c
where a.Num=b.Num and b.Num=c.Num
and a.Id+1=b.Id and b.Id+1=c.Id

#ques197 ,上升的温度,这个使用datediff函数即可
select a.Id as Id from Weather a,Weather b
where a.Temperature>b.Temperature and
DATEDIFF(a.RecordDate,b.RecordDate) = 1;

#ques601,体育馆的人流量 对于这类问题直接使用多个表进行拼接即可
select distinct a.id,a.visit_date,a.people from stadium a,stadium b,stadium c
where (a.id = b.id+1 and a.id = c.id+2 and a.people>=100 and b.people >=100
       and c.people>=100)
       or (a.id = b.id - 1 and a.id = c.id - 2 and a.people>=100 and b.people >=100
       and c.people>=100)
       or (a.id = b.id + 1 and a.id = c.id - 1 and a.people>=100 and b.people >=100
       and c.people>=100)

       order by a.id;
