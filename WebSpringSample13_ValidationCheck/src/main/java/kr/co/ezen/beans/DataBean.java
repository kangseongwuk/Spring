package kr.co.ezen.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

public class DataBean {

	@Size(min = 8, max = 15)
	private String id;
	
	@Size(min = 2, max = 30)
	private String strname;
	
	@Max(100)
	private int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStrname() {
		return strname;
	}
	public void setStrname(String strname) {
		this.strname = strname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
