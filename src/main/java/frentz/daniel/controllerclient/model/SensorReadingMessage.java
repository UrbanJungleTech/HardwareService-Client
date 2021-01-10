package frentz.daniel.controllerclient.model;

public class SensorReadingMessage {
    private String sensorSerialNumber;
    private SensorType[] sensorTypes;

    public String getSensorSerialNumber() {
        return sensorSerialNumber;
    }

    public void setSensorSerialNumber(String sensorSerialNumber) {
        this.sensorSerialNumber = sensorSerialNumber;
    }

    public SensorType[] getSensorTypes() {
        return sensorTypes;
    }

    public void setSensorTypes(SensorType[] sensorTypes) {
        this.sensorTypes = sensorTypes;
    }
}
