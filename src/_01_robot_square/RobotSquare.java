package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
    	Robot francis = new Robot();


        // 3. Put the robot's pen down
    	francis.penDown();


        // 6. Make the robot move as fast as possible
    	francis.setSpeed(999);

    	int degree = 90;
    	int red = 255;
    	int blue = 2;
    	int green = 50;
    	for (int i = 0; i < 9999999; i++) {
    		degree = degree*5;
    		
    		red = red - 100;
    		blue += 30;
    		green = red - blue;
    		
    		francis.move(200);
    		francis.turn(degree);
    		francis.setPenColor(red, blue, green);
    	}
    }
}
