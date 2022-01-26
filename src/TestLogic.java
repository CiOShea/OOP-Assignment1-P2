public class TestLogic {
    public static void main(String[] args) {
        //Creating an instance of LogicGate Object
        LogicGate logicSwitch = new LogicGate(true);

        System.out.println(logicSwitch.state());

        logicSwitch.negate();

        System.out.println(logicSwitch.state());

        logicSwitch.not();

        System.out.println(logicSwitch.state());


    }
}
