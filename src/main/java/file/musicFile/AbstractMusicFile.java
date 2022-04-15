package file.musicFile;

import file.AbstractFile;
import file.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile{

    protected String nameOfBand;
    protected String title;

    protected AbstractMusicFile(String name, int size,String nameOfBand, String title) {
        super(name, size);
        this.nameOfBand = nameOfBand;
        this.title = title;
    }

    @Override
    public FileType getType() {
        return FileType.MUSIC;
    }

}
