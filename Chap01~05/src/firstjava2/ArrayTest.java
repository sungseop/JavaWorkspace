package firstjava2;

public class ArrayTest {

	public static void main(String[] args) {
		
		Member[] members = new Member[5];
		
		members[0] = new Member(1, "aaa", "임영웅");
		members[1] = new Member(2, "bbb", "영탁");
		members[2] = new Member(3, "ccc", "손흥민");
		members[3] = new Member(4, "ddd", "박지성");
		members[4] = new Member(5, "eee", "차두리");
		
		for(int i=0; i<members.length; i++) {
			System.out.printf("%d번 회원의 아이디는 %s 이고, 이름은 %s 입니다.\n",
					members[i].memberNo, members[i].memberId, members[i].memberName);
		}

	}

}
