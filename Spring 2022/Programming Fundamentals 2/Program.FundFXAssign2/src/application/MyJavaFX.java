package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class MyJavaFX extends Application{

	public void start(Stage first) {
		Button btnOK = new Button("OK");
		Scene scene = new Scene(btnOK, 200, 250);
		first.setTitle("MyJavaFX");
		first.setScene(scene);
		first.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
