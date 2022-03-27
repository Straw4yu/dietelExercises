package tddClass;

public class PowerBike {
    private boolean isOn;

    public void turnOn() {
        isOn = !isOn;
    }

    public boolean getPowerStatus() {
    return isOn;}
}
