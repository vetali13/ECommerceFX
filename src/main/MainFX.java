package main;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainFX extends Application {
	
	private static Scene scene;
	private static VBox root;

    @Override
    public void start(Stage primaryStage) throws Exception{
    	URL fxmlUrl = this.getClass().getClassLoader()
    	        .getResource("resources/productMenu.fxml");
    	root = FXMLLoader.<VBox> load(fxmlUrl);
    	scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Product Save Menu");
        primaryStage.show();
    }
    
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
    	URL fxmlUrl = MainFX.class.getClassLoader()
    	        .getResource(fxml);
    	root = FXMLLoader.<VBox> load(fxmlUrl);
        return root;
    }


    public static void main(String[] args) {
        launch(args);
    }
}