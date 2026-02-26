package activity7;

public class SmartDevice {
    String deviceName;
    boolean isOn;
    public SmartDevice(String devicename, boolean ison) {
        this.deviceName = deviceName;
        this.isOn = false;
    }

    public void togglepower() {
        isOn = !isOn;

    }

    public void displayStatus() {
        System.out.println("Device Name: " + deviceName);
        System.out.println("Power Status: " + (isOn ? "On" : "Off"));
    }
}
