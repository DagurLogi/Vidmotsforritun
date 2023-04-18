package hi.is.vidmot.bouncedown;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class ViewSwitcher {

    private static Scene scene;

    public static void setScene(Scene scene) {
        ViewSwitcher.scene = scene;
    }

    public static void switchTo(View view){
        if (scene == null) {
            System.out.println("No scene was set");
            return;
        }

        try {
            Object root = FXMLLoader.load(ViewSwitcher.class.getResource(view.getFileName()));
            scene.setRoot((Parent) root);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
