package frentz.daniel.hardwareservice.client.service;

import frentz.daniel.hardwareservice.client.model.*;

import java.util.List;

public interface HardwareClient {
    HardwareController createHardwareController(HardwareController hardwareController);
    HardwareController getHardwareController(long hardwareControllerId);
    HardwareController addHardware(long hardwareControllerId, Hardware hardware);
    Timer addTimer(long hardwareId, Timer timer);
    Hardware setHardwareState(long hardwareId, HardwareState hardwareState);
    double readSensor(long sensorId);
    List<HardwareController> getHardwareControllers();
    double readAverageSensor(long hardwareControllerId, String sensorType);
    HardwareController addSensor(long hardwareControllerId, Sensor sensor);
}
