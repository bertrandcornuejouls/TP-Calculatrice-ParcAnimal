package application;

import java.awt.image.BufferedImage;
import java.io.File;
//import java.model.UserAccount;

import javafx.scene.image.Image;

public class Animal {
	
	protected String famille;
	protected String nom;
	protected Image photo;
	protected String race;
	protected int age;
	protected String sexe;
	protected int taille;
	protected Refuge refuge;
	
	public Animal(String famille, String nom, Image img, String race, int age, String sexe, int taille, Refuge refuge) 
	{
		this.famille = famille;
		this.nom = nom;
		this.photo = img;
		this.race = race;
		this.age = age;
		this.sexe = sexe;
		this.taille = taille;
		this.refuge = refuge;		
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getFamille() {
		return this.famille;
	}
	
	public String getRace() {
		return this.race;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getSexe() {
		return this.sexe;
	}
	
	public int getTaille() {
		return this.taille;
	}
	
	public Refuge getRefuge() {
		return this.refuge;
	}
	
	
	
	
}
