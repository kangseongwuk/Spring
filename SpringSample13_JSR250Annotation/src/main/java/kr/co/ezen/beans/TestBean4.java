package kr.co.ezen.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class TestBean4 {
	@Autowired
	private DataBean data1;
	@Autowired
	private DataBean2 data2;
	@Autowired
	private DataBean3 data3;
	
	public DataBean getData1() {
		return data1;
	}
	
	public void setData1(DataBean data1) {
		this.data1 = data1;
	}
	public DataBean2 getData2() {
		return data2;
	}
	public void setData2(DataBean2 data2) {
		this.data2 = data2;
	}
	public DataBean3 getData3() {
		return data3;
	}
	public void setData3(DataBean3 data3) {
		this.data3 = data3;
	}
	

	
	
}