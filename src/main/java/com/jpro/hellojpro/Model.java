package com.jpro.hellojpro;

import java.util.ArrayList;

public class Model {
	
	private String genCode;
	private static createController createControl;
	private static ArrayList<String> nameList;
	private static String createrName;
	public static String guesserName;
	public boolean flag;
	
	
	public Model() {
		this.genCode = "NoCodeisAvailabe";
		//createControl = new createController();
	}
	
	public Model(String code) {
		// TODO Auto-generated constructor stub
		nameList = new ArrayList<String>();
		this.genCode = code;
		flag = false;
	}
	
	public void addPlayerName(String name) {
		nameList.add(name); 
	}
	
	
	
	public void addCreaterName(String name) {
		createrName = name;
	}
	
	public void setGeusserName(String name) {
		flag = true;
		guesserName = name;
	}
	
	public boolean getGuesserFlag() {
		return flag;
	}
	
	public static String getGuesserName() {
		return guesserName;
	}
	
	public static int getNoOfPlayer() {
		return nameList.size();
	}
	
	public static ArrayList<String> getPlayerList() {
		return nameList;
	}
	
	public String getGecCode() {
		return genCode;
	}
	

}
