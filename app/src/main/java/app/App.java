package app;

import services.FilterNameService;
import services.PrintNameService;
import services.ReceiveNameService;

public class App {
    private final ReceiveNameService receiveNameService;
    private final PrintNameService printNameService;
    private final FilterNameService filterNameService;

    public App(ReceiveNameService receiveNameService,
               PrintNameService printNameService,
               FilterNameService filterNameService) {
        this.receiveNameService = receiveNameService;
        this.printNameService = printNameService;
        this.filterNameService = filterNameService;
    }

    public static void main(String[] args) {
        try {
            ReceiveNameService receiveNameService = new ReceiveNameService();
            PrintNameService printNameService = new PrintNameService();
            FilterNameService filterNameService = new FilterNameService();
            App app = new App(
                receiveNameService,
                printNameService,
                filterNameService
            );

            System.out.println(app.getGreeting());

            app.run();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public String getGreeting() {
        return "Into the new world!";
    }

    public String run() {
        String name = receiveNameService.getName();

        filterNameService.filterName(name);

        printNameService.printName(name);

        return name;
    }
}
