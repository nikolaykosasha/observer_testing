import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ServerAvailabilityObserverProm {
    @Test
    void ServerAvailabilityObserverProm (){
        // Открыть сайт Observer
        open("http://45.8.250.25/");
        //Ввести сервер подключения
        $("input.connection__input").setValue("wss://server.observer-app.pro");
        // Доступность backend сервера
        $("div.connection__check-section a.connection__check-button").click();
        // Сервер доступен
        $("div.connection__status").shouldHave(Condition.text("Server is available"));
    }

}
