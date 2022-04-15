public class Monitor {
    private int wysokosc = 1200;
    private int szerokosc = 1920;

    public void setLowResolution() {
        wysokosc = 780;
        szerokosc = 1024;
    }

    public void setMaxResolution() {
        wysokosc = 1200;
        szerokosc = 1920;

    }

    public String getResolution() {
        return szerokosc + "x" + wysokosc;
    }

}
