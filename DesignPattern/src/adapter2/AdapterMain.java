package adapter2;


// Clinet ���� ���� �ϴ� ����
public class AdapterMain {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();
	}
}
