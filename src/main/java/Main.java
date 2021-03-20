import com.google.inject.Guice;
import com.google.inject.Injector;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());

        MyApplication app = injector.getInstance(MyApplication.class);
        app.sendMessage("Hi Martin", "martin.champarini.dev@gmail.com");
        app.sendMessage("Hi Gustavo", "martin.champarini.dev@gmail.com");
        app.sendMessage("Hi Martin", "martin.champarini.dev@gmail.com");
        app.sendMessage("Hi Martin", "martin.champarini.dev@gmail.com");
        app.sendMessage("Hi Martin", "martin.champarini.dev@gmail.com");
        MyApplication a = new MyApplication();
        a.sendMessage("Hi Martin A ", "martin.champarini.dev@gmail.com A");
    }

}
