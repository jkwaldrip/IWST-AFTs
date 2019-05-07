package Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class QaFormPage {

  public QaFormPage goTo() {
    open("https://www.toolsqa.com/automation-practice-form/");
    return this;
  }

  public QaFormPage fillIn(String firstName, String lastName) {
    $("input[name=firstname]").setValue(firstName).shouldHave(value(firstName));
    $("input[name=lastname]").setValue(lastName).shouldHave(value(lastName));
    return this;
  }
}
