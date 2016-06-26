package mytexteditor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Created by JasdipC on 2016-06-26.
 */
public class EditorModel {

    public void closeApplication() {
        System.exit(0);
    }

    public void saveFile(File textFile) {
        try {
            Files.write(textFile.getTextFile(), textFile.getContent(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public IOResult<File> openFile(Path file) {
        try {
            List<String> lines_of_code = Files.readAllLines(file);
            return new IOResult<>(true, new File(file, lines_of_code));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}
