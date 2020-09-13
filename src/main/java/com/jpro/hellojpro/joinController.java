package com.jpro.hellojpro;

import com.sun.tools.javac.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class joinController {
	@FXML
    private javafx.scene.control.TextField txtGameCode;
	@FXML
    private javafx.scene.control.TextField txtName;
	@FXML
    private javafx.scene.control.ComboBox<String> jplayerNames;
	@FXML
    private Label txtComment;
	
	private Model model;
	private createController createControl;
	private static int index = 0;
	private HelloJPro min;
	private boolean flag = true;
	public static String nameNonGuesser;
	public static Stage stage5;
	public static Stage stage6;
	private String name;
	private Controller control;
//	public joinController() {
//		
//	}
	
	public void initialize(){
			name = "";
    }
	
	public void readyGame() {
		model = createControl.getInstance();
		if(flag == true) {
			try {
				if (model.getGecCode().equals(txtGameCode.getText())) {
					txtComment.setText("Pease wait");
					model.addPlayerName(txtName.getText());
					showPlayerList();
					//createControl.showPlayerListC(model);
					flag = false;
					name = txtName.getText();
					txtComment.setText("You have been added. Please wait...");
				}
				else {
					txtComment.setText("This Code has not matched");	
				}
			}
			catch(RuntimeException e) {
				txtComment.setText("AnyOne has not create the game");
			}
		}
		else {
			//txtComment.setText("You already registered");
			if(model.getNoOfPlayer() == 5 && model.getGuesserFlag() == true) {
				if(txtName.getText().equals(model.getGuesserName())) {
					try {
			            FXMLLoader fxmlLoader = new FXMLLoader();
			            fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/waiting.fxml"));
			            Scene scene = null;
			            scene = new Scene(fxmlLoader.load(), 1000, 800);
			            stage5 = new Stage();
			            stage5.setTitle("Wait");
			            stage5.setScene(scene);
			            stage5.show();
			            index += 1;
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
				}
				else {
					try {
			            FXMLLoader fxmlLoader = new FXMLLoader();
			            fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/nonGuesser.fxml"));
			            Scene scene = null;
			            scene = new Scene(fxmlLoader.load(), 1000, 800);
			            stage6 = new Stage();
			            stage6.setTitle("Non Guesser");
			            stage6.setScene(scene);
			            stage6.show();
			            nameNonGuesser = txtName.getText();
			            index += 1;
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
					
				}
			}
			else {
				txtComment.setText("Is not select the guesser. Please wait...");
			}
		}
		if(index == 5) {
			min = new HelloJPro();
			min.stage.close();
			control = new Controller();
			for(int i = 0; i < 5; i++) {
				control.stage2[i].close();
			}
		}
	}
//	
	
	public void showPlayerList(){
		ArrayList<String> list = model.getPlayerList();
		jplayerNames.getItems().clear();
		for(int i = 0; i < list.size(); i++){
            jplayerNames.getItems().addAll(list.get(i));
        }
		
	}

}
