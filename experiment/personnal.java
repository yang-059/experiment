package experiment;

//学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，
//每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。
public class personnal {               //父类：学校人员
	int bianhao;
	String name;
	String sex;
	String course;
	 personnal(String name,int bianhao,String sex,String course){
		this.name=name;
		this.bianhao=bianhao;
		this.sex=sex;
		this.course =course;
	}
	void setName(String n) {
		this.name=n;
	}
	public char getName(char n) {
		return n;
	}
	void setBian(int b) {
		this.bianhao=b;
	}
	public int getBian(int b) {
		return b;
	}
	void setSex(String s) {
		this.sex=s;
	}
	public char getSex(char s) {
		return s;
	}
	void setCou(String c) {
		this.course=c;
	}
	public char getCon(char c) {
		return c;
	}
	public String toString() {
		return"姓名："+name+"  编号："+bianhao+"  性别："+sex+"  课程："+course;
	}
}

class teacher extends personnal{     //子类：教师
	course shouke;
	teacher(String name, int bianhao, String sex, String shouke) {
		super(name, bianhao, sex, shouke);
	}
	public String toString() {
		return "教师授课信息："+super.toString()+"\n";
	}
	public course getShouke() {
		return shouke;
	}
	public void setShouke(course shouke) {
		this.shouke=shouke;
	}
}

class student extends personnal{    //子类：学生
	course xuanke;
	student(String name, int bianhao, String sex, String xuanke) {
		super(name, bianhao, sex, xuanke);
	} 
	public String toString() {
		return "学生选课信息："+super.toString()+"\n";
	}
	public course getXuanke() {
		return xuanke;
	}
	public void setXuanke(course xuanke) {
		this.xuanke=xuanke;
	}
}






