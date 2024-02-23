public class DistanceCalculator {
	public static void main(String[] args) {
	//Coordinates of the two points
	double x1 = 2, y1 = 1, z1 = 3;
	double x2 = 0, y2 = 0, z2 = 6;
	//Calculate the distance using the formula
	double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) + Math.pow(z1 - z2, 2));
	//Print the distance
	System.out.println("The distance between the two points is: " + distance);
	}
}
