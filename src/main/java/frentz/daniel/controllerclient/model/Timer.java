package frentz.daniel.controllerclient.model;

public class Timer {
    private Long id;
    private long onLevel;
    private String onCronExpression;
    private String offCronExpression;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOnCronExpression() {
        return onCronExpression;
    }

    public void setOnCronExpression(String onCronExpression) {
        this.onCronExpression = onCronExpression;
    }

    public String getOffCronExpression() {
        return offCronExpression;
    }

    public void setOffCronExpression(String offCronExpression) {
        this.offCronExpression = offCronExpression;
    }

    public long getOnLevel() {
        return onLevel;
    }

    public void setOnLevel(long onLevel) {
        this.onLevel = onLevel;
    }
}
