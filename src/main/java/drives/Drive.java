package drives;


import file.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile (String fileName);


}

