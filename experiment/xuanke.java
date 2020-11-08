package experiment;

public class Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		teacher p1=new teacher("安",123456,"女","数学");
		student s1=new student("生",202001,"男","语文");
		course c1=new course(02,"数学","安","教101");
		course c2=new course(01,"语文","鱼","教102");
		p1.setShouke(c1);
		p1.getShouke();
		s1.setXuanke(c2);
		s1.getXuanke();
		if (s1.getXuanke().cno==01) {
			System.out.println("此课已满，请选择其他课程。\n");
			System.out.println(s1);
		    System.out.println("其他可选课程：\n"+p1);		
		}else {
			System.out.println("选课成功！\n");
			System.out.println(s1);
			System.out.println(c1);
		}
	}

}

/*
实验目的
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
业务要求
说明：学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，
每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
对象示例：	人员（编号、姓名、性别……）
教师（编号、姓名、性别、所授课程、……）
			学生（编号、姓名、性别、所选课程、……）
			课程（编号、课程名称、上课地点、时间、授课教师、……）
以上属性仅为示例，同学们可以自行扩展（黄色背景的文字，不能原篇出现在实验报告中，
需要进一步明确所有的属性）。
实验要求
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）
2.在测试主类中，实例化多个类实体，模拟学生选课操作、
打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；
模拟学生退课操作，再打印课程信息。
3.编写实验报告。
（要求有实验目的、要求、过程、流程图、核心代码、注释、系统运行截图、编程感想等，
分章节罗列，不能在实验报告中粘帖大段代码）
*/
