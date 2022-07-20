package sec06_user_defined_exception;

public class CheckAccount {
	private long balance;	// 계좌 잔고
	private int  number;    // 계좌번호
	
	// 생성자
	public CheckAccount(int number) {
		this.number = number;
	}
	
	/*
	 * 계좌에 입금하는 메소드
	 */
	public void deposit(long amount) {
		this.balance += amount;
	}
	
	/*
	 * 계좌에서 출금하는 메소드
	 */
	public void withdraw(long amount) throws FailException {
		if (balance >= amount) { // 잔액이 충분한 경우
			balance -= amount;
		} else {  // 잔액이 모자란 경우
			// 예외 발생시킴
			throw new FailException(amount - balance);
		}
	}

	public long getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
}






