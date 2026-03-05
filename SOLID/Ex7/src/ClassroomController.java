public class ClassroomController {

    private DeviceRegistry registry;

    public ClassroomController(DeviceRegistry registry) {
        this.registry = registry;
    }

    public void startClass() {

        for (PowerControllable device : registry.getPowerDevices()) {
            device.powerOn();
        }

        for (BrightnessControllable device : registry.getBrightnessDevices()) {
            device.setBrightness(60);
        }

        for (TemperatureControllable device : registry.getTemperatureDevices()) {
            device.setTemperature(24);
        }

        for (AttendanceScannable scanner : registry.getScanners()) {
            scanner.scanAttendance();
        }
    }

    public void endClass() {

        System.out.println("Shutdown sequence:");

        for (PowerControllable device : registry.getPowerDevices()) {
            device.powerOff();
        }
    }
}
