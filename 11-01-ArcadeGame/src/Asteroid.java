
public class Asteroid {
	private double x;
	private double y;
	private String direction;
	private int speed;
	
	public Asteroid() {
		super();
	}

	public Asteroid(double x, double y, String direction, int speed) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.speed = speed;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
