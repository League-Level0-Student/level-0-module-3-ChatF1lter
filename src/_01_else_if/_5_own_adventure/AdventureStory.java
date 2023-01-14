package _01_else_if._5_own_adventure;
import javax.swing.JOptionPane;

public class AdventureStory {
	public static void main(String[] args) {
		String path = JOptionPane.showInputDialog("You are in a forest. Two paths lie ahead. One Is a bridge across a murky river and one"
				+ " is a thorn covered path. Which do you choose? (Thorns or Bridge)");
		if(path.equals("Bridge")) {
			JOptionPane.showMessageDialog(null, "As you are halfway across the bridge, it collapses under you and you drown.");
		}else if(path.equals("Thorns")) {
			String path1 = JOptionPane.showInputDialog(null, "While it hurts your feet a lot, you make it across and see a small log cabin, "
					+ "with a slouched figure holding something inside. You also see a clearing in the forest, revealing another path. "
					+ "Where do you go? (House or Clearing);");
			if(path1.equals("House")) {
				JOptionPane.showMessageDialog(null, "The man inside was a murderer! He stabs you and you die!");
			}else if(path1.equals("Clearing")) {
					String path2 = JOptionPane.showInputDialog(null, "You continue down the path only to find a forked road. One path says "
							+ "'Freedom', one path says 'Riches', and one path says 'Death'. Which do you go down? (Riches, Death, or"
							+ " Freedom)");

					if(path2.contentEquals("Freedom")) {
						JOptionPane.showMessageDialog(null, "You win!");
					} else if(path2.equals("Riches")) {
						JOptionPane.showMessageDialog(null, "At the end of the path you find a millions dollars, but now you're trapped. Yo"
								+ "u sort "
								+ "of won, but at what cost? THE END");
					}else if(path2.equals("Death")) {
						JOptionPane.showMessageDialog(null, "You died. What were you thinking???");
					}
				}
			}
		}
	}




