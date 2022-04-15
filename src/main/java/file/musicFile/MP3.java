package file.musicFile;

public class MP3 extends AbstractMusicFile{
    private int quality;


    public MP3(String name, int size, String nameOfBand, String title, int quality) {
        super(name, size, nameOfBand, title);
        this.quality=quality;
    }

    @Override
    public void play() {
        System.out.println("Music played");

    }

    public int getQuality() {
        return quality;
    }
}
