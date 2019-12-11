package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog(null, "what is your birthday?");
		if (birthday.equals("12-10-2019")) {
			JOptionPane.showMessageDialog(null, "happy birthday");
		}else {
			
			JOptionPane.showMessageDialog(null,"happy unbithday");
			
		}
	}
}
