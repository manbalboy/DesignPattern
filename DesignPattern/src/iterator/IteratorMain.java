package iterator;

public class IteratorMain {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book ("Á¤ÈÆ 1"));
		bookShelf.appendBook(new Book ("Á¤ÈÆ 2"));
		bookShelf.appendBook(new Book ("Á¤ÈÆ 3"));
		bookShelf.appendBook(new Book ("Á¤ÈÆ 4hhhh"));

		Iterator it = bookShelf.iterator();

		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
