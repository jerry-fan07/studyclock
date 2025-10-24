import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

import javafx.util.Duration;
import javafx.animation.Timeline;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.event.ActionEvent;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;

import javafx.geometry.*;
import javafx.scene.control.Label;

public class PaneOrganizer {
    private Label clock;
    private BorderPane root;
    
    public PaneOrganizer(){
        this.root = new BorderPane();
        this.root.setStyle("-fx-background-color: #000000");
        
        // set up center
        VBox centerBox = new VBox();
        root.setCenter(centerBox);
        centerBox.setAlignment(Pos.CENTER);
        
        // set up clock
        this.clock = new Label();
        this.clock.setTextFill(Color.LIGHTYELLOW);
        this.clock.setFont(new Font(300));
        centerBox.getChildren().add(this.clock);
        this.updateClock();
        this.setUpTimeline();
    }

    public void updateClock(){
        SimpleDateFormat date = new SimpleDateFormat("h:mm a", Locale.US);
        this.clock.setText(date.format(new Date()));
    }

    public void setUpTimeline(){
        KeyFrame kf = new KeyFrame(Duration.seconds(30),
        (ActionEvent e) -> this.updateClock());
        Timeline time = new Timeline(kf);
        time.setCycleCount(Animation.INDEFINITE);
        time.play();
    }

    public BorderPane getRoot(){
        return this.root;
    }

}
