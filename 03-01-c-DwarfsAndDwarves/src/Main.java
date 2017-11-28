import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
	ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

	Dwarf happy = new Dwarf("Happy", "Disney", "Happy.png");
	dwarfs.add(happy);
	Dwarf sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
	dwarfs.add(sleepy);
	Dwarf dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
	dwarfs.add(dopey);
	Dwarf bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
	dwarfs.add(bashful);
	Dwarf sneezy = new Dwarf("Sneezy", "Disney", "Sneezyy.png");
	dwarfs.add(sneezy);
	Dwarf doc = new Dwarf("Doc", "Disney", "Doc.png");
	dwarfs.add(doc);
	Dwarf grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
	dwarfs.add(grumpy);
	
	Dwarf thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
	dwarfs.add(thorin);
	Dwarf balin = new Dwarf("Balin", "Tolkien", "Balin.png");
	dwarfs.add(balin);
	Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
	dwarfs.add(dwalin);
	Dwarf fili = new Dwarf("Fili", "Tolkien", "Fili.png");
	dwarfs.add(fili);
	Dwarf kili = new Dwarf("Kili", "Tolkien", "Kili.png");
	dwarfs.add(kili);
	Dwarf dori = new Dwarf("Dori", "Tolkien", "Dori.png");
	dwarfs.add(dori);
	Dwarf nori = new Dwarf("Nori", "Tolkien", "Nori.png");
	dwarfs.add(nori);
	Dwarf ori = new Dwarf("Ori", "Tolkien", "Ori.png");
	dwarfs.add(ori);
	Dwarf oin = new Dwarf("Oin", "Tolkien", "Oin.png");
	dwarfs.add(oin);
	Dwarf gloin = new Dwarf("Gloin", "Tolkien", "Gloin.png");
	dwarfs.add(gloin);
	Dwarf bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
	dwarfs.add(bifur);
	Dwarf bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
	dwarfs.add(bofur);
	Dwarf bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
	dwarfs.add(bombur);
	

	System.out.println("The company of Thorin consists of: ");
	
	for (Dwarf dwarf: dwarfs) {
		if (dwarf.getAuthor().equals("Tolkien")) {
			
			System.out.println(dwarf.getName());
			
			}
		
		}
	System.out.println();
	System.out.println("The 7 Dwarfs are called: ");
	
	for (Dwarf dwarf: dwarfs) {
		if (dwarf.getAuthor().equals("Disney")) {
			
			System.out.println(dwarf.getName());
			
			}
		
		}
	}
}
