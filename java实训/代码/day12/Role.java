package day13;

/**
 * ��ɫ
 * 
 * @author fan
 *
 */
public class Role {
	private int id;// ���
	private String name = "";// ��ɫ����
	private int boold = 100;// ����ֵ
	private One one;// �˺�
	private Two two;// ����
	// ��������

	public void attack() {
		if (one == null) {
			System.out.println("ԭʼ������1");
		} else {
			System.out.println("ʹ��" + one.getName() + "���" + one.getHurt());
		}
	}

	public void attack(Role role) {
		int cha = this.getOne().getHurt() - role.getTwo().getProtect();
		if (cha > 0) {
			role.setBoold(role.getBoold()-cha);
		}
	}

	// ����
	public void wear() {
		if (two == null) {
			System.out.println("ԭʼ������10");
		} else {
			System.out.println("ʹ��" + two.getName() + "����" + two.getProtect());
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
