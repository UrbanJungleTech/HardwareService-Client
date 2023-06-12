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
    public HardwareController addHardware(long hardwareControllerId, Hardware hardware){
        HardwareController result = this.restTemplate.postForEntity(uri + "/hardwarecontroller/" + hardwareControllerId + "/hardware", hardware, HardwareController.class).getBody();
        return result;
    }

    @Override
    public HardwareController addSensor(long hardwareControllerId, Sensor sensor){
        HardwareController result = this.restTemplate.postForEntity(uri + "/hardwarecontroller/" + hardwareControllerId + "/sensor", sensor, HardwareController.class).getBody();
        return result;
    }

    @Override
    public Timer addTimer(long hardwareId, Timer timer){
        Timer result = this.restTemplate.postForEntity("/hardware/" + String.valueOf(hardwareId) + "/timer", timer, Timer.class).getBody();
        return result;
    }

    @Override
    public Hardware setHardwareState(long hardwareId, HardwareState hardwareState){
        Hardware result = this.restTemplate.postForEntity(uri + "/hardware/" + hardwareId + "/state", hardwareState, Hardware.class).getBody();
        return result;

    }

    @Override
    public double readSensor(long sensorId){
        double result = this.restTemplate.getForObject(uri + "/sensor" + String.valueOf(sensorId), Double.class);
        return result;
    }

    @Override
    public List<HardwareController> getHardwareControllers() {
        List<HardwareController> result = this.restTemplate.getForObject(uri + "/hardwarecontroller", HardwareControllerList.class);
        return result;
    }

    @Override
    public double readAverageSensor(long hardwareControllerId, String sensorType){
        double result = this.restTemplate.getForObject(uri + "/hardwarecontroller/" + hardwareControllerId + "/averageSensorReading/" + sensorType, Double.class);
        return result;
    }

}
