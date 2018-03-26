package pack;

public class Management extends Student {
	private int StudCount;

	public Management() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Management(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Management(String name, int age, int studCount) {
		super(name, age);
		StudCount = studCount;
	}

	@Override
	public String toString() {
		return "Management [StudCount=" + StudCount + ", toString()="
				+ super.toString() + "]";
	}

	public int getStudCount() {
		return StudCount;
	}

	public void setStudCount(int studCount) {
		StudCount = studCount;
	}

	

}
