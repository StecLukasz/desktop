package USBDevice;

public class Pendrive implements USBDevice {
    private String name;
    private boolean ejected = false;
    public Pendrive(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Pendrive connected");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("Please eject Pendrive");
            return true;
        } else{
            System.out.println("Pendrive disconnected");
            return true;
        }
    }
    public void eject(){
        System.out.println("Ejecting Pendrive");
        ejected=true;
    }

    @Override
    public String getName() {
        return name;
    }

}

