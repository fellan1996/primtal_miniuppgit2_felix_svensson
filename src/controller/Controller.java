package controller;

import model.Model;
import view.GUI;

import java.util.List;

public class Controller {
    private Model model;
    private GUI view;

    public Controller(Model model, GUI view) {
        this.model = model;
        this.view = view;
        updateView();
    }
    public void updateView() {
        List<Integer> primeNumbers = model.getPrimes();
        view.updateTextArea(primeNumbers);
    }
}
