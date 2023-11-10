package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemCadastrar;
	
	@FXML
	private Menu menuCadastrar2;
	
	@FXML
	private MenuItem menuItemAtualizar;

	@FXML
	private MenuItem menuItemConsultar;

	@FXML
	private MenuItem menuItemSobre;
	
	
	@FXML
	public void onMenuItemCadastrarAction() {
		System.out.println("onMenuItemCadastrarAction");
	}
	
	@FXML
	public void onMenuCadastrar2Action() {
		System.out.println("onMenuItemCadastrarAction2");
	}
	
	
	@FXML
	public void onMenuItemAtualizarAction() {
		System.out.println("onMenuItemAtualizarAction");
	}
	
	@FXML
	public void onMenuItemConsultarAction() {
		System.out.println("onMenuItemConsultarAction");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("onMenuItemSobreAction");
	}
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		
	}

}
