/**
 * Objective: Play with sliders
 * Algorithm: Description how to resolve the problem.
 *Input and Output:Input nothing output sliders
 * Created by: Andrew Kalathra
 * Date: 3/31/22
 * Version:1
 */

package application;
//imports
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SliderStuff extends Application {

	public void start(Stage first) {
		Text text = new Text(20, 20, "Immovable");
		//just some text
		
		//now to make two sliders
		Slider slHoriz = new Slider();
		slHoriz.setShowTickLabels(true);
		slHoriz.setShowTickMarks(true);
		slHoriz.setValue(0);

		Slider slVert = new Slider();
		slVert.setOrientation(Orientation.VERTICAL);
		slVert.setShowTickLabels(true);
		slVert.setShowTickMarks(true);
		slVert.setValue(50);
		
		//these are pains
		Pane textPane = new Pane();
		textPane.getChildren().add(text);

		BorderPane pane = new BorderPane();
		pane.setCenter(textPane);
		pane.setBottom(slHoriz);
		pane.setRight(slVert);

		//make sure the sliders actually do something
		slHoriz.valueProperty().addListener(ov -> {
			text.setX(slHoriz.getValue() * textPane.getWidth() / slHoriz.getMax());
		});
		
		slVert.valueProperty().addListener(ov -> {
			text.setY(slVert.getMax()-(slVert.getValue() * textPane.getHeight() / slVert.getMax()));
		});
		
		//scene
		Scene scene = new Scene(pane, 500, 200);
		first.setTitle("Slider thing");
		first.setScene(scene);
		first.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
