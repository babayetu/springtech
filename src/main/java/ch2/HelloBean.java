package ch2;

import java.util.Date;

public class HelloBean {
	private String helloWorld;
	private String name;
	private Date date;
	
	public HelloBean() {}
	
	public HelloBean(String aName, String aHelloWorld) {
		this.helloWorld = aHelloWorld;
		this.name = aName;
	}
	
	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String ahelloWorld) {
		this.helloWorld = ahelloWorld;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String aName) {
		this.name = aName;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date aDate) {
		this.date = aDate;
	}
}