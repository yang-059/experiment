package experiment;

//ѧУ�С���Ա������Ϊ����ʦ���͡�ѧ��������ʦ���ڡ��γ̡���ѧ��ѡ�񡰿γ̡����Ӽ�ϵͳ���ǣ�
//ÿ����ʦ������һ�ſγ̣�ÿ�ſγ̵��ڿν�ʦҲ����һλ��ÿ��ѧ��ѡ��ѡһ�ſγ̡�
public class personnal {               //���ࣺѧУ��Ա
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
		return"������"+name+"  ��ţ�"+bianhao+"  �Ա�"+sex+"  �γ̣�"+course;
	}
}

class teacher extends personnal{     //���ࣺ��ʦ
	course shouke;
	teacher(String name, int bianhao, String sex, String shouke) {
		super(name, bianhao, sex, shouke);
	}
	public String toString() {
		return "��ʦ�ڿ���Ϣ��"+super.toString()+"\n";
	}
	public course getShouke() {
		return shouke;
	}
	public void setShouke(course shouke) {
		this.shouke=shouke;
	}
}

class student extends personnal{    //���ࣺѧ��
	course xuanke;
	student(String name, int bianhao, String sex, String xuanke) {
		super(name, bianhao, sex, xuanke);
	} 
	public String toString() {
		return "ѧ��ѡ����Ϣ��"+super.toString()+"\n";
	}
	public course getXuanke() {
		return xuanke;
	}
	public void setXuanke(course xuanke) {
		this.xuanke=xuanke;
	}
}






