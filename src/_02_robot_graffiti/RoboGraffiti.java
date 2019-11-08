package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RoboGraffiti {
	public static void main(String[]args) {
		 Robot letterA = new Robot("june");
		 
		 // Writing A
		 letterA.setSpeed(99999);
		 letterA.penDown();
		 letterA.turn(30);
		 letterA.move(200);
		 letterA.turn(120);
		 letterA.move(200);
		 letterA.turn(180);
		 letterA.move(100);
		 letterA.turn(-60);
		 letterA.move(100);
		 letterA.hide();
		 
	}
}
