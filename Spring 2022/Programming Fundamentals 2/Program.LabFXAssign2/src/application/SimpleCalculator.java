/**
 * Objective: Create a simple four function calculator
 * Algorithm: Description how to resolve the problem.
 *Input and Output: Input numbers output solution
 * Created by: Andrew Kalathra
 * Date:3/26/22
 * Version:1
 */

package application;
//imports
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SimpleCalculator extends Application{

	public void start(Stage first) {
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		//making pane and making textfields 
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		
		tfNumber1.setPrefColumnCount(3);
		tfNumber2.setPrefColumnCount(3);
		tfResult.setPrefColumnCount(3);
		
		pane.getChildren().addAll(new Label("Number 1: "),tfNumber1, 
				new Label("Number 2: "),tfNumber2,
				new Label("Result: "),tfResult);
		//making buttons
		HBox hbox = new HBox(5);
		Button btAdd = new Button("Add");
		Button btSubtract = new Button("Subtract");
		Button btMultiple = new Button("Multiply");
		Button btDivide = new Button("Divide");
		
		hbox.setAlignment(Pos.CENTER);
		hbox.getChildren().addAll(btAdd, btSubtract, btMultiple, btDivide);
		
		BorderPane bpane = new BorderPane();
		bpane.setCenter(pane);
		bpane.setBottom(hbox);
		//making a scene
		Scene scene = new Scene(bpane, 320, 85);
		first.setTitle("Simple Calculator");
		first.setScene(scene);
		first.show();
		//assigning roles to the buttons
		btAdd.setOnAction(e->{
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) + 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btSubtract.setOnAction(e->{
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) - 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btMultiple.setOnAction(e->{
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) * 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		btDivide.setOnAction(e->{
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) / 
					Double.parseDouble(tfNumber2.getText()) + "");
		});
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
