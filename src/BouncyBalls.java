import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BouncyBalls extends Application{
	private class BallPane extends Pane{
		private Timeline animation;
		
		public BallPane() {
			animation = new Timeline(new KeyFrame(Duration.millis(50), e -> ballMotion()));
			animation.setCycleCount(Timeline.INDEFINITE);
			animation.play();
		}
		
		public void add() {
			Color color = new Color(Math.random(),Math.random(),Math.random(),.5);
			getChildren().add(new Ball(30,30,20,color));
		}
		public void subtract() {
			if(getChildren().size()>0) {
				getChildren().remove(getChildren().size()-1);
			}
		}
		
		public void play() {
			animation.play();
		}
		public void pause() {
			animation.pause();
		}
		public void increaseSpeed() {
			animation.setRate(animation.getRate()+.1);
		}
		public void decreaseSpeed() {
			animation.setRate(animation.getRate()>0?animation.getRate()-.1:0);
		}
		public DoubleProperty rateProperty() {
			return animation.rateProperty();
		}
		
		protected void ballMotion() {
			for(Node node: this.getChildren()) {
				Ball ball = (Ball)node;
				if(ball.getCenterX()<ball.getRadius()|| ball.getCenterX()>getWidth()-ball.getRadius()) {
					ball.dx *= -1;
				}
				if(ball.getCenterY()<ball.getRadius()|| ball.getCenterY()>getWidth()-ball.getRadius()) {
					ball.dy *= -1;
				}
				
				ball.setCenterX(ball.dx + ball.getCenterX());
				ball.setCenterY(ball.dy + ball.getCenterX());
			}
		}
	}
	class Ball extends Circle{
		private double dx =1, dy=1;
		
		Ball (double x, double y, double radius, Color color){
			super(x, y, radius);
			setFill(color);
		}
	}
	
	public void start(Stage first) {
		BallPane ballpane = new BallPane();
		ballpane.setStyle("-fx-border-color: green");
		
		Button btAdd = new Button("+");
		Button btSubtract = new Button("-");
		HBox hBox = new HBox(10);
		hBox.getChildren().addAll(btAdd, btSubtract);
		hBox.setAlignment(Pos.CENTER);
		
		btAdd.setOnAction(e-> ballpane.add());
		btSubtract.setOnAction(e->ballpane.subtract());
		
		ballpane.setOnMousePressed(e-> ballpane.pause());
		ballpane.setOnMouseReleased(e-> ballpane.play());
		
		ScrollBar ballSpeed = new ScrollBar();
		ballSpeed.setMax(30);
		ballSpeed.setValue(10);
		ballpane.rateProperty().bind(ballSpeed.valueProperty());
		
		BorderPane pane = new BorderPane();
		pane.setCenter(ballpane);
		pane.setTop(ballSpeed);
		pane.setBottom(hBox);
		
		Scene scene = new Scene(pane, 250, 150);
		first.setTitle("Bouncing Balls");
		first.setScene(scene);
		first.show();
		}
	public static void main(String[] args) {
		launch(args);
	}

}
