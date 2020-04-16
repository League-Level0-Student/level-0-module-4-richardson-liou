import javax.swing.JOptionPane;

public class test_score {
public static void main(String[] args) {
	String test = JOptionPane.showInputDialog("What was your last test score");
	double score = Double.parseDouble(test);

	if (score >=60) {
		JOptionPane.showMessageDialog(null, "Good job");
	}
	else if (score < 60) {
		JOptionPane.showMessageDialog(null, "You'll do better next time");
	}
}
}
