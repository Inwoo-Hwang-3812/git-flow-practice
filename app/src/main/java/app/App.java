package app;

import services.PrintNameService;
import services.ReceiveNameService;

public class App {
    private final ReceiveNameService receiveNameService;
    private final PrintNameService printNameService;

    public App(ReceiveNameService receiveNameService,
               PrintNameService printNameService) {
        this.receiveNameService = receiveNameService;
        this.printNameService = printNameService;
    }

    public static void main(String[] args) {
        ReceiveNameService receiveNameService = new ReceiveNameService();
        PrintNameService printNameService = new PrintNameService();
        App app = new App(receiveNameService, printNameService);

        System.out.println(app.getGreeting());

        app.run();
    }

    public String getGreeting() {
        return "Into the new world!";
    }

    public String run() {
        String name = receiveNameService.getName();

        printNameService.printName(name);

        return name;
    }
}
