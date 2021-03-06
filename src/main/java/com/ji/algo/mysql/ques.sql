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
#1069.销售分析II
select product_id,sum(quantity) as total_quantity from Sales group by product_id;

#ques511.游戏分析 获取每一个用户的第一次登陆时间
select player_id,min(first_login) from Activity group by player_id;

#ques512 Game Play Analysis II
select player_id,min(first_login),device_id from Activity group by player_id;

#577.Employee Bonus
select name,bonus from Employee e left join Bonus b on e.empId = b.empId
where bonus < 1000;

#584.Find Customer Referee
select name from customer where referee_id !=2;


#586.Customer Placing the Largest Number of Orders
select count(*) as count  ,customer_number from orders where
count = (select max(count) from (select max (count(*) as count) from orders group by customer_number) as a)
group by  customer_number;

#574.Winning Candidate
select name from person where id in (select vote from (select max(count) ,vote from (select count(*) as count ,vote from ques57 group  by vote) as a) b);