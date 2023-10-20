import controller.Controller;
import model.Model;
import view.GUI;

import javax.swing.SwingUtilities;
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
            GUI view = new GUI();
            Controller controller = new Controller(model, view);
        });
    }
}
