package bookExercises;

import java.time.LocalDate;

import java.time.Period;

import javax.swing.JOptionPane;

public class Ex87methods {

	public void date(int year1, int year2, int month1, int month2, int day1, int day2) {

		LocalDate data1 = LocalDate.of(year1, month1, day1);

		LocalDate data2 = LocalDate.of(year2, month2, day2);

		Period period = Period.between(data1, data2);

		int hours = 24 * Math.abs(period.getDays());

		JOptionPane.showMessageDialog(null,
				"Number of hours between dates: " + "\n" + data1 + "\n" + data2 + "\nHours: " + hours);
	}
}
