package frentz.daniel.hardwareservice.client.model;

public class HardwareRegistrationMessage {
    private String hardwareSerialNumber;
    private Hardware hardware;


    public Hardware getHardware() {
        return hardware;
    }

    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public String getHardwareSerialNumber() {
        return hardwareSerialNumber;
    }

    public void setHardwareSerialNumber(String hardwareSerialNumber) {
        this.hardwareSerialNumber = hardwareSerialNumber;
    }
}
