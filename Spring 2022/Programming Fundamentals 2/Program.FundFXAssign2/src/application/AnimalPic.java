package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AnimalPic extends Application {

	public void start(Stage first) {

		Pane pane = new HBox(10);
		pane.setPadding(new Insets(5, 5, 5, 5));
		// this is a pane

		Image animals = new Image(
				"https://i.natgeofe.com/n/a46e1944-1dde-43b3-b8ec-64fda9041926/MM9392_200927_069070.jpg?w=1260&h=839");
		pane.getChildren().add(new ImageView(animals));
		// this is the image

		Scene scene = new Scene(pane);
		first.setTitle("Show Image");
		first.setScene(scene);
		first.show();
		// this is to show the image
	}

	public static void main(String[] args) {
		launch(args);
		// this runs the whole thing

	}

}
