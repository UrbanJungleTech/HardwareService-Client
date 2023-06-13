package frentz.daniel.hardwareservice.client.service;

import frentz.daniel.hardwareservice.client.model.*;

import java.util.List;

public interface HardwareClient {
    HardwareController createHardwareController(HardwareController hardwareController);
    HardwareController getHardwareController(long hardwareControllerId);
    Hardware addHardware(long hardwareControllerId, Hardware hardware);
    Timer addTimer(long hardwareId, Timer timer);
    Hardware setHardwareState(long hardwareId, HardwareState hardwareState);
    SensorReading readSensor(long sensorId);
    List<HardwareController> getHardwareControllers();
    SensorReading readAverageSensor(long hardwareControllerId, String sensorType);
    Sensor addSensor(long hardwareControllerId, Sensor sensor);
}
