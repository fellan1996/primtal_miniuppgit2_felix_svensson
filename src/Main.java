import controller.Controller;
import model.Model;
import view.GUI;

import javax.swing.SwingUtilities;
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model = Model.getInstance();
            GUI view = GUI.getInstance();
            Controller controller = new Controller(model, view);
        });
    }
}
