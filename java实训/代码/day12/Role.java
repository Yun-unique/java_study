package day13;

/**
 * 角色
 * 
 * @author fan
 *
 */
public class Role {
	private int id;// 编号
	private String name = "";// 角色名称
	private int boold = 100;// 生命值
	private One one;// 伤害
	private Two two;// 防御
	// 攻击方法

	public void attack() {
		if (one == null) {
			System.out.println("原始攻击是1");
		} else {
			System.out.println("使用" + one.getName() + "造成" + one.getHurt());
		}
	}

	public void attack(Role role) {
		int cha = this.getOne().getHurt() - role.getTwo().getProtect();
		if (cha > 0) {
			role.setBoold(role.getBoold()-cha);
		}
	}

	// 防御
	public void wear() {
		if (two == null) {
			System.out.println("原始防御是10");
		} else {
			System.out.println("使用" + two.getName() + "防御" + two.getProtect());
		}

	}

	public Role(int id, String name, int boold) {
		super();
		this.id = id;
		this.name = name;
		this.boold = boold;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	// set/get
	public One getOne() {
		return one;
	}

	public void setOne(One one) {
		this.one = one;
	}

	public Two getTwo() {
		return two;
	}

	public void setTwo(Two two) {
		this.two = two;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBoold() {
		return boold;
	}

	public void setBoold(int boold) {
		this.boold = boold;
	}

}
