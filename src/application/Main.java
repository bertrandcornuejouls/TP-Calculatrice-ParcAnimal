package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class Main extends Application {


	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			
			Parent rootFXML = FXMLLoader.load(getClass().getResource("VueParc.fxml"));
			Scene sceneFXML = new Scene(rootFXML);
			
			//titre de l'application
			primaryStage.setTitle("ParcAnimalier");
			
			
			//Attribut la composition de ma fenetre à ma fenetre principale
			primaryStage.setScene(sceneFXML);
			
			//Affiche la fenetre principale
			primaryStage.show();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		launch(args);
	}	
}