package com.sahil.generics;

import java.util.List;

public class Father {

    private String name;
    private int age;
    
    private List<Children> Childrens;
    private List<GrandChildren> grandChilds;
    
    public List<GrandChildren> getGrandChilds() {
		return grandChilds;
	}
	public void setGrandChilds(List<GrandChildren> grandChilds) {
		this.grandChilds = grandChilds;
	}
	public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Children> getChildrensList() {
        return Childrens;
    }
    public void setChildrensList(List<Children> childrens) {
        Childrens = childrens;
    }
}