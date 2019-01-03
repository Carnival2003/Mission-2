package ManTruck;

public class CircleRun {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle2 = new Circle();
		circle.touchCircles();
        System.out.println("Расстояние между центрами окружности равно: " + circle.CircleTwo(circle.getXCoord(), circle.getYCoord(), circle2.getXCoord(), circle2.getYCoord()));
		System.out.println("Центр окружности после перемещения: " + circle.xRandCentr() + " " + circle.yRandCentr());
		System.out.println("Длина окружности равна: " + circle.lengthCir(circle.r1));
	}
}