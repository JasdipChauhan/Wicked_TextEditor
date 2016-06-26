package mytexteditor;

import java.nio.file.Path;
import java.util.List;

/**
 * Created by JasdipC on 2016-06-26.
 */
public class File {

    private final Path textFile;

    private final List<String> content;

    public File(Path textFile, List<String> content) {
        this.textFile = textFile;
        this.content = content;
    }

    public Path getTextFile() {
        return textFile;
    }

    public List<String> getContent() {
        return content;
    }
}
