package stackImplementaion;

import java.util.*;

public class StackProblems {
	/**
	 * Find if a given number N exists in a stack S.
	 * 
	 * @param target:
	 *            the vale to be searched in the stack
	 * @param s:
	 *            the stack to look for the value
	 * @return if contains then true, else return false
	 */
	public static boolean find(int target, Stack<Integer> s) {
		Stack<Integer> temp = new Stack<>();
		boolean found = false;
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
		} else {
			while (!s.isEmpty()) {
				int value = s.pop();
				if (value == target) {
					found = true;
					break;
				}
				temp.push(value);
			}
			while (!temp.isEmpty()) {
				s.push(temp.pop());
			}
		}
		return found;
	}
}