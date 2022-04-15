package file.imageFile;

public class JPGImageFile extends AbstractImageFile {
    private int compresion;

    public JPGImageFile(String name, int size, int compresion) {
        super(name, size);
        this.compresion = compresion;

    }

    public int compresion() {
        return compresion;
    }

    public void displayImage() {
        System.out.println("Dispaing JPG");
    }


}
