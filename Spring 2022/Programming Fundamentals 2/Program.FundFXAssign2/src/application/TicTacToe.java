/**
 * Objective: Make a tictactoe board
 * Algorithm: Description how to resolve the problem.
 *Input and Output:I: None, O:tic tac toe board
 * Created by: Andrew Kalathra
 * Date:3/5/22
 * Version:1
 */

package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TicTacToe extends Application {
	public void start(Stage first) {

		// upload images
		Image x = new Image("Images/X.png");
		Image o = new Image("Images/O.png");

		// make the board
		GridPane board = new GridPane();
		board.setAlignment(Pos.CENTER);
		board.setHgap(5);
		board.setVgap(5);

		// put pieces randomly on the board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				int status = (int) (Math.random() * 3);
				if (status == 0) {
					board.add(new ImageView(x), j, i);
				} else if (status == 1) {
					board.add(new ImageView(o), j, i);
				}
			}
		}

		// normal stuff
		Scene scene = new Scene(board);
		first.setTitle("Display TicTacToe");
		first.setScene(scene);
		first.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
