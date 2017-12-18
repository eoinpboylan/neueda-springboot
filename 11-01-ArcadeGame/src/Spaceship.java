
public class Spaceship extends Asteroid{
	private int ammo;
	private int lives;
	
	public Spaceship(double x, double y, String direction, int speed, int ammo, int lives) {
		super();
		this.ammo = ammo;
		this.lives = lives;
	}

	public Spaceship() {
		super();
	}

	public int getAmmo() {
		return ammo;
	}

	public void setAmmo(int ammo) {
		this.ammo = ammo;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}
	
	/*public void shoot() {
		
		while(ammo >=20) {
				int ammoLeft;
				ammoLeft = ammo - 20; 
				setAmmo(ammoLeft);
				System.out.println("Ammo Remaining: " + ammoLeft);
				
			}
		System.out.println("You Are Out Of Ammo!");
		
		} */
	
	public void shoot() {
		
		if(ammo > 0) {
			int ammoLeft;
			ammoLeft = ammo - 20; 
			setAmmo(ammoLeft);
			System.out.println("Ammo Remaining: " + ammoLeft);
		}
		else if (ammo <= 0){
			System.out.println("Out of Ammo! \n");
		}
			
		}
	
	public void crash() {
		
		if(lives > 0) {
			int livesLeft;
			livesLeft = lives - 1; 
			setLives(livesLeft);
			System.out.println("Lives Remaining: " + livesLeft);
		}
		else if (lives <= 0){
			System.out.println("GAME OVER!");
		}
		
	}

}
