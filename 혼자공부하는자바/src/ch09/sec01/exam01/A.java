package ch09.sec01.exam01;

class A {
	
	// 필드
	
	// 생성자
	A(){
		System.out.println("A객체가 생성됨");
	}
	// 인스턴스 멤버클래스
	class B {
		B(){
			System.out.println("B객체가 생성됨");
		}
		int field1;
		void method1() {
		}
	}
	// 정적 멤버클래스
	static class C{
		C(){
			System.out.println("C 객체가 생성됨");
		}
		
		int field1;
		static int field2;
		void method1() {}
		static void method2() {
			
		}
	}
	
	// 메소드
		
		void method() {
			// 로컬 클래스
			class D{
				D(){
					System.out.println("D 객체가 생성됨");
				}
				
				int field;
				void method1() {
					
				}
			}
			
			D d = new D();
			d.field = 3;
			d.method1();
		}

	
}

