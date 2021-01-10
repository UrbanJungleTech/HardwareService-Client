package frentz.daniel.controllerclient.model;

import java.util.ArrayList;
import java.util.List;

public class Hardware {
    private Long id;
    private Long port;
    private String name;
    private HardwareCategory hardwareCategory;
    private HardwareState desiredState;
    private HardwareState currentState;
    private Long hardwareId;
    private List<Timer> timers;

    public Hardware(){
        this.timers = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPort() {
        return port;
    }

    public void setPort(Long port) {
        this.port = port;
    }

    public Long getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(Long hardwareId) {
        this.hardwareId = hardwareId;
    }

    public HardwareCategory getHardwareCategory() {
        return hardwareCategory;
    }

    public void setHardwareCategory(HardwareCategory hardwareCategory) {
        this.hardwareCategory = hardwareCategory;
    }

    public HardwareState getDesiredState() {
        return desiredState;
    }

    public void setDesiredState(HardwareState desiredState) {
        this.desiredState = desiredState;
    }

    public HardwareState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(HardwareState currentState) {
        this.currentState = currentState;
    }

    public List<Timer> getTimers() {
        return timers;
    }

    public void setTimers(List<Timer> timers) {
        this.timers = timers;
    }
}
