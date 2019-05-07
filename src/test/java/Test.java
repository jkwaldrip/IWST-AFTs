import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import Pages.QaFormPage;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;

public class Test {

  @org.junit.Test
  public void fillInFormTest() {
    QaFormPage qaFormPage = new QaFormPage()
        .goTo()
        .fillIn("Jain", "Waldrip");

  }
}
