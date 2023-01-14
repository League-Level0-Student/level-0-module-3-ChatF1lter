package _01_else_if._4_are_you_happy;
import javax.swing.JOptionPane;

public class Happy {
	public static void main(String[] args) {
	String Happy = JOptionPane.showInputDialog("Are you happy?");
	if(Happy=="Yes") {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	} else if(Happy=="No") {
		String Happier = JOptionPane.showInputDialog(null, "Do you want to be happy?");
		if(Happier=="Yes") {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
			else if(Happier=="No") {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
			}
		}
	}
}

