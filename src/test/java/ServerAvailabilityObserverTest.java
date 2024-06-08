import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class ServerAvailabilityObserverTest {
    @Test
    void ServerAvailabilityObserverTest (){
        // Открыть сайт Observer
        open("http://45.8.250.25/");
        //Ввести сервер подключения
        $("input.connection__input").setValue("ws://84.38.181.252");
        // Доступность backend сервера
        $("div.connection__check-section a.connection__check-button").click();
        // Сервер доступен
        $("div.connection__status").shouldHave(Condition.text("Server is available"));

    }
}
