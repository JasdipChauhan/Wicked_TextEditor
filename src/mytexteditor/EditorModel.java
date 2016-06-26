package mytexteditor;

import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by JasdipC on 2016-06-26.
 */
public class EditorModel {

    public void closeApplication() {
        System.exit(0);
    }

    public void saveFile(File textFile) {
        try {
            Files.write(textFile.getTextFile(), textFile.getContent());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
