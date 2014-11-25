public class Point{
	private double xCo;
	private double yCo;

	public Point(double x, double y){
		xCo=x;
		yCo=y;
	}

	public double getX(){
		return xCo;
	}
	public double getY(){
		return yCo;
	}

	public void setX(double x){
		xCo=x;
	}
	public void setY(double y){
		yCo=y;
	}
}