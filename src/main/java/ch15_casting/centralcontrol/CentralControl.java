package ch15_casting.centralcontrol;

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
        System.out.println("장치가 연결되었습니다.");
    }

    private int checkEmpty() {
        for (int i = 0; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                return i;
            }
        }
        return -1;

    }
}
