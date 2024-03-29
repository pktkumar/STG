package STG;

public class Point2D {

	double x;
	double y;

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double dist2D(Point2D p) {
		return Math.sqrt(Math.pow((p.getX() - x), 2) + Math.pow((p.getY() - y), 2));
	}

	public static void printDistance(double d) {
		System.out.println((int) Math.ceil(d));
	}

	static public void main(String args[]) {
		Point3D obj1 = new Point3D(1.0, 2.0, 3.0);
		Point3D obj2 = new Point3D(3.0, 4.0,5.0);
		printDistance(obj1.dist3D(obj2));
		printDistance(obj1.dist2D(obj2));
	}
}

class Point3D extends Point2D {

	double z;

	public double getZ() {
		return z;
	}

	public Point3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double dist3D(Point3D p) {
		return Math.sqrt(Math.pow((p.getX() - x), 2) + Math.pow((p.getY() - y), 2) + +Math.pow((p.getZ() - z), 2));
	}
}