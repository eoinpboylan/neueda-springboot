import java.util.ArrayList;

public class ArcadeMain {

	public static void main(String[] args) {
		ArrayList<Asteroid> asteroids = new ArrayList<Asteroid>();
		
		Asteroid ast1 = new Asteroid(3.4, 6.7, "left", 25);
		asteroids.add(ast1);
		Asteroid ast2 = new Asteroid(2.4, 6.9, "right", 21);
		asteroids.add(ast2);
		Asteroid ast3 = new Asteroid(3.9, 2.7, "down", 18);
		asteroids.add(ast3);
		
		Spaceship player1 = new Spaceship(2.6, 3.9, "up", 20, 100, 3);
		
		player1.shoot();
		player1.shoot();
		player1.shoot();
		player1.shoot();
		player1.shoot();
		player1.shoot();
		
		player1.crash();
		player1.crash();
		player1.crash();
		player1.crash();

	}
	

}
