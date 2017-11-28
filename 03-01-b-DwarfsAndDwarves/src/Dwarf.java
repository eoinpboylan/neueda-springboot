
public class Dwarf {
	private String name;
	private String author;
	private String image;
	
/*public Dwarf(String dName, String dAuthor, String dImage){
		
		name = dName;
		author = dAuthor;
		image = dImage;
		
	}*/
	
	public Dwarf() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void display() {
		System.out.println(name + author + image);
	}
	
	
}