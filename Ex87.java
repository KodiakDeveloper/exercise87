package bookExercises;

import javax.swing.JOptionPane;

public class Ex87 {

	public static void main(String[] args) {

		String userAnswer;

		int year1, year2, month1, month2, day1, day2;

		Ex87methods ex = new Ex87methods();

		do {

			year1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Year: "));

			month1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Month: "));

			day1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input day: "));

			year2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Year: "));

			month2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Month: "));

			day2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Input day: "));

			ex.date(year1, year2, month1, month2, day1, day2);

			userAnswer = JOptionPane.showInputDialog(null, "Do You Want To Continue ? (yes/no)");

			userAnswer = userAnswer.trim();

		} while (userAnswer.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "END OF APPLICATION!");
	}

}
