
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	
		Robot rob = new Robot();
		rob.setPenWidth(10);
		while(true) {
		String colors = JOptionPane.showInputDialog("What color would you like the robot to draw with? Your choices are red, green, and blue");
		if(colors=="red") {
			rob.setPenColor(204, 27, 29);
		} else if(colors.equals("green")){
			rob.setPenColor(70, 219, 24);
		} else if(colors.equals("blue")){
			rob.setPenColor(24, 44, 219);
		} else if(colors.equals(null)){
			rob.setRandomPenColor();
		} 
		rob.penDown();
		 rob.setSpeed(50);
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		rob.turn(90);
		rob.move(90);
		}
		//3. Set the pen width to 10
		
		 //4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
		
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
