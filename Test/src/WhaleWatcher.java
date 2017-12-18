import java.util.ArrayList;

public class WhaleWatcher {

	public static void main(String[] args) {
		ArrayList<Whale> whales = new ArrayList<Whale>();
		
		Whale right = new Whale("Right", "Atlantic", 2001, 21, 16);
		whales.add(right);
		Whale blue = new Whale("Blue", "Pacific", 2001, 23, 16);
		whales.add(blue);		
		Whale sperm = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		whales.add(sperm);
		Whale humpback = new Whale("Humpback", "Antarctic", 919, 13, 13);
		whales.add(humpback);
		
		
		
		for (Whale whale: whales) {
			
				System.out.println(whale.toString());

			}
		System.out.println();
		
		System.out.println("The whales that swim mostly in the Atlantic are: ");
		for (Whale whale: whales) {
			if(whale.getMainOcean().equals("Atlantic")) {
			System.out.println("The " + whale.getName() + " whale");
			}
		}
		
		System.out.println();
		System.out.print("The fastest whale is: ");
		String fastestWhale = getFastestWhale(whales);
		System.out.println("The " + fastestWhale + " whale");
		
		
		System.out.println();//only finds average of existing whales
		int averageLength = ((right.getLength() + blue.getLength() + sperm.getLength() + humpback.getLength()) / whales.size());	
		System.out.println("The average length of the whales is: " + averageLength);
		
		
		System.out.println();
		System.out.print("The heaviest whale is: ");
		String heaviestWhale = getHeaviestWhale1(whales);
		System.out.println("The " + heaviestWhale + " whale");
			
		}

	
	
	public static String getFastestWhale(ArrayList<Whale> whales) {//finds fastest whale
		
		int maxAvSpeed = 0;
		String fastestWhale = "";
		for(int i = 0; i < whales.size(); i++) {
			
			Whale currentWhale = whales.get(i);
			if(currentWhale.getMaxSpeed() > maxAvSpeed) {
				maxAvSpeed= currentWhale.getMaxSpeed();
				fastestWhale = currentWhale.getName();	
			}
		}
		
		return fastestWhale;
	}
	
	public static String getHeaviestWhale1(ArrayList<Whale> whales) {//only returns one heavy whale when should return two
		
		int maxWeight = 0;
		String heaviestWhale1 = "";
		for(int i = 0; i < whales.size(); i++) {
			
			Whale currentWhale = whales.get(i);
			if(currentWhale.getWeight() >= maxWeight) {
				maxWeight= currentWhale.getWeight();
				heaviestWhale1 = currentWhale.getName();	
			}
		
		}return heaviestWhale1;
		
		
	
		}
		
	}
	


