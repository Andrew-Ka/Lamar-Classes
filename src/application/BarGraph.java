/**
 * Objective: Make a Bar Chart
 * Algorithm: Description how to resolve the problem.
 *Input and Output:I: None, O:Bar Chart
 * Created by: Andrew Kalathra
 * Date:3/5/22
 * Version:1
 */

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
//import everything
public class BarGraph extends Application{
	
	public void start(Stage first) {
		Pane pane = new Pane();
		
		//making presets
		double height = 300;
		double painHeight = 150;
		
		//making 4 rectangles
		Rectangle r1 = new Rectangle(10, painHeight-height * .2, 100, height*.2);
		r1.setFill(Color.RED);
		Text text = new Text(10,painHeight-height * .2 - 10 , "Project-------20%");
		
		Rectangle r2 = new Rectangle(10+110, painHeight-height * .1, 100, height*.1);
		r2.setFill(Color.BLUE);
		Text text2 = new Text(10+110,painHeight-height * .1 - 10 , "Quiz-------10%");
		
		Rectangle r3 = new Rectangle(10+220, painHeight-height * .3, 100, height*.3);
		r3.setFill(Color.GREEN);
		Text text3 = new Text(10+220,painHeight-height * .3 - 10 , "Midterm-------30%");
		
		Rectangle r4 = new Rectangle(10+330, painHeight-height * .4, 100, height*.4);
		r4.setFill(Color.ORANGE);
		Text text4 = new Text(10+330,painHeight-height * .4 - 10 , "Final-------40%");
		
		//adding everything to the pain
		pane.getChildren().addAll(r1, text, r2, text2, r3, text3, r4, text4);
		
		//scene and show
		Scene scene = new Scene(pane, 500, painHeight);
		first.setTitle("Bar Chart");
		first.setScene(scene);
		first.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
