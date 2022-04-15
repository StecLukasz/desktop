import USBDevice.USBDevice;
import drives.Drive;
import drives.SDDDrive;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private Monitor monitor;
    private Drive drive;
    private Headphones headphones;


    List<USBDevice> usbDevices = new ArrayList<>();


    public Computer(Monitor monitor, SDDDrive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Headphones getHeadphones() {
        return headphones;
    }

    public void setHeadphones(Headphones headphones) {
        this.headphones = headphones;
    }

    private List<USBDevice> getUsbDevices() {
        return usbDevices;
    }

    public void addUSBDevice(USBDevice usbDevice) {
        boolean isConnected = usbDevice.connect();
        if (isConnected) {
            usbDevices.add(usbDevice);
        }
    }

    public void removeDevice(USBDevice usbDevice) {
        boolean isDisconected = usbDevice.disconnect();
        if ((isDisconected)) {
            System.out.println("Pendrive removed by force");
        }
        usbDevices.remove(usbDevice);
    }
}
