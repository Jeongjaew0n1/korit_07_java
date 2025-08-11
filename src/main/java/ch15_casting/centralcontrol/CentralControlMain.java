package ch15_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();

        CentralControl centralControl = new CentralControl(new Power[10]);

        centralControl.addDevice(computer1); // 여기서 (암시적) 업캐스팅이 이루어졌습니다.
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(mouse1);
        centralControl.addDevice(led1);
        centralControl.addDevice(printer1);
        centralControl.powerOn();
        centralControl.powerOff();

        System.out.println("-----------continue-----------");

        centralControl.showInfo();

        centralControl.performSpecificMethod();


    }
}
