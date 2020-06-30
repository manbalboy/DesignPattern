package templateMethod;

/*
 * 상위 클래스에서 처리의 골격을 규정하고 , 하위 클래스에서 처리의 내용을 구체화하는 Template Method 패턴
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
