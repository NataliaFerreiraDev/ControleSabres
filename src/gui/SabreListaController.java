package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Sabre;

public class SabreListaController implements Initializable {
	
	@FXML
	private TableView<Sabre> tableViewSabres;
	
	@FXML
	private TableColumn<Sabre, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnJedi;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnModelo;
		
	@FXML
	private TableColumn<Sabre, String> tableColumnFabricacao;
	
	@FXML
	private TableColumn<Sabre, String> tableColumnSituacao;
	

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		initializeNodes();
	}


	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("idSabre"));
		tableColumnJedi.setCellValueFactory(new PropertyValueFactory<>("jedi"));
		tableColumnModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
		tableColumnFabricacao.setCellValueFactory(new PropertyValueFactory<>("dataFabricacao"));
		tableColumnSituacao.setCellValueFactory(new PropertyValueFactory<>("situacao"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewSabres.prefHeightProperty().bind(stage.heightProperty());
		tableViewSabres.prefWidthProperty().bind(stage.widthProperty());
		
	}

}
