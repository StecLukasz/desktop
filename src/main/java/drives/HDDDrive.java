package drives;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDDDrive implements Drive {

    private List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void listFiles() {
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String fileName) {
        Optional<File> foundFile = files.stream()
                .filter(file -> file.getName().equals(fileName))
                .findFirst();
        return foundFile.orElseThrow();
    }
}
