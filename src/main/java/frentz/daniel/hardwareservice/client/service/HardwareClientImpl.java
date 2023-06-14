package frentz.daniel.hardwareservice.client.service;

import frentz.daniel.hardwareservice.client.model.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

public class HardwareClientImpl implements HardwareClient{

    private RestTemplate restTemplate;
    private URI uri;

    public HardwareClientImpl(URI uri, RestTemplate restTemplate){
        this.restTemplate = restTemplate;
        this.uri = uri;
    }

    @Override
    public HardwareController createHardwareController(HardwareController hardwareController) {
        HardwareController result = this.restTemplate.postForEntity(uri + "/hardwarecontroller/", hardwareController, HardwareController.class).getBody();
        return result;
    }

    @Override
    public HardwareController getHardwareController(long hardwareControllerId) {
        HardwareController result = this.restTemplate.getForEntity(uri + "/hardwarecontroller/" + String.valueOf(hardwareControllerId), HardwareController.class).getBody();
        return result;
    }

    @Override
    public Hardware addHardware(long hardwareControllerId, Hardware hardware){
        Hardware result = this.restTemplate.postForEntity(uri + "/hardwarecontroller/" + hardwareControllerId + "/hardware", hardware, Hardware.class).getBody();
        return result;
    }

    @Override
    public Sensor addSensor(long hardwareControllerId, Sensor sensor){
        Sensor result = this.restTemplate.postForEntity(uri + "/hardwarecontroller/" + hardwareControllerId + "/sensor", sensor, Sensor.class).getBody();
        return result;
    }

    @Override
    public Timer addTimer(long hardwareId, Timer timer){
        Timer result = this.restTemplate.postForEntity("/hardware/" + String.valueOf(hardwareId) + "/timer", timer, Timer.class).getBody();
        return result;
    }

    @Override
    public HardwareState setHardwareState(long hardwareId, HardwareState hardwareState){
        HardwareState result = this.restTemplate.postForEntity(uri + "/hardware/" + hardwareId + "/state", hardwareState, HardwareState.class).getBody();
        return result;

    }

    @Override
    public SensorReading readSensor(long sensorId){
        SensorReading result = this.restTemplate.getForObject(uri + "/sensor/" + String.valueOf(sensorId) + "/reading", SensorReading.class);
        return result;
    }

    @Override
    public List<HardwareController> getHardwareControllers() {
        List<HardwareController> result = this.restTemplate.getForObject(uri + "/hardwarecontroller", HardwareControllerList.class);
        return result;
    }

    @Override
    public SensorReading readAverageSensor(long hardwareControllerId, String sensorType){
        SensorReading result = this.restTemplate.getForObject(uri + "/hardwarecontroller/" + hardwareControllerId + "/averageSensorReading/" + sensorType, SensorReading.class);
        return result;
    }

}
