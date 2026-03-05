import java.util.ArrayList;
import java.util.List;

public class DeviceRegistry {

    private List<PowerControllable> powerDevices = new ArrayList<>();
    private List<BrightnessControllable> brightnessDevices = new ArrayList<>();
    private List<TemperatureControllable> temperatureDevices = new ArrayList<>();
    private List<AttendanceScannable> scanners = new ArrayList<>();

    public void add(Object device) {

        if (device instanceof PowerControllable)
            powerDevices.add((PowerControllable) device);

        if (device instanceof BrightnessControllable)
            brightnessDevices.add((BrightnessControllable) device);

        if (device instanceof TemperatureControllable)
            temperatureDevices.add((TemperatureControllable) device);

        if (device instanceof AttendanceScannable)
            scanners.add((AttendanceScannable) device);
    }

    public List<PowerControllable> getPowerDevices() {
        return powerDevices;
    }

    public List<BrightnessControllable> getBrightnessDevices() {
        return brightnessDevices;
    }

    public List<TemperatureControllable> getTemperatureDevices() {
        return temperatureDevices;
    }

    public List<AttendanceScannable> getScanners() {
        return scanners;
    }
}