/**
 * Objective: Play anthem with flags
 * Algorithm: Description how to resolve the problem.
 *Input and Output:Input nothing output flags and anthems
 * Created by: Andrew Kalathra
 * Date: 4/7/22
 * Version:1
 */
package application;

import java.io.File;
//all the imports
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CountryFlags extends Application{
	//list of countries
	private String[] countries = {"US", "Canada", "Mexico", "India", "China", "Brazil", "Japan"};
	//flag images
	private ImageView[] flags= {
		new ImageView("Images/US.gif"),
		new ImageView("Images/Canada.gif"),
		new ImageView("Images/Mexico.gif"),
		new ImageView("Images/India.gif"),
		new ImageView("Images/China.gif"),
		new ImageView("Images/Brazil.gif"),
		new ImageView("Images/Japan.gif"),
	};
	//country anthems
	//make sure to unzip the file and place it in
	//the right location before running
	private Media[] anthems= {
		new Media(new File("Audio WAV/US-Audio.wav").toURI().toString()),	
		new Media(new File("Audio WAV/Canada-Audio.wav").toURI().toString()),
		new Media(new File("Audio WAV/Mexico-Audio.wav").toURI().toString()),
		new Media(new File("Audio WAV/India-Audio.wav").toURI().toString()),
		new Media(new File("Audio WAV/China-Audio.wav").toURI().toString()),
		new Media(new File("Audio WAV/Brazil-Audio.wav").toURI().toString()),
		new Media(new File("Audio WAV/Japan-Audio.wav").toURI().toString())
	};
	
	public void start(Stage first) {
		//show all countries
		ListView<String> countryList =  new ListView<> (FXCollections.observableArrayList(countries));
		countryList.setPrefSize(400, 400);
		countryList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);;
		
		FlowPane mainPane = new FlowPane(10,10);
		//county picked
		countryList.getSelectionModel().selectedItemProperty().addListener(ov -> {
			mainPane.getChildren().clear();
			//play animation and audio
			for(Integer i: countryList.getSelectionModel().getSelectedIndices()) {
				mainPane.getChildren().add(flags[i]);
				PathTransition flagPole = new PathTransition(Duration.seconds(5),
					new Line(350,600,350,200), flags[i]
					);
				
				flagPole.setCycleCount(1);
				flagPole.play();
				MediaPlayer player = new MediaPlayer(anthems[i]);
				player.play();
			}
		});
		
		//scroll pane
		ScrollPane sidePane = new ScrollPane(countryList);
		
		BorderPane pane = new BorderPane();
		sidePane.setMaxSize(200, 200);
		pane.setLeft(sidePane);
		pane.setCenter(mainPane);
		//set scene
		Scene scene =new Scene(pane, 800, 500);
		first.setTitle("Flag Rising");
		first.setScene(scene);
		first.show();
	}
	//launch
	public static void main(String[] args) {
		launch(args);
	}
}
