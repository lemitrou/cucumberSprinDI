package test.cucumber.spring.dtos.accountData;

import org.springframework.stereotype.Component;

@Component
public class Account {

    private String email;
    private String name;

    public Account() {
        System.out.println("Inside Account constructor");
    }

    public String getName(){
        return "Test account";
    }
}
