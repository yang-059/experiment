## 班级：G201  学号：2020322059  姓名：杨一博  实验名称：学生选课系统模拟（experiment）
实验三 学生选课系统
## 实验目的
+ 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
+ 掌握面向对象的类设计方法（属性、方法）；
+ 掌握类的继承用法，通过构造方法实例化对象；
+ 学会使用super()，用于实例化子类；
+ 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
## 业务要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
+ 对象示例：	人员（编号、姓名、性别……）
  - 教师（编号、姓名、性别、所授课程、……）
  - 学生（编号、姓名、性别、所选课程、……）
  - 课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展。
## 实验要求
1. 编写上述实体类以及测试主类（注意类之间继承关系的适用）
2. 在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
3. 编写实验报告。
*要求有实验目的、要求、过程、流程图、核心代码、注释、系统运行截图、编程感想等，分章节罗列，不能在实验报告中粘帖大段代码*
## 过程
1. 根据实验要求确定类及对象；
2. 根据对应关系等建立UML图；
3. 编写各类并测试。
## 流程图
![](https://github.com/yang-059/experiment/blob/main/elective%20UML图.PNG)
## 核心代码
1. 继承
```
class teacher extends personnal{}     //子类继承父类
```
2. 判断
```
		if (s1.getXuanke().cno==01) {         //判断是否可选课
			System.out.println("此课已满，请选择其他课程。\n");
			System.out.println(s1);
		    System.out.println("其他可选课程：\n"+p1);		
		}else {
			System.out.println("选课成功！\n");
			System.out.println(s1);
			System.out.println(c1);
		}
```
3. toString
```
	course(int cno,String conrse,String teacher,String didian){          //通过构造方法获取各信息
		this.cno=cno;
		this.conrse=conrse;
		this.teacher=teacher;
		this.didian=didian;
	}
	public String toString() {						//通过toString输出相应信息
		return "课程编号："+cno+"  课程名称:"+conrse+"  授课教师："+teacher+"  上课地点："+didian;
	}
```
## 运行结果
![](https://github.com/yang-059/experiment/blob/main/elective运行结果.PNG)
## 编程感想
此次试验通过对toString（）和继承的使用，较之前更掌握了两种信息输入输出的方法；另外，对于github的使用方式有了更进一步的学习。
