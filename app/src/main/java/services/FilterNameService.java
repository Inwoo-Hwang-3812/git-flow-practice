package services;

public class FilterNameService {

    public void filterName(String name) {
        if (!name.matches("^([a-zA-Z\\s])+$")) {
            throw new IllegalArgumentException("Only English allowed.");
        }
    }
}
