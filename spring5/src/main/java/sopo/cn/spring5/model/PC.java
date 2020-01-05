package sopo.cn.spring5.model;

public class PC {
	private String brand;
	private User user;
	
	private String testLists;
	private String testSet;
	private String testBooksMap;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getTestLists() {
		return testLists;
	}
	public void setTestLists(String testLists) {
		this.testLists = testLists;
	}
	public String getTestSet() {
		return testSet;
	}
	public void setTestSet(String testSet) {
		this.testSet = testSet;
	}
	public String getTestBooksMap() {
		return testBooksMap;
	}
	public void setTestBooksMap(String testBooksMap) {
		this.testBooksMap = testBooksMap;
	}
	@Override
	public String toString() {
		return "PC [brand=" + brand + ", user=" + user + ", testLists=" + testLists + ", testSet=" + testSet
				+ ", testBooksMap=" + testBooksMap + "]";
	}
}
