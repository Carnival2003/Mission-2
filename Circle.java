package ManTruck;

import java.util.Random;
import java.util.Scanner;

public class Circle {
	public int r1;
	public int x1;
	public int y1;
	public int r2;
	public int x2;
	public int y2;
	
	public Circle; {
	Scanner scan = new Scanner(System.in);
	System.out.println("Введите координаты Х и У и радиус R круга: ");
	this.x1 = scan.nextInt();
	this.y1 = scan.nextInt();
	this.r1 = scan.nextInt();
	return;
	}
	
	public int xRandCentr(){
		Random rand = new Random();
		x1 = rand.nextInt(198) - 99;
		return x1;
	}
	
	public int yRandCentr(){
		Random rand = new Random();
		y1 = rand.nextInt(198) - 99;
		return y1;
	}
	
	public double lengthCir(double r1) {
		double lengthCir = (int)2 * Math.PI * r1;
		return lengthCir;
	}
	
	public int getXCoord() {
		return x1;
	}
	
	public int getYCoord() {
		return y1;
	}
	
	public int getRCoord() {
		return r1;
	}
	
	public int CircleTwo (int x1, int y1, int x2, int y2) {
		int CircleTwo = (int)Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return CircleTwo;
	}
	
	public void touchCircles() {
		if ((CircleTwo(x1, y1, x2, y2) == (r1 + r2)) || CircleTwo(x1, y1, x2, y2) == (r1 - r2))) {
			System.out.println("Окружности касаются друг друга");
			
		}
		else {
			System.out.println("Окружности не касаются друг друга");
		}
	}