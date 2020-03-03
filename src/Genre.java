
public class Genre {
	private String name;
	//Hallo
	public Genre(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Genre [name=" + name + "]";
	}
	
	
}
