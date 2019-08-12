#业务背景
唐家有一家开了十年的电影租赁小店
老板看到最近互联网迅猛发展，突然有个想法要做在线租赁商店

小店之前有一个用了十年的系统, 是老板业余时间自己开发的.

在类Customer下有一个方法statement， 用来打印客人的租赁小票

Rental Record for Jerry<br>
&nbsp;&nbsp;&nbsp;&nbsp;Titanic	1.5<br>
Amount owed is 1.5<br>
You earned 1 frequent renter points<br>

请在类Customer中添加新的方法htmlStatement, 让系统能用html的格式打出租赁小票详情。
比如：
```
<H1>Rentals for <EM>Jerry</EM></H1><P>
Roman Holiday: 3.0<BR>
Titanic: 3.0<BR>
<P>You owe<EM>6.0</EM><P>
On this rental you earned <EM>2</EM> frequent renter points<P>
```
要求
1. 重构Customer中Statement方法
2. 重构之前先为已有代码添加测试
3. 小步提交，每次提交说明动机和手法

#进阶
如果完成了以html格式打印小票的任务，请再完成以下要求<br>
老板发现近期文艺片越来越多，买了一大批文艺片。<br>
请在代码中加入文艺片的种类，租一个文艺片要收￥6块,但是积分可以增加1.5分<br>