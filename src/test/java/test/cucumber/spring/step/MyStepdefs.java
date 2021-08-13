package test.cucumber.spring.step;

import io.cucumber.java8.En;
import org.springframework.beans.factory.annotation.Autowired;
import test.cucumber.spring.dtos.accountData.Account;
import test.cucumber.spring.dtos.userData.User;


public class MyStepdefs extends BaseStepDef implements En{

    @Autowired
    User user;

    @Autowired
    Account account;

    public MyStepdefs() {
        Given("^I in home page$", () -> {
            System.out.println(user.getEmail() + " + " + account.getName());
        });
    }
}

