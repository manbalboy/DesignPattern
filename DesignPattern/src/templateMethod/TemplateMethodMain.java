package templateMethod;

/*
 * ���� Ŭ�������� ó���� ����� �����ϰ� , ���� Ŭ�������� ó���� ������ ��üȭ�ϴ� Template Method ����
 *
 *
 *
 *
 * */
public class TemplateMethodMain {
	public static void main(String[] args) {
		AbstractDisplay dl = new CharDisplay('H');
		AbstractDisplay dl2 = new StringDisplay("manbalboy");

		dl2.display();
		dl.display();

	}
}
