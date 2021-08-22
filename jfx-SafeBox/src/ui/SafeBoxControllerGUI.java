package ui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class SafeBoxControllerGUI {

    @FXML
    private Button butChange;
    
    
    
    @FXML
    private PasswordField pasCode;
        
    public PasswordField getPasCode() {
		return pasCode;
	}

	public void setPasCode(PasswordField pasCode) {
		this.pasCode = pasCode;
	}
	
	
	private Stage mainStage;
    
    public Stage getMainStage() {
		return mainStage;
	}

	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}
	
	
	@FXML
    public void switchWindow(ActionEvent event) throws IOException {
		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SafeBox2.fxml"));
		SafeBoxControllerGUI2 controller2 = new SafeBoxControllerGUI2();
		fxmlLoader.setController(controller2);
		Parent root2 = fxmlLoader.load();
		Scene scene2 = new Scene(root2);
		
		mainStage.setScene(scene2);
		mainStage.setTitle("Windows 2");
		mainStage.show();

    }
	
	
	
    
		
	
		
	@FXML
    public void enterPassword(ActionEvent event) {
		
    }
	
	
	
	
	

    @FXML
    private Button butChange3;
    
    
	private Stage thirdStage;
	
	public Stage getThirdStage() {
		return thirdStage;
	}

	public void setThirdStage(Stage thirdStage) {
		this.thirdStage = thirdStage;
	}

    @FXML
    public void switchWindow3(ActionEvent event) {
    	

    }

}
