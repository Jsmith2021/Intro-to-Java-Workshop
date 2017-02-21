package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot denver=new Robot("batman");
denver.sparkle();
denver.turn(360);
denver.setSpeed(5);
denver.move(400);
denver.turn(180);
denver.move(200);
denver.clear();
denver.setRandomPenColor();
denver.penDown();		
denver.move(200);
denver.turn(90);
denver.move(200);
denver.turn(90);
denver.move(200);
denver.turn(90);
denver.move(200);
	}
}

