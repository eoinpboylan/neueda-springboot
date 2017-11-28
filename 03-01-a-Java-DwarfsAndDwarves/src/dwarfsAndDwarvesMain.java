import java.util.ArrayList;

public class dwarfsAndDwarvesMain {

	public static void main(String[] args) {
		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		
		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("Oin");
		dwarves.add("Gloin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		
		System.out.println("The 7 Dwarfs are: ");
		
		for (String dwarf: dwarfs){
				
				System.out.println(dwarf);
		}
		
		System.out.println();
		
		System.out.println("The Company of Thorin consists of: ");
		
		for (String dwarf: dwarves){
			
			System.out.println(dwarf);
		}	

	}
	

}
