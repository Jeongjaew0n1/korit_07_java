package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    private String factoryName;

    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생성합니다.");
        // 접근지정자를 사용하지 않아 default 그리고 {} 영역 내에 있으니 지역변수
        String model = "갤럭시S26";
        String serial;

        // Samsung 객체를 생성 -> 싱글톤 썻으니까 어차피 동일한 객체가 계속 대입
        Samsung samsung = Samsung.getInstance();
        serial = samsung.createSerialNumber(model);
        // 지금 현재 리턴타입이 SmartPhone이기 떄문에 SmartPhone 객체가 튀어나와야하는데, 스마트폰 객체를 생성할 때
        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);

        return smartPhone;
    }
}
