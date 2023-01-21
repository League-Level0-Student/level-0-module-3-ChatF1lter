package _02_loop_variables._1_years_alive;
import javax.swing.JOptionPane;
public class Years {
	public static void main(String[] args) { 
		String when = JOptionPane.showInputDialog(null, "When were you born?");
		int whenAge = Integer.parseInt(when);
		for(int w=whenAge;w<2023;w++) {
			System.out.println(w);
		}
	}
}
