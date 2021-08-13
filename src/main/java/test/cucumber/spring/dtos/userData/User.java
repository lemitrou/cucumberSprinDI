package test.cucumber.spring.dtos.userData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import test.cucumber.spring.dtos.accountData.Account;

@Component
public class User {

    private String email;
    private String password;

    @Autowired
    Account account;


    public String getEmail(){
        return "Show email : " + account.getName();
    }
}
