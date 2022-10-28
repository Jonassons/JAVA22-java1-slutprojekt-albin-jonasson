
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public final class Veckor {

	static ArrayList<LocalDate> thisWeek() { // hämta veckans datum

		ArrayList<LocalDate> currentWeek = new ArrayList<>();

		LocalDate today = LocalDate.now(); // dagens datum

		LocalDate monday = today;
		while (monday.getDayOfWeek() != DayOfWeek.MONDAY) { // loopa bakåt för att hitta senaste måndag
			monday = monday.minusDays(1);
		}

		for (int i = 0; i < 7; i++) {
			// loopa framåt tills det är söndag
			currentWeek.add(monday.plusDays(i));
		}

		return currentWeek;
	}
}