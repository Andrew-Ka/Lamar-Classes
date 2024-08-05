/**
 * Objective: Play tictactoe
 * Algorithm: Description how to resolve the problem.
 *Input and Output: Input clicks output dubs
 * Created by: Andrew Kalathra
 * Date:3/26/22
 * Version:1
 */
package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;

public class TicTacToe2 extends Application {
	private Cell[][] cell = new Cell[3][3];
	private Label lblStatus = new Label("X's turn");
	private char turn = 'X';
	
	public void start(Stage first) {
		GridPane pane = new GridPane();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				pane.add(cell[i][j]=new Cell(),j,i);
			}
		}

		BorderPane bpane = new BorderPane();
		bpane.setCenter(pane);
		bpane.setBottom(lblStatus);
		
		Scene scene = new Scene(bpane,450,450);
		first.setTitle("Display TicTacToe");
		first.setScene(scene);
		first.show();
	}
	public boolean isFull() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(cell[i][j].getToken() == ' ') {
					return false;
				}
			}
		}
		return true;
	}
	public boolean isWon(char token) {
		for(int i=0;i<3;i++) {
			if (cell[i][0].getToken()==token && cell[i][1].getToken()==token && cell[i][2].getToken()==token) {
				return true;
			}
		}
		for(int j=0;j<3;j++) {
			if (cell[0][j].getToken()==token && cell[0][j].getToken()==token && cell[0][j].getToken()==token) {
				return true;
			}
		}
		if (cell[0][0].getToken()==token && cell[1][1].getToken()==token && cell[2][2].getToken()==token) {
			return true;
		}
		if (cell[0][2].getToken()==token && cell[1][1].getToken()==token && cell[2][0].getToken()==token) {
			return true;
		}
		return false;
	}
	public class Cell extends Pane{
		private char token = ' ';
		
		public Cell() {
			setStyle("-fx-border-color:green");
			this.setPrefSize(800, 800);
			this.setOnMouseClicked(e->handleMouseClick());
		}
		
		public char getToken(){
			return token;
		}
		public void setToken(char c){
			token = c;
			
			if (token == 'X') {
				Line line1 = new Line(10,10,((this.getWidth())-10),((this.getHeight())-10));
				line1.endXProperty().bind(this.widthProperty().subtract(10));
				line1.endYProperty().bind(this.heightProperty().subtract(10));
				Line line2 = new Line(10,((this.getHeight())-10),((this.getWidth())-10),10);
				line2.startYProperty().bind(this.heightProperty().subtract(10));
				line2.endXProperty().bind(this.widthProperty().subtract(10));
				this.getChildren().addAll(line1, line2);
			}
			else if(token == 'O') {
			Ellipse ellipse = new Ellipse(this.getWidth() / 2, this.getHeight() / 2, ((this.getWidth())/2 - 10), ((this.getHeight()) / 2 -10));
			ellipse.centerXProperty().bind(this.widthProperty().divide(2));
			ellipse.centerYProperty().bind(this.heightProperty().divide(2));
			ellipse.radiusXProperty().bind(this.widthProperty().divide(2).subtract(10));
			ellipse.radiusYProperty().bind(this.heightProperty().divide(2).subtract(10));
			ellipse.setStroke(Color.BLACK);
			ellipse.setFill(Color.WHITE);
			getChildren().add(ellipse);
		
			}
		}
		private void handleMouseClick() {
			if(token == ' ' && turn != ' ') {
				setToken(turn);
				if(isWon(turn)) {
					lblStatus.setText(turn + " won. GAME OVER");
					turn = ' ';
				}
				else if(isFull()){
					lblStatus.setText("Draw. GAME OVER");
					turn = ' ';
				}
				else{
					turn = (turn=='X') ? 'O':'X';
					lblStatus.setText(turn+"'s turn");
				}
			}
			
		}
	}
	public static void main(String[] args) {
		launch(args);
	}

}
