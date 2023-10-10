package app;

import services.ReceiveNameService;

public class App {
    private final ReceiveNameService receiveNameService;

    public App(ReceiveNameService receiveNameService) {
        this.receiveNameService = receiveNameService;
    }

    public static void main(String[] args) {
        ReceiveNameService receiveNameService = new ReceiveNameService();

        App app = new App(receiveNameService);

        System.out.println(app.getGreeting());

        app.run();
    }

    public String getGreeting() {
        return "Into the new world!";
    }

    public String run() {
        String name = receiveNameService.getName();

        return name;
    }
}
