import USBDevice.Mouse;
import USBDevice.Pendrive;
import drives.HDDDrive;
import drives.SDDDrive;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
//        HDDDrive drive = new HDDDrive();
        SDDDrive drive = new SDDDrive();


        Computer computer = new Computer(monitor, drive);


//        drive.addFile(new file.File("coś nowego 2"));
//        drive.listFiles();

        Pendrive pendrive = new Pendrive("Pendrive");
        Mouse mouse = new Mouse("mysz");

        computer.addUSBDevice(pendrive);
        computer.addUSBDevice(mouse);
        computer.removeDevice(pendrive);
    }
}
