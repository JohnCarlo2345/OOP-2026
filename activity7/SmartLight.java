package activity7;

public class SmartLight extends SmartDevice {
    int brightness;
    public SmartLight(String DeviceName) {
        super(deviceName);
        this.brightness = 0;
    }
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Brightness Level: " + brightness);
    }
    public void setBrightness(int level) {
        if (isOn && level >= 0 && level <= 100) {
            this.brightness = level;
        }
    }
}
