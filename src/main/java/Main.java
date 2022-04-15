import drives.SDDDrive;
import file.imageFile.GIFImageFile;
import file.imageFile.JPGImageFile;
import file.musicFile.MP3;

public class Main {
    public static void main(String[] args) {

        GIFImageFile gif = new GIFImageFile("nowy gifffek",100);
        JPGImageFile jpg = new JPGImageFile("cos tam 1", 400, 9);
        MP3 mp3 = new MP3("mp3", 2, "aa", "bb", 99);


        SDDDrive drive = new SDDDrive();

        drive.addFile(gif);
        drive.addFile(jpg);
        drive.addFile(mp3);

        drive.listFiles();
        drive.findFile("mp3");
        System.out.println(gif.getSize());
    }

}
