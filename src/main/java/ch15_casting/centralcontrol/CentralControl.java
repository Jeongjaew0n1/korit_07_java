package ch15_casting.centralcontrol;

import java.util.Arrays;

public class CentralControl {
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }

    public void addDevice(Power device) {

        int emptyIndex = checkEmpty();
        if (emptyIndex == -1) {
            System.out.println("더 이상 장치를 연결할 수 없습니다.");
            return;
        }
        // private 으로 적용해놔서 method를 경유했습니다.
        deviceArray[emptyIndex] = device;
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
    }

    private int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }
        return -1;

    }

    public void powerOn() {
        /*
            해당 클래스의 필드인 Power[] 배열 내에 있는 객체들은 기본적으로 Power의 서브 클래스의 객체들입니다.
            즉, on() / off() method를 공통적으로 지니고 있습니다.
            그리고 Power 자료형으로 업캐스팅도 되어있습니다.
         */

        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                System.out.println("장치가 없어 전원을 켜지 않았습니다.");
                continue;
            }
            deviceArray[i].on();
        }

    }
    public void powerOff() {
        for (Power device : deviceArray) {
            if(device == null) {
                System.out.println("장치가 없어 전원을 끄지 않았습니다.");
                continue;
            }
            device.off();
        }
    }
    /*
        현재 배열 내에 각 개체들이 들어가있습니다.
        객체명.getClass().getSimpleName() 을 활용하여 클래스 배열만 출력된다는 것을 확인 가능
        deviceArray를 반복 돌려서 몇 번 인덱스에 어떤 클래스의 객체가 있는지 표시하는
        실행 예
        슬롯 [ 1 ] 번 : Computer
        ...
        슬롯 [ 10 ] 번 : Empty
     */
    public void showInfo() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] != null) {
                System.out.println("슬롯 [ " + (i+1) + " ] 번 : " + deviceArray[i].getClass().getSimpleName());
            } else {
                System.out.println("슬롯 [ " + (i+1) + " ] 번 : Empty");
            }
        }

    }

    /*
        이제 배열 내부를 돌면서 각 element 들의 고유 메서드들을 실행
        논리적으로는 말이 안됨
     */

    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device instanceof AirConditioner) {
                AirConditioner airConditioner = (AirConditioner) device; // 명시적 다운캐스팅
                airConditioner.changeMode();
            } else if (device instanceof Computer) {
                Computer computer = (Computer) device;
                computer.compute();
            } else if (device instanceof LED) {
                LED led = (LED) device;
                led.changeColor();
            } else if (device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if (device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            } else if (device == null) {
                System.out.println("장치가 비어있습니다.");
            } else {
                System.out.println("아직 지원하지 않는 기기입니다.");
            }
        }
    }

}
