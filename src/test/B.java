package test;

public class B extends A {
	public B(){
		
	}
	public B(int id, String name) {
		super(id, name);
	}
	public void f(){
		System.out.println("public");
	}
	public static void main(String[] args) {
		A a = new B();
	}
}
