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
		return "�γ̱�ţ�"+cno+"  �γ�����:"+conrse+"  �ڿν�ʦ��"+teacher+"  �Ͽεص㣺"+didian;
	}
}
