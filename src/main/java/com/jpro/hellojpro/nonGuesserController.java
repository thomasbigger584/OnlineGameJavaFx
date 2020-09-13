package com.jpro.hellojpro;

import javafx.fxml.FXML;

public class nonGuesserController {
	
	@FXML
    private  javafx.scene.control.TextField txtTitle;
	@FXML
    private  javafx.scene.control.TextArea txtArticle;
	
	private static boolean flag = true;
	private static ModelList obj;
	private static int index = 0;
	private joinController joinControl;
	private boolean flag1 = true;
	public nonGuesserController() {
		// TODO Auto-generated constructor stub
	}
	
	public void initialize(){
		if(flag == true) {
			obj = new ModelList();
		}
		flag = false;
//		Controller obj = new Controller();
//        obj.stage2[index].close();
	}
	
	
	public void readyNonGusser() {
		if(flag1 == true) {
			obj.insert(joinControl.nameNonGuesser, txtTitle.getText(), txtArticle.getText());
		}
		flag1 = false;
	}
	
	public static ModelList getObject() {
		return obj;
	}
	
}
