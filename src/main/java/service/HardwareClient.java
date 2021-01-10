package service;

import frentz.daniel.controllerclient.model.Hardware;
import frentz.daniel.controllerclient.model.HardwareController;

import java.util.List;

public interface HardwareClient {
    HardwareController createHardwareController(HardwareController hardwareController);
    HardwareController getHardwareController(long hardwareControllerId);
    List<HardwareController> getHardwareControllers(List<Long> hardwareControllerId);
}
