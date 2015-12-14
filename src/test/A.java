package test;

import net.sf.json.JSONObject;

public class A implements Comparable<A>{
	private int id;
	private String name;
	private void f(){
		System.err.println("private ");
	}
	public A(){
		
	}
	public A(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public int compareTo(A o) {
		return this.id - o.id;
	}
	public String returnJson(){
		return JSONObject.fromObject(this).toString();
	}
}
