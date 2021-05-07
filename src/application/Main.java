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
 * @author Zachary Bowman & Christopher Ackerley & Andrew Mares & David Kent
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
			Scenes.add(FXMLLoader.load(getClass().getResource("Character.fxml"))); //characterSelect is 4
			Scenes.add(FXMLLoader.load(getClass().getResource("Tartarus.fxml"))); //Tartarus is 5
			Scenes.add(FXMLLoader.load(getClass().getResource("Asphodel.fxml"))); //Asphodel is 6			
			Scenes.add(FXMLLoader.load(getClass().getResource("Elysium.fxml"))); //Elysium is 7
			Scenes.add(FXMLLoader.load(getClass().getResource("Greece.fxml"))); //Greece is 8
			Scenes.add(FXMLLoader.load(getClass().getResource("Weapons.fxml"))); //Weapons is 9
			Scenes.add(FXMLLoader.load(getClass().getResource("Item.fxml"))); //Items is 10
			Scenes.add(FXMLLoader.load(getClass().getResource("Hades.fxml"))); //Hades is 11
			Scenes.add(FXMLLoader.load(getClass().getResource("Zeus.fxml"))); //Zeus is 12 uwu
			Scenes.add(FXMLLoader.load(getClass().getResource("Nyx.fxml"))); //Nyx is 13
			Scenes.add(FXMLLoader.load(getClass().getResource("Achilles.fxml"))); //Achilles is 14
			Scenes.add(FXMLLoader.load(getClass().getResource("Athena.fxml"))); //Athena is 15
			Scenes.add(FXMLLoader.load(getClass().getResource("Chaos.fxml"))); //Chaos is 16
			Scenes.add(FXMLLoader.load(getClass().getResource("Thanatos.fxml"))); //Thanatos is 17
			Scenes.add(FXMLLoader.load(getClass().getResource("Cerberus.fxml"))); //Cerberus is 18
			Scenes.add(FXMLLoader.load(getClass().getResource("Charon.fxml"))); //Charon is 19
			Scenes.add(FXMLLoader.load(getClass().getResource("Anviloffates.fxml"))); //Anvil of Fates is 20
			Scenes.add(FXMLLoader.load(getClass().getResource("Centaurheart.fxml"))); //Centaur Heart is 21
			Scenes.add(FXMLLoader.load(getClass().getResource("Charonsobal.fxml"))); //Charon's Obal is 22
			Scenes.add(FXMLLoader.load(getClass().getResource("Cthonickey.fxml"))); //Cthonic Key is 23
			Scenes.add(FXMLLoader.load(getClass().getResource("Daedalushammer.fxml"))); //Daedalus Hammer is 24
			Scenes.add(FXMLLoader.load(getClass().getResource("Darkness.fxml"))); //Darkness is 25
			Scenes.add(FXMLLoader.load(getClass().getResource("Diamond.fxml"))); //Diamond is 26
			Scenes.add(FXMLLoader.load(getClass().getResource("Gemstone.fxml"))); //Gemstone is 27
			Scenes.add(FXMLLoader.load(getClass().getResource("Loyaltycard.fxml"))); //Loyalty Card is 28
			Scenes.add(FXMLLoader.load(getClass().getResource("StygianBlade.fxml"))); //blade is 29
			Scenes.add(FXMLLoader.load(getClass().getResource("EternalSpear.fxml"))); //spear is 30
			Scenes.add(FXMLLoader.load(getClass().getResource("ShieldOfChaos.fxml"))); //SOC is 31
			Scenes.add(FXMLLoader.load(getClass().getResource("HeartSeekingBow.fxml"))); //bow is 32
			Scenes.add(FXMLLoader.load(getClass().getResource("TwinFists.fxml"))); //twin fists is 33
			Scenes.add(FXMLLoader.load(getClass().getResource("AdamantRail.fxml"))); //add rail is 34
			Scenes.add(FXMLLoader.load(getClass().getResource("Alecto.fxml"))); //Alecto is 35
			Scenes.add(FXMLLoader.load(getClass().getResource("Aphrodite.fxml"))); //Aphrodite is 36
			Scenes.add(FXMLLoader.load(getClass().getResource("Ares.fxml"))); //ares is 37
			Scenes.add(FXMLLoader.load(getClass().getResource("Artemis.fxml"))); //Artermis is 38
			Scenes.add(FXMLLoader.load(getClass().getResource("Asterius.fxml"))); //Asterius is 39
			Scenes.add(FXMLLoader.load(getClass().getResource("Demeter.fxml"))); //Demeter is 40
			Scenes.add(FXMLLoader.load(getClass().getResource("Dinoysus.fxml"))); //Dinoysus is 41
			Scenes.add(FXMLLoader.load(getClass().getResource("Dusa.fxml"))); //Dusa is 42
			Scenes.add(FXMLLoader.load(getClass().getResource("Eurydice.fxml"))); //Eurydice is 43
			Scenes.add(FXMLLoader.load(getClass().getResource("Hermes.fxml"))); //Hermes is 44
			Scenes.add(FXMLLoader.load(getClass().getResource("Hypnos.fxml"))); //Hypnos is 45
			Scenes.add(FXMLLoader.load(getClass().getResource("Megaera.fxml"))); //meg is 46
			Scenes.add(FXMLLoader.load(getClass().getResource("Orpheus.fxml"))); //Orpheus is 47
			Scenes.add(FXMLLoader.load(getClass().getResource("Patroclus.fxml"))); //Patroclus is 48
			Scenes.add(FXMLLoader.load(getClass().getResource("Persephone.fxml"))); //Persephone is 49
			Scenes.add(FXMLLoader.load(getClass().getResource("Poseidon.fxml"))); //Poseiodn is 50
			Scenes.add(FXMLLoader.load(getClass().getResource("Sisyphus.fxml"))); //Sisyphus is 51
			Scenes.add(FXMLLoader.load(getClass().getResource("Skelly.fxml"))); //Skelly is 52
			Scenes.add(FXMLLoader.load(getClass().getResource("Theseus.fxml"))); //Theseus is 53
			Scenes.add(FXMLLoader.load(getClass().getResource("Tisiphone.fxml"))); //Tisiphone is 54
			
			
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
