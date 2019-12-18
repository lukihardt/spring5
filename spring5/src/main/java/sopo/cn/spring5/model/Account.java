package sopo.cn.spring5.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Account {
	@Override
	public String toString() {
		return "Account [name=" + name + ", pwd=" + pwd + ", cities=" + cities + ", fridends=" + fridends + ", books="
				+ books + "]";
	}

	private String name;
	private String pwd;
	private List<String> cities;
	private Set<String> fridends;
	private Map<Integer, String> books;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public Set<String> getFridends() {
		return fridends;
	}

	public void setFridends(Set<String> fridends) {
		this.fridends = fridends;
	}

	public Map<Integer, String> getBooks() {
		return books;
	}

	public void setBooks(Map<Integer, String> books) {
		this.books = books;
	}

}
