
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	JFrame gui;
	Panels panels = new Panels();

	public GUI() {

		gui = new JFrame("Kalender");

		gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		gui.setSize(1850, 500);

		JPanel container = new JPanel();

		ArrayList<LocalDate> currentWeek = Veckor.thisWeek();

		for (int i = 0; i < 7; i++) {
			container.add(panels.dayOfWeek(currentWeek.get(i))); // paneler för varje dag
		}

		gui.add(container);
		gui.setVisible(true);
	}

}