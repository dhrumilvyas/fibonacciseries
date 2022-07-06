package com.springdatajpademo.service;

public class fibo {

	public static void main(String[] args) {
		fibo fib = new fibo();
		String getfibonacci = fib.getfibonacci(5);
		System.out.println(getfibonacci);
	}

	private String getfibonacci(Integer input) {

        String newS = "";
        Integer n = input, firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {

            if (newS.equals("")) {
                newS = String.valueOf(firstTerm);
            } else {
                newS = newS + "," + String.valueOf(firstTerm);
            }

            // compute the next term
            Integer nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        return newS;
	}
}
