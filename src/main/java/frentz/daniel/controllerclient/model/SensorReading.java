package frentz.daniel.controllerclient.model;

public class SensorReading {
    private SensorType sensorType;
    private double value;

    public SensorType getSensorType() {
        return sensorType;
    }

    public void setSensorType(SensorType sensorType) {
        this.sensorType = sensorType;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
