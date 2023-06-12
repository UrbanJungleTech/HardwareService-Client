package frentz.daniel.hardwareservice.client.model;

import java.util.ArrayList;
import java.util.List;

public class Sensor {
    private Long id;
    private String sensorType;
    private long port;
    private String name;
    private long hardwareControllerId;
    private List<ScheduledSensorReading> scheduledSensorReadings;

    public Sensor(){
        this.scheduledSensorReadings = new ArrayList<>();
    }

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public long getHardwareControllerId() {
        return hardwareControllerId;
    }

    public void setHardwareControllerId(long hardwareControllerId) {
        this.hardwareControllerId = hardwareControllerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ScheduledSensorReading> getScheduledSensorReadings() {
        return scheduledSensorReadings;
    }

    public void setScheduledSensorReadings(List<ScheduledSensorReading> scheduledSensorReadings) {
        this.scheduledSensorReadings = scheduledSensorReadings;
    }
}
