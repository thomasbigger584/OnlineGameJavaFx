package com.jpro.hellojpro;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class createController {

	@FXML
    private  javafx.scene.control.TextField txtGameCode;
	@FXML
    private  javafx.scene.control.TextField txtName;
	@FXML
    private  javafx.scene.control.ComboBox<String> playerNames;
	@FXML
    private Label txtComment;

	private static Model model;

	public Stage stage3;

	public void generateCode() {
		model = new Model(txtGameCode.getText());
		if(txtName.getText().isEmpty()){
			txtComment.setText("Please Enter the Name");
		}
		else {
			model.addCreaterName(txtName.getText());
			txtComment.setText("This Code has been generated");
			showPlayerList();
		}
	}


	public void showPlayerList(){
		ArrayList<String> list = model.getPlayerList();
		System.out.println(list.size());
		playerNames.getItems().clear();
		for(int i = 0; i < list.size(); i++){
            playerNames.getItems().addAll(list.get(i));
        }
	}

	public static Model getInstance() {
		return model;
	}

	public void initialize(){
//        Main obj = new Main();
//        obj.stage.close();
    }

	public void selectGuesser() {
		try {
			if(model.getNoOfPlayer() == 5) {
				try {
					FXMLLoader fxmlLoader = new FXMLLoader();
					fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/guesser.fxml"));
					Scene scene = null;
					scene = new Scene(fxmlLoader.load(), 1000, 800);
					stage3 = new Stage();
					stage3.setTitle("Guesser");
					stage3.setScene(scene);
					stage3.show();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else {
				txtComment.setText("Please wait... Five number of Players is not ready");
			}
		} catch(RuntimeException e) {
			txtComment.setText("Please Generate the code");
		}

	}

}
