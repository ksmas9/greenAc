package kr.ac.green;
/*
 * 1. Inner ��ü�� Outer ��ü�� ���ؼ��� ���������ϴ�.
 * 		-> �Ϲ������� �ܺο��� Inner ��ü�� ������ ���� �ʴ´�.
 * 		-> ��, Inner�� static�� ���� ���ܷ� �Ѵ�.
 * 2. ���� ���������ڿ� ������� ��� ������ �����ϴ�.
 * 3. ���� Ŭ������ ��� ���� �����ڸ� �� ���� �� �ִ�.
 */
class Outer {
//	private Inner i; ��ü�� ����Ҷ�,�ܺο��� ���� �� �� ������ private�� �ַ��ش�.
	private int num = 4;
	public Outer() {
		
	}	
	public void todo() {
		Inner i = new Inner();
		System.out.println(i.other);
	}
	//Outer ��ü�� ���ؼ��� ��������
	public class Inner {		
		private int other = 100;
		public void print() {
		//Outer�� ������� ��� OK	
			System.out.println(num);
		}		
		//static�� ��Ҹ� ���� �� ����.
	}
	//Outer�� ������ ��������
	public static class StaticInner {
		// Outer�� ������� ��� �Ұ�
		// static�� ��Ҹ� ���� �� �ִ�.
	}
}

public class InnerClassEx {
 static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner i = o.new Inner(); //���ؼ� �����
		
		Outer.StaticInner s = new Outer.StaticInner(); //�������
	}
}
/*
Outer o = new Outer(); //Outer ��ü���� Outer�� �־�߸� Inner�� ������ �� ����
Outer.Inner i = o.new Inner(); //Inner ��ü����
*/






