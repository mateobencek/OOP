package z3_polymorphism;

public class B extends A {
	private int z = 0;

	public B() {
		super(0, 0);
	}

	public B(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public String toString() {
		return super.toString() + " z=" + z;
	}
}
