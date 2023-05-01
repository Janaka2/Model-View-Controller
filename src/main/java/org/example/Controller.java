package org.example;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void updateData(String data) {
        model.setData(data);
        view.displayData(data);
    }
}
