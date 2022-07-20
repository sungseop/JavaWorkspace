package sec11_queue;

import java.util.*;

public class QueueEx1 {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<>();
		
		// 큐에 데이터 저장 
		que.offer("1");
		que.offer("2");
		que.offer("3");
		que.offer("4");
		
		while(!que.isEmpty()) {
			System.out.println(que.poll()); // 큐에서 데이터 추출
		}

	}

}
