package com.jpro.hellojpro;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.util.ArrayList;

public class guesserController {
	
	
	@FXML
    private Label txtName1;
	@FXML
    private Label txtName2;
	@FXML
    private Label txtName3;
	@FXML
    private Label txtName4;
	@FXML
    private Label txtName5;
	
	private createController createControl;
	private Model model;
	public Stage stage4;
	
	public guesserController() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void initialize(){
		Controller obj = new Controller();
        obj.stage1.close();
		model = createControl.getInstance();
		ArrayList<String> list = model.getPlayerList();
		txtName1.setText(list.get(0));
		txtName2.setText(list.get(1));
		txtName3.setText(list.get(2));
		txtName4.setText(list.get(3));
		txtName5.setText(list.get(4));
	}
	
	public void guesserPlayer1() {
		model.setGeusserName(txtName1.getText());
		
	}
	
	public void guesserPlayer2() {
		model.setGeusserName(txtName2.getText());
	}
	
	public void guesserPlayer3() {
		model.setGeusserName(txtName3.getText());
	}
	
	public void guesserPlayer4() {
		model.setGeusserName(txtName4.getText());
	}
	
	public void guesserPlayer5() {
		model.setGeusserName(txtName5.getText());
	}

}
