package com.jpro.hellojpro;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public static Stage stage1;
    public static Stage[] stage2;
    public static int index = 0;
    private static boolean flag;
    private static boolean flag1 = true;
    private HelloJPro min;
    private Model model;

    public Controller() {
        if (flag1 == true) {
            model = new Model();
            flag = false;
            stage2 = new Stage[5];
        }
        flag1 = false;
    }


    public void createGame() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/creategame.fxml"));
            Scene scene = null;
            scene = new Scene(fxmlLoader.load(), 1000, 800);
            stage1 = new Stage();
            stage1.setTitle("Create Game");
            stage1.setScene(scene);
            stage1.show();
            flag = true;
            HelloJPro main = new HelloJPro();
            main.stage.getUserData();
            main.stage.focusedProperty();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void joinGame() {
        if (flag == true) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/com/jpro/hellojpro/fxml/joingame.fxml"));
                Scene scene = null;
                scene = new Scene(fxmlLoader.load(), 1000, 800);
                stage2[index] = new Stage();
                stage2[index].setTitle("join Game");
                stage2[index].setScene(scene);
                stage2[index].show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        index += 1;
        if (index == 5) {
            min = new HelloJPro();
            min.stage.close();
        }

    }

}
