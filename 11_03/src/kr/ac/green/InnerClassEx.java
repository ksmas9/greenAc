package kr.ac.green;
/*
 * 1. Inner 객체는 Outer 객체를 통해서만 생성가능하다.
 * 		-> 일반적으로 외부에서 Inner 객체를 접근을 하지 않는다.
 * 		-> 단, Inner가 static한 경우는 예외로 한다.
 * 2. 서로 접근제한자에 관계없이 멤버 접근이 가능하다.
 * 3. 내부 클래스는 모든 접근 제한자를 다 가질 수 있다.
 */
class Outer {
//	private Inner i; 객체를 사용할때,외부에서 접근 할 수 없도록 private을 주로준다.
	private int num = 4;
	public Outer() {
		
	}	
	public void todo() {
		Inner i = new Inner();
		System.out.println(i.other);
	}
	//Outer 객체를 통해서만 생성가능
	public class Inner {		
		private int other = 100;
		public void print() {
		//Outer의 멤버변수 사용 OK	
			System.out.println(num);
		}		
		//static한 요소를 가질 수 없다.
	}
	//Outer와 별개로 생성가능
	public static class StaticInner {
		// Outer의 멤버변수 사용 불가
		// static한 요소를 가질 수 있다.
	}
}

public class InnerClassEx {
 static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner(); //통해서 만들고
		
		Outer.StaticInner s = new Outer.StaticInner(); //걍만들고
	}
}
/*
Outer o = new Outer(); //Outer 객체생성 Outer가 있어야만 Inner가 존재할 수 있음
Outer.Inner i = o.new Inner(); //Inner 객체생성
*/






