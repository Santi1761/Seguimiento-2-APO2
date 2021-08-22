package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SafeBoxControllerGUI2 {
	
	@FXML
    private Button butChange2;
	
	
	
	private Stage secondStage;
    
    public Stage getSecondStage() {
		return secondStage;
	}

	public void setSecondStage(Stage secondStage) {
		this.secondStage = secondStage;
	}
	
	
	@FXML
    public void switchWindow2(ActionEvent event) throws IOException {
    	FXMLLoader fxmlLoader3 = new FXMLLoader(getClass().getResource("SafeBox3.fxml"));
		fxmlLoader3.setController(this);
		Parent root3 = fxmlLoader3.load();
		Scene scene3 = new Scene(root3);
		
		secondStage.setScene(scene3);
		secondStage.setTitle("Cambia la contraseña");
		secondStage.show();

    }
	
}
