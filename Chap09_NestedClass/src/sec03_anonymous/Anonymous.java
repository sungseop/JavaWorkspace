package sec03_anonymous;

class Student extends Person {

	@Override
	void wakeup() {
		System.out.println("학생은 6시에 일어납니다.");
	}
	
}

public class Anonymous {
	Person p = new Student();
	
	// 익명의 클래스 작성
	Person p1 = new Person() {
		@Override
		void wakeup() {
			// TODO Auto-generated method stub
			super.wakeup();
		}
		
		public void work() {
			System.out.println("8시에 출근합니다.");
		}
		
		void method() {
			work();
		}
	};
	
	public void method1() {
		p1.wakeup();
		p1.work();  // 조상 타입에는 work()가 없으므로 호출 불가능.
		
		Person lp = new Person() {

			@Override
			void wakeup() {
				System.out.println("8시에 일어납니다.");
			}
			
			void walk() {
				System.out.println("산책합니다.");
			}
		};
	}

}
