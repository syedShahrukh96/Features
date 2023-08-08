package cam.java.eight.features;

import java.util.ArrayList;
import java.util.List;


public class LibDAO {

	public List<LibPojo> getBooks() {
		List<LibPojo> books = new ArrayList<>();

		books.add(new LibPojo(104, "java", 200));
		books.add(new LibPojo(102, "python", 300));
		books.add(new LibPojo(105, "C++", 400));
		books.add(new LibPojo(101, "Go", 500));
		return books;

	}

}
