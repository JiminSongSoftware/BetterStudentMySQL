package application;
	
import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		primaryStage.setTitle("Better Student");
		primaryStage.setScene(new Scene(root, 620, 420));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
