package hi.is.vidmot.bouncedown;

import javafx.application.Application;
import javafx.scene.control.Button;

import static javafx.application.Application.launch;

public class mainMenu {
    public Button StartGame;
    public Button HighScore;
    public Button Exitbutton;

    public void onStart() {
        ViewSwitcher.switchTo(View.Leikur);
    }
    public void onHighScore() {
        ViewSwitcher.switchTo(View.EndScreen);
    }

    public void onEnd() {

    }
    public static void main(String[] args) {
        launch();
    }
    }





