package app;

public class App {
    public String getGreeting() {
        return "Into the new world!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
