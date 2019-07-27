# 三目运算 在进行if判断的时候使用一个等于号即可
update user set sex = if(sex='m','f','m');

# 统计连续出现三次的数字
select distinct a.Num ConsecutiveNums
from Logs a,Logs b,Logs c
where a.Num=b.Num and b.Num=c.Num
and a.Id+1=b.Id and b.Id+1=c.Id
