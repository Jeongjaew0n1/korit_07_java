package ch18_static.singleton;

import lombok.Getter;

public class Samsung {
    private static Samsung instance;
    @Getter // getCompany를 생성
    private String company;
    private int serialNumber;


    private Samsung() {
        company = getClass().getSimpleName();
        serialNumber = 20250000;
    }

    public static Samsung getInstance() {
        if (instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + ++serialNumber;
    }


}
