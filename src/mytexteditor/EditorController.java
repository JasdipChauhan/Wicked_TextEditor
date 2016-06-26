package mytexteditor;

import javafx.fxml.FXML;

import java.awt.*;

/**
 * Created by JasdipC on 2016-06-26.
 */
public class EditorController {

    @FXML
    private TextArea textArea;

    private EditorModel model;

    public EditorController(EditorModel model) {
        this.model = model;
    }

    @FXML
    private void onOpen() {

    }

    @FXML
    private void onSave() {

    }

    @FXML
    private void onClose() {
        System.exit(0);
    }

    @FXML
    private void onAbout() {

    }

}
