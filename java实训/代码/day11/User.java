package day12.finals;
/**
 * final修饰成员变量
 * @author fan
 *
 */
public class User {
	private String name;
	private final  int id=1001;//1.使用final不能调用默认值
    private final String sex;//final在创建对象完成后必须赋值
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
