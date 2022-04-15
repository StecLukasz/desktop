package drives;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SDDDrive implements Drive {
    private Map<String, File> fileMap = new HashMap<>();

    @Override
    public void addFile(File file) {
        fileMap.put(file.getName(), file);

    }

    @Override
    public void listFiles() {
        Collection<File> fileCollection = fileMap.values();
        for (File file : fileCollection) {
            System.out.println(file.getName());
        }

    }

    @Override
    public File findFile(String fileName) {
        return fileMap.get(fileName);
    }
}
