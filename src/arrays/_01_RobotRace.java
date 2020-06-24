package arrays;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Component;

import javax.swing.JOptionPane;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args)  {
	//2. create an array of 5 robots.
		Robot[] arr = new Robot[5];
	//3. use a for loop to initialize the robots.
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Robot();
		}
	//4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < arr.length; i++) {
			arr[i].setX(240 * (i + 1) - 40);
			arr[i].setY(800);
		}
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		boolean checker = true;
		int winner = 0;
		while (checker) {
			for (int i = 0; i < arr.length; i++) {
				arr[i].move((int) (Math.random() * 50));
				
				if (arr[i].getY() <= 50) {
					winner = i;
					checker = false;
				}
			}
		}

	//7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null, "Robot " + (winner + 1) + " wins!");
		
		//8. try different races with different amounts of robots.

		//9. make the robots race around a circular track.
		for (int i = 0; i < arr.length; i++) {
			arr[i].setX(240 * (i + 1) - 40);
			arr[i].setY(400);
		}
		
		winner = 0;
		checker = true;
		int[] degrees = new int[arr.length];
		while (checker == true) {
			for (int i = 0; i < arr.length; i++) {
				int degree = (int) (Math.random() * 50);
				for (int j = 0; j < degree; j++) {
					arr[i].move(1);
					arr[i].turn(1);
					degrees[i]++;
					
					if (degrees[i] == 360) {
						winner = i + 1;
						break;
					}
				}
				if (winner > 0) {
					JOptionPane.showMessageDialog(null, "Robot " + (winner) + " wins!");
					System.exit(0);
				}
			}
		}
	}
}
