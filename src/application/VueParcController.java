package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.util.Callback;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.util.*;


public class VueParcController {
	
	
	
	//Controlleur du FXML
	@FXML
	//private TableView<Animal> tableview;
	private TableView<Animal> tableView = new TableView<Animal>();
	
	//Créer une colonne : TableColumn<JavaClassUtilisée, DataType> idColonne = new TableColumn<UserAccount, String>("NomVisibleColonne");

	@FXML
	private TableColumn<Animal, String> AnimalCol; //= new TableColumn<Animal, String>("Animal");
	
	@FXML
	private TableColumn<Animal, String> NomCol; //= new TableColumn<Animal, String>("Nom");
	
	@FXML
	private TableColumn<Animal, String> RaceCol; //= new TableColumn<Animal, String>("Race");
	
	@FXML
	private TableColumn<Animal, String> VilleCol; //= new TableColumn<Animal, String>("Ville");
	
	@FXML
	private TableColumn<Animal, String> VoirCol; //= new TableColumn<Animal, String>("Voir");
	
	@FXML
	private ChoiceBox AnimalChoice;
	
	@FXML
	private ChoiceBox NomChoice;
	
	@FXML
	private ChoiceBox RaceChoice;
	
	@FXML
	private ChoiceBox VilleChoice;
	
	@FXML
	private ChoiceBox AutourDeChoice;
	
	@FXML
	private Button button;
	
	
	
	Refuge refuge1 = new Refuge("nom", "adre1", "adr2", "Albi", 81000, 01234, "mail");

	//Listes des choix
	ObservableList<String> AnimalList = FXCollections.observableArrayList("Chat","Chien");
    ObservableList<String> NomList = FXCollections.observableArrayList("nom1","nom2","nom3","nom4","nom5");
    ObservableList<String> RaceList = FXCollections.observableArrayList("race1","race2","race3","race4");
    ObservableList<String> VilleList = FXCollections.observableArrayList("Albi","Toulouse");

	
	//Création des entités
	String localUrl = "C:\\Users\\Eleve\\Desktop\\Cours";
	Image img = new Image(localUrl);
	
	 //Animal(String famille, String nom, Image img, String race, int age, String sexe, int taille, Refuge refuge) 
	Animal animal1 = new Animal("Chien", "nom1", img ,"Race1",2, "male", 10, refuge1);
	Animal animal2 = new Animal("Chien", "nom2", img ,"Race1",2, "femelle", 20, refuge1);
	Animal animal3 = new Animal("Chien", "nom3", img ,"Race2",2, "male", 30, refuge1);
	Animal animal4 = new Animal("Chat", "nom4", img ,"Race3",2, "male", 20, refuge1);
	Animal animal5 = new Animal("Chat", "nom5", img ,"Race4",2, "femelle", 10, refuge1);
	
	ObservableList<Animal> AnimauxList = FXCollections.observableArrayList(animal1, animal2, animal3, animal4);
	
	/*
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		AnimalCol.setCellValueFactory(new PropertyValueFactory<>("famille"));
		NomCol.setCellValueFactory(new PropertyValueFactory<>("nom"));
	    RaceCol.setCellValueFactory(new PropertyValueFactory<>("race"));
	    VilleCol.setCellValueFactory(new PropertyValueFactory<>("ville"));
	    
	    tableView.setItems(AnimauxList);
	    
		AnimalChoice.setItems(AnimalList);
        NomChoice.setItems(NomList);
        RaceChoice.setItems(RaceList);
        VilleChoice.setItems(VilleList);
        
        
        Callback<TableColumn<Animal, String>, TableCell<Animal, String>> cellFactory=(param) -> {
        	final TableCell<Animal, String> cell = new TableCell<Animal, String>() {
        		@Override
        		public void updateItem(String item, boolean empty) {
        			super.updateItem(item, empty);
        			if(empty) {
        				setGraphic(null);
        				setText(null);
        			}
        			else {
        				final Button editButton = new Button("Voir");
        			
        				editButton.setOnAction(event -> {
        					
        					Animal animal = tableView.getItems().get(getIndex());
        					System.out.println(animal);
        					
        					try {
								changeToDetailledAnimal(animal, event);
							} catch (IOException e) {
								e.printStackTrace();
							}
							
            			});
            			
            			setGraphic(editButton);
            			setText(null);
        			}
        		};
        	};
        	return cell;
        };
        
        VoirCol.setCellFactory(cellFactory);
        
	};
	*/
	
	
	public void changeToDetailledAnimal(Animal animal, ActionEvent event) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(getClass().getResource("VueDetail.fxml"));
		
		Parent FXMLDetailAnimal = loader.load();
		Scene sceneDetailAnimalFXML = new Scene(FXMLDetailAnimal);
		
		VueAnimalController controller = loader.getController();
		controller.initData(animal);
		
		Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(sceneDetailAnimalFXML);
		window.show();
	}
	
	public void find() {
		String valueAnimal = (String) AnimalChoice.getValue();
		String valueNom = (String) NomChoice.getValue();
		String valueRace = (String) RaceChoice.getValue();
		String valueVille = (String) VilleChoice.getValue();
		
		
		ObservableList<Animal> newListAnimal = FXCollections.observableArrayList();
		
		AnimauxList.forEach((animal) -> {
			Boolean isFind = true;
			if(valueAnimal != null && animal.famille != valueAnimal) {
				isFind = false;
			}
			if(valueNom != null && animal.age > Integer.parseInt(valueNom)) {
				isFind = false;
			}
			if(valueRace != null && animal.sexe != valueRace) {
				isFind = false;
			}
			if(valueVille != null && animal.taille > Integer.parseInt(valueVille)) {
				isFind = false;
			}
						
			if(isFind) {
				newListAnimal.add(animal);
			}
		});
		
		tableView.setItems(newListAnimal);
	}
	
	
	//AnimalCol.setCellValueFactory(new PropertyValueFactory<>("famille"));
	
	/*
	private ObservableList<Animal> listAnimaux = FXCollections.observableArrayList(
			new Animal("Chien2", "nom12", img ,"Caniche2",22, "male2", 102, refuge1), 
			new Animal("Chat", "nom123", img ,"Petitchat",5, "femelle", 4, refuge1)
	); //je crée la liste qui contient les animaux 
	*/
	
	
	
	/*
	private ObservableList<Animal> AnimalListcreator(){
	Animal animal2 = new Animal("Chien2", "nom12", img ,"Caniche2",22, "male2", 102, refuge1);
	Animal animal3 = new Animal("Chat", "nom123", img ,"Petitchat",5, "femelle", 4, refuge1);
	ObservableList<Animal> list = FXCollections.observableArrayList(animal2, animal3);
	return list;
	}
	*/
	
	
	//table.getColumns().addAll(AnimalCol, NomCol);
	//table.setItems(list);
	
	//AnimalCol.setCellValueFactory(new PropertyValueFactory<>("Animal"));
	
	

	

	//Animal.setCellValueFactory(new PropertyValueFactory<>("Animal"));
	
	
	//table.setItems(listAnimaux);
	
	//table.getColumns().addAll(Animal);
	
	
}