package Behavioral.Strategy;

public class Car  {
    Actionable action;
    private String name;


    public void action() {
        action.action();
    }

    public Actionable getAction() {
        return action;
    }

    public void setAction(Actionable action) {
        this.action = action;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
