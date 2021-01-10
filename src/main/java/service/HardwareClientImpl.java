package service;

import frentz.daniel.controllerclient.model.HardwareController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HardwareClientImpl implements HardwareClient{

    private RestTemplate restTemplate;
    private URI uri;

    public HardwareClientImpl(URI uri, RestTemplate restTemplate){
        this.restTemplate = restTemplate;
        this.uri = uri;
    }

    @Override
    public HardwareController createHardwareController(HardwareController hardwareController) {
        HardwareController result = this.restTemplate.postForEntity(uri, hardwareController, HardwareController.class).getBody();
        return result;
    }

    @Override
    public HardwareController getHardwareController(long hardwareControllerId) {
        HardwareController result = this.restTemplate.getForEntity(uri + String.valueOf(hardwareControllerId) + "/", HardwareController.class).getBody();
        return result;
    }

    @Override
    public List<HardwareController> getHardwareControllers(List<Long> hardwareControllerId) {
        List<HardwareController> result = new ArrayList<>();
        this.restTemplate.getForEntity(uri + String.valueOf(hardwareControllerId) + "/", HardwareController.class).getBody();
        return hardwareControllerId.stream().map((controllerId) -> this.getHardwareController(controllerId)).collect(Collectors.toList());
    }


}
