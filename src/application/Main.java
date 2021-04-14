package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.List;



public class Main extends Application {
	
	static List<AnchorPane> Scenes = new ArrayList<AnchorPane>();
	static AnchorPane root;
	private static int CurrentScene = 0;
	
	
/**
 * 
 * @author Zachary Bowman & Christopher Ackerley
 * 
 */
	@Override
	public void start(Stage primaryStage) {
		try {
			//Makes an empty Background so everything can be loaded properly
			root = FXMLLoader.load(getClass().getResource("EmptyPane.fxml")); //It's a "Permanent background", so keep it blank so it doesn't have overlap issues!
			Scenes.add(FXMLLoader.load(getClass().getResource("Main.fxml"))); //Main is 0
			Scenes.add(FXMLLoader.load(getClass().getResource("Story.fxml")));	//Story is 1
			Scenes.add(FXMLLoader.load(getClass().getResource("ZoneSelect.fxml"))); //ZoneSelect is 2
			Scenes.add(FXMLLoader.load(getClass().getResource("HouseofHades.fxml"))); //HouseofHades is 3
			
			root.getChildren().add(Scenes.get(0)); //Sets the Main Menu from Main.fxml
			
			primaryStage.setTitle("Hades Game Companion");
			primaryStage.setScene(new Scene(root));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
/**
 * 
 * 
 * @author Zachary Bowman
 */
	public static void set_pane(int i) {
		root.getChildren().remove(Scenes.get(CurrentScene)); //Remove the existing scene from screen
		root.getChildren().add(Scenes.get(i)); //Put new Scene on screen
		CurrentScene = i; //Change local variable CurrentScene to the new scene's ID
	}
}
