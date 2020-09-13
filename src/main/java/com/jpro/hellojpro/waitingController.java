package com.jpro.hellojpro;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class waitingController {
	
	public static Stage stage7;
	@FXML
    private Label txtComment;
	private ModelList obj;
	private nonGuesserController control;
	public waitingController() {
		// TODO Auto-generated constructor stub
	}
	public void initialize(){
//		Controller obj = new Controller();
//        obj.stage2[].close();
	}
	
	
	public void readyPlayer() {
		obj = control.getObject();
		if(obj.getNumOFTitle() == 4) {
			try {
				FXMLLoader fxmlLoader = new FXMLLoader();
				fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/chooseTitle.fxml"));
				Scene scene = null;
				scene = new Scene(fxmlLoader.load(), 1000, 800);
				stage7 = new Stage();
				stage7.setTitle("Titles");
				stage7.setScene(scene);
				stage7.show();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			txtComment.setText("Please wait...");
		}
	}

}
