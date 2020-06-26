package adapter;


/*
 * 서로 다른 두개의 인터페이스 사이를 연결해주는 Adapter 패턴에 대해서 배움 
 * 상속을 사용한 패턴과 위임을 사용한 패턴을 소개하고 각각의 특징에대해 배움 (1, 2 ) 
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
