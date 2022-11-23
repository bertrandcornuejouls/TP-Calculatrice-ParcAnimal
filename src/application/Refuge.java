package application;

public class Refuge {

	private String nomRefuge;
	private String adresseLigne1;
	private String adresseLigne2;
	private String ville;
	private int codePostal;
	private int telephone;
	private String mail;
	
	
	public Refuge(String nomRefuge, String adr1, String adr2, String ville, int cp, int tel, String mail) 
	{
		this.nomRefuge = nomRefuge;
		this.adresseLigne1 = adr1;
		this.adresseLigne2 = adr2;
		this.ville = ville;
		this.codePostal = cp;
		this.telephone = tel;
		this.mail = mail;		
	}
	
	
	public String getVille() {
		return this.ville;
	}
	
	public String getNomRefuge() {
		return this.nomRefuge;
	}
	
	
	
}
