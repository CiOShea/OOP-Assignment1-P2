public class LogicGate {
    //field variable declared for LogicGate object
    boolean isOn;

    //Constructor method.
    public LogicGate(boolean isOn) {
        this.isOn = isOn;
    }

    //Method to change boolean field to true
    public void setOn(boolean on) {
        isOn = on;
    }

    //Change boolean from true -> false or false -> true.
    public void not() {
        setOn(!isOn);
    }

    //Method to return the current state of boolean
    public boolean state() {
        return isOn;
    }

    //method to set the boolean to true
    public void set() {
        isOn = true;
    }

    //method to set boolean to false
    public void negate() {
        isOn = false;
    }

}
