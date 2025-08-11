package ch17_bean;

import lombok.Data;

@Data
// 여기에 애너테이션을 달면 class level
public class UserEntityLombok {
    // 여기에 달면 field level
    private int userid;
    private int password;
    private String email;
    private String name;
}
