package experiment;

public class course {
	int cno;
	String conrse;
	String teacher;
	String didian;
	course(int cno,String conrse,String teacher,String didian){
		this.cno=cno;
		this.conrse=conrse;
		this.teacher=teacher;
		this.didian=didian;
	}
	public String toString() {
		return "课程编号："+cno+"  课程名称:"+conrse+"  授课教师："+teacher+"  上课地点："+didian;
	}
}
