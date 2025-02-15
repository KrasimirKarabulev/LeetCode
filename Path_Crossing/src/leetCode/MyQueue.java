package leetCode;

import java.util.Stack;

public class MyQueue {

	private Stack<Integer> s;
	private Stack<Integer> s2;
	public MyQueue() {
		s = new Stack<>();
		s2 = new Stack<>();
	}

	void push(int x) {
		s.push(x);
	}

	int pop() {
		while(s2.isEmpty()) {
			while(!s.isEmpty()) {
				s2.push(s.pop());
			}
		}
		return s2.pop();
	}

	int peek() {
		while(s2.isEmpty()) {
			while(!s.isEmpty()) {
				s2.push(s.pop());
			}
		}
		return s2.peek();
	}

	boolean empty() {
		return s.isEmpty() && s2.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
/**
 * Your MyQueue object will be instantiated and called as such: MyQueue obj =
 * new MyQueue(); obj.push(x); int param_2 = obj.pop(); int param_3 =
 * obj.peek(); boolean param_4 = obj.empty();
 */
