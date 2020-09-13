package com.jpro.hellojpro;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class titleController {
	
	@FXML
    private  javafx.scene.control.Button title1;
	@FXML
    private  javafx.scene.control.Button title2;
	@FXML
    private  javafx.scene.control.Button title3;
	@FXML
    private  javafx.scene.control.Button title4;
	
	private ModelList obj;
	private nonGuesserController control;
	public static Stage stage8;
	public static String titleName;
	private joinController cont;
	public void initialize(){
		cont = new joinController();
		cont.stage5.close();
		obj = control.getObject();
		ArrayList<String> list = obj.getTitleList();
		title1.setText(list.get(0));
		title2.setText(list.get(1));
		title3.setText(list.get(2));
		title4.setText(list.get(3));
		
	}
	public titleController() {
		// TODO Auto-generated constructor stub
	}
	
	public void showCompleteDetail1() {
		titleName = title1.getText();
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/showTitle.fxml"));
			Scene scene = null;
			scene = new Scene(fxmlLoader.load(), 1000, 800);
			stage8 = new Stage();
			stage8.setTitle("Title Detail");
			stage8.setScene(scene);
			stage8.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showCompleteDetail2() {
		titleName = title2.getText();
		try {	
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/showTitle.fxml"));
			Scene scene = null;
			scene = new Scene(fxmlLoader.load(), 1000, 800);
			stage8 = new Stage();
			stage8.setTitle("Title Detail");
			stage8.setScene(scene);
			stage8.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showCompleteDetail3() {
		titleName = title3.getText();
		try {
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/showTitle.fxml"));
			Scene scene = null;
			scene = new Scene(fxmlLoader.load(), 1000, 800);
			stage8 = new Stage();
			stage8.setTitle("Title Detail");
			stage8.setScene(scene);
			stage8.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showCompleteDetail4() {
		titleName = title4.getText();
		try {	
			FXMLLoader fxmlLoader = new FXMLLoader();
			fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/showTitle.fxml"));
			Scene scene = null;
			scene = new Scene(fxmlLoader.load(), 1000, 800);
			stage8 = new Stage();
			stage8.setTitle("Title Detail");
			stage8.setScene(scene);
			stage8.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
