package day12.finals;
/**
 * final���γ�Ա����
 * @author fan
 *
 */
public class User {
	private String name;
	private final  int id=1001;//1.ʹ��final���ܵ���Ĭ��ֵ
    private final String sex;//final�ڴ���������ɺ���븳ֵ
    public User(String sex) {
    	this.sex=sex;
    }


	public String getSex() {
		return sex;
	}
    
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
