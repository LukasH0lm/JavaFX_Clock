package com.monkeygang.javafx_clock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ClockApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(ClockApplication.class.getResource("ClockView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        System.out.println(
                """
                        <-. (`-')             <-. (`-')_ <-.(`-')  (`-')  _                      (`-')  _ <-. (`-')_           \s
                           \\(OO )_      .->      \\( OO) ) __( OO)  ( OO).-/     .->       .->    (OO ).-/    \\( OO) )    .->   \s
                        ,--./  ,-.)(`-')----. ,--./ ,--/ '-'. ,--.(,------. ,--.'  ,-. ,---(`-') / ,---.  ,--./ ,--/  ,---(`-')\s
                        |   `.'   |( OO).-.  '|   \\ |  | |  .'   / |  .---'(`-')'.'  /'  .-(OO ) | \\ /`.\\ |   \\ |  | '  .-(OO )\s
                        |  |'.'|  |( _) | |  ||  . '|  |)|      /)(|  '--. (OO \\    / |  | .-, \\ '-'|_.' ||  . '|  |)|  | .-, \\\s
                        |  |   |  | \\|  |)|  ||  |\\    | |  .   '  |  .--'  |  /   /) |  | '.(_/(|  .-.  ||  |\\    | |  | '.(_/\s
                        |  |   |  |  '  '-'  '|  | \\   | |  |\\   \\ |  `---. `-/   /`  |  '-'  |  |  | |  ||  | \\   | |  '-'  | \s
                        `--'   `--'   `-----' `--'  `--' `--' '--' `------'   `--'     `-----'   `--' `--'`--'  `--'  `-----'  \s"""
        );
        launch();
    }
}