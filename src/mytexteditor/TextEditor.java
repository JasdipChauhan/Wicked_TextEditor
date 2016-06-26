package mytexteditor;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextEditor extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ui.fxml"));
        fxmlLoader.setControllerFactory(t -> new EditorController(new EditorModel()));


        primaryStage.setScene(new Scene(fxmlLoader.load()));
        primaryStage.show();
    }

}
