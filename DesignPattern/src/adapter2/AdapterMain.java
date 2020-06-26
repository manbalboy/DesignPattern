package adapter2;


// Clinet 역할 일을 하는 역할
public class AdapterMain {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();
	}
}
