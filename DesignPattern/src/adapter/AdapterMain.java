package adapter;


/*
 * ���� �ٸ� �ΰ��� �������̽� ���̸� �������ִ� Adapter ���Ͽ� ���ؼ� ��� 
 * ����� ����� ���ϰ� ������ ����� ������ �Ұ��ϰ� ������ Ư¡������ ��� (1, 2 ) 
 * 
 * 
 * 
 * */
public class AdapterMain {
	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();
	}
}
