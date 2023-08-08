package cam.java.eight.features;

public class LibPojo {
	private int id;
	private String name;
	private int pages;
	
	
	
	public LibPojo(int id, String name, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	
	
	
	@Override
	public String toString() {
		return "LibPojo [id= " +id+ ", Name= " +name+", pages= "+pages +" ]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + pages;
		return result;
	}

}
