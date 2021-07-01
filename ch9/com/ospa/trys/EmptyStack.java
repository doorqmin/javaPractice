package com.ospa.trys;

import java.util.EmptyStackException;
import java.util.Stack;

public class EmptyStack {
	static Stack<String> s = new Stack<String>();
	final static int count = 10000000;
	
	public static void main(String[] args) {
		long time1 = System.currentTimeMillis();
		SimpleTest();
		long time2 = System.currentTimeMillis();
		HandleExcep();
		long time3 = System.currentTimeMillis();
		int test = (int)(time2 - time1);
		int excp = (int)(time3 - time2);
		System.out.println("test: " + test);
		System.out.println("excp: " + excp);
		System.out.println("예외처리 시간 소모: " + excp/test);
	}

	private static void HandleExcep() {
		for (int i = 0; i < count; i++) {
			try {
				s.pop();
			} catch (EmptyStackException e) {
			}
		}
	}

	private static void SimpleTest() {
		for (int i = 0; i < count; i++) {
			if (!s.empty()) {
				s.pop();
			}
		}
	}
}

