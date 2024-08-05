package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class RandomColor extends Application {

	public void start(Stage first) {

		Pane pane = new Pane();

		Color color = new Color(Math.random(), Math.random(), Math.random(), Math.random());
		Text text = new Text("Color");
		text.setFill(color.darker().darker());

		pane.getChildren().add(text);
		text.xProperty().bind(pane.widthProperty().divide(2));
		text.yProperty().bind(pane.heightProperty().divide(2));

		Scene scene = new Scene(pane, 200, 200, color.brighter().brighter());
		first.setTitle("ColorRandom");
		first.setScene(scene);
		first.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
