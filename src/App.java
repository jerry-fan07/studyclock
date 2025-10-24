import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class App extends Application{
    
    public void start(Stage stage){
        PaneOrganizer pane = new PaneOrganizer();

        Scene scene = new Scene(pane.getRoot(), 800, 450);

        stage.setScene(scene);
        stage.setTitle("SET YOUR MIND TO IT");
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
