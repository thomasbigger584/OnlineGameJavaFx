package com.jpro.hellojpro;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class HelloJPro extends Application {
	public static Stage stage;
	@Override
	public void start(Stage primaryStage) {
		try {
			stage = primaryStage;
			BorderPane root = (BorderPane)FXMLLoader.load(getClass().getResource("/com/jpro/hellojpro/fxml/View.fxml"));
			Scene scene = new Scene(root,1000,800);
			scene.getStylesheets().add(getClass().getResource("/com/jpro/hellojpro/css/application.css").toExternalForm());
			stage.setScene(scene);
			stage.setTitle("Online Game");
			stage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
