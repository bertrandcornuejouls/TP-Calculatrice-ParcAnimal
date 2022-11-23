package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class VueAnimalController 
{
	private Animal selectedAnimal;
	
	@FXML private Label famille;
	@FXML private Label name;
	@FXML private Label race;
	@FXML private Label refuge;
	@FXML private Label ville;
	
	public void initData(Animal animal) {
		selectedAnimal = animal;
	
		famille.setText(selectedAnimal.getFamille());
		name.setText(selectedAnimal.getNom());
		race.setText(selectedAnimal.getRace());
		refuge.setText(selectedAnimal.getRefuge().getNomRefuge());

	}



}