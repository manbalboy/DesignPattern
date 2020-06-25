package iterator;

public class IteratorMain {
	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book ("���� 1"));
		bookShelf.appendBook(new Book ("���� 2"));
		bookShelf.appendBook(new Book ("���� 3"));
		bookShelf.appendBook(new Book ("���� 4hhhh"));

		Iterator it = bookShelf.iterator();

		while (it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
