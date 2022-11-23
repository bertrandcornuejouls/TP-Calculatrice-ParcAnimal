package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class VueController {
	
	@FXML
	private Button b1;
	@FXML
	private Button b2;
	@FXML
	private Button b3;
	@FXML
	private Button b4;
	@FXML
	private Button b5;
	@FXML
	private Button b6;
	@FXML
	private Button b7;
	@FXML
	private Button b8;
	@FXML
	private Button b9;
	@FXML
	private Button b0;
	@FXML
	private Button b_plus;
	@FXML
	private Button b_moins;
	@FXML
	private Button b_mult;
	@FXML
	private Button b_div;
	@FXML
	private Button b_point;
	@FXML
	private Button b_egal;

	@FXML
	private Label label;
	
	private int a = 0;
	private int b = 0;
	private boolean operateur_active = false;
	private boolean operateur_active1 = false;
	private boolean operation_finie = false;
	private String operateur = "";
	private boolean premier_calcul = true;
	
	
	public void clickMe(ActionEvent e) {
		String str = ((Button)e.getSource()).getText();
		
		if(e.getSource() != b_egal & e.getSource() != b_plus & e.getSource() != b_moins & e.getSource() != b_div & e.getSource() != b_mult) 
		{
			if (operation_finie) 
			{ 
				label.setText(""); 
				operation_finie = false;
			} //si on recommence apres une premiere operation
			
			label.setText(label.getText() + str);
				
			
				if (operateur_active & operateur_active1)
					{
						label.setText("");
						label.setText(label.getText() + str);
						operateur_active1 = false;
					}
			
					
		}
		else 
			if (e.getSource() == b_plus)
			{
				a = Integer.parseInt(label.getText()); //le string devient un integer
				operateur_active = true;
				operateur_active1 = true;
				label.setText("+");
				operateur = "+";
			}
			
			if (e.getSource() == b_moins)
			{
				a = Integer.parseInt(label.getText()); //le string devient un integer
				operateur_active = true;
				operateur_active1 = true;
				label.setText("-");
				operateur = "-";
			}
			
			if (e.getSource() == b_mult)
			{
				a = Integer.parseInt(label.getText()); //le string devient un integer
				operateur_active = true;
				operateur_active1 = true;
				label.setText("*");
				operateur = "*";
			}
			
			if (e.getSource() == b_div)
			{
				a = Integer.parseInt(label.getText()); //le string devient un integer
				operateur_active = true;
				operateur_active1 = true;
				label.setText("/");
				operateur = "/";
			}
			
			if (e.getSource() == b_egal)
			{
				b = Integer.parseInt(label.getText());
				operation_finie = true;
				
				if(operateur == "+")
				{
					int c = a + b;
					label.setText(String.valueOf (c));
				}
				if(operateur == "-")
				{
					int c = a - b;
					label.setText(String.valueOf (c));
				}
				if(operateur == "*")
				{
					int c = a * b;
					label.setText(String.valueOf (c));
				}
				if(operateur == "/")
				{
					int c = a / b;
					label.setText(String.valueOf (c));
				}
				

			}
	}//fin clickMe		
}//fin VueController