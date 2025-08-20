package test.mapList;

import java.util.*;

public class MapList {
    public static void main(String[] args) {
//        List<Map<String, Object>> customers = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> customers = new ArrayList<>();

        Map<String, Object> customerMap1 = new HashMap<>();
        customerMap1.put("name", "홍길동");
        customerMap1.put("rating", "vip");
        customerMap1.put("age", 30);
        customers.add(customerMap1);

        Map<String, Object> customerMap2 = new HashMap<>();
        customerMap2.put("name", "김가영");
        customerMap2.put("rating", "gold");
        customerMap2.put("age", 35);
        customers.add(customerMap2);

        for (Map<String, Object> customer : customers) {
            for (Map.Entry<String, Object> entry : customer.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
        }
    }
}
