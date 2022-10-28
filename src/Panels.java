import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Panels {

	JPanel dagar;

	public JPanel dayOfWeek(LocalDate date) {

		dagar = new JPanel();
		dagar.setLayout(new BoxLayout(dagar, BoxLayout.Y_AXIS));
		dagar.setBorder(new EmptyBorder(10, 10, 10, 10));
		dagar.setBackground(Color.WHITE);
		dagar.setPreferredSize(new Dimension(250, 300));
		if (LocalDate.now().equals(date)) {
			dagar.setBackground(Color.GREEN);
		}

		JLabel calendarDay = new JLabel(date.getMonth().toString().toUpperCase() + ' ' + date.getDayOfMonth());
		calendarDay.setBorder(new EmptyBorder(10, 10, 10, 10));

		JLabel dayOfWeek = new JLabel(date.getDayOfWeek().toString().toUpperCase());
		JPanel eventBox = new JPanel();
		eventBox.setLayout(new BoxLayout(eventBox, BoxLayout.Y_AXIS));
		eventBox.setPreferredSize(new Dimension(20, 20));
		eventBox.setBackground(Color.WHITE);

		JTextField addEvent = new JTextField();
		addEvent.setPreferredSize(new Dimension(200, 30));
		addEvent.setMaximumSize(addEvent.getPreferredSize());
		JButton newActivityBtn = new JButton("Lägg till event");

		ActionListener addActivityBtnListener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel toDoText = new JLabel(addEvent.getText());
				toDoText.setBorder(new EmptyBorder(3, 3, 3, 3));
				toDoText.setHorizontalAlignment(JLabel.CENTER);
				eventBox.add(toDoText);
				eventBox.revalidate();
				addEvent.setText("");
			}

		};

		newActivityBtn.addActionListener(addActivityBtnListener);

		dagar.add(dayOfWeek);
		dagar.add(calendarDay);
		dagar.add(eventBox);
		dagar.add(addEvent);
		dagar.add(newActivityBtn);

		return dagar;

	}

}