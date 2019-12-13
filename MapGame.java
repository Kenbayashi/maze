import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

public class MapGame extends Application {
    Stage stage;

    Scene start, game;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
	stage = primaryStage;
	primaryStage.setTitle("MAP GAME");

	game = setPage("MapGame.fxml");
	primaryStage.setScene(game);
	primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }

    //画面遷移
    public void toNextScene() {
        start = setPage("Start.fxml");
        stage.setScene(start);
    }
    
    private Scene setPage(String fxml) {
        try {
	        Pane newPane = (Pane)FXMLLoader.load(getClass().getResource(fxml));
            Scene newScene = new Scene(newPane);
            return newScene;
        } catch (Exception e) {
            System.out.println("そんなfxmlファイルはありません");
        }
        return null;
    }
}
