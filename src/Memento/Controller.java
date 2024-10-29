package Memento;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> undoHistory; // Memento history
    private List<IMemento> redoHistory; // Memento redo history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoHistory = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        redoHistory.clear(); // Tyhjennetään historia kun tehdään uusi "nykyhetken" muutos.
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);
        redoHistory.clear(); // Tyhjennetään historia kun tehdään uusi "nykyhetken" muutos.
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in history");
            saveToRedoHistory();
            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            model.restoreState(previousState);
            //undoHistory.add(model.createMemento()); // Save current state to redo history
            gui.updateGui();
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Redo operation");
            saveToHistory();
            IMemento nextState = redoHistory.remove(redoHistory.size() - 1);
            //redoHistory.add(model.createMemento()); // Save current state to undo history
            model.restoreState(nextState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undoHistory.add(currentState);
    }

    private void saveToRedoHistory() {
        IMemento currentState = model.createMemento();
        redoHistory.add(currentState);
    }
}
