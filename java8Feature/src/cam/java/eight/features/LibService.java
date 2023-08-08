package cam.java.eight.features;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibService {

	// using Lambda
	public List<LibPojo> getBooks() {
		List<LibPojo> books = new LibDAO().getBooks();
		Collections.sort(books, (LibPojo o1, LibPojo o2) -> o1.getName().compareTo(o2.getName()));
		return books;
	}

}


// as we need to do name sorting and we need to do comparator.

//class LetsComparator implements Comparator<LibPojo> {
//
//	@Override
//	public int compare(LibPojo o1, LibPojo o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//	
//}

