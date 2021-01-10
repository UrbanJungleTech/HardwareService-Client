package frentz.daniel.controllerclient.model;

import java.util.List;

public class Sensor {
    private long id;
    private List<SensorType> sensorTypes;
    private long hardwareControllerId;
    private String serialNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHardwareControllerId() {
        return hardwareControllerId;
    }

    public void setHardwareControllerId(long hardwareControllerId) {
        this.hardwareControllerId = hardwareControllerId;
    }

    public List<SensorType> getSensorTypes() {
        return sensorTypes;
    }

    public void setSensorTypes(List<SensorType> sensorType) {
        this.sensorTypes = sensorType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
