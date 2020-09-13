package com.jpro.hellojpro;

import javafx.fxml.FXML;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class showTitleController {
	
	@FXML
    private  TextFlow txtFlow;
	@FXML
    private  javafx.scene.control.Label txtTitle;
	@FXML
    private  javafx.scene.control.Label txtPlayer;
    
	private static titleController title;
	private nonGuesserController control;
	private ModelList model;
	private waitingController cont;
	public showTitleController() {
		// TODO Auto-generated constructor stub
	}
	
	public void initialize(){
		cont = new waitingController();
		cont.stage7.close();
		model = control.getObject();
		txtTitle.setText(title.titleName);
		Text txt = new Text(model.getArticle(title.titleName));
		txt.setFont(Font.font(25));
		txtFlow.getChildren().add(txt);
		txtPlayer.setText(model.getPlayer(title.titleName));
	}
}
