package com.springdatajpademo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdatajpademo.model.Fibonaci;
import com.springdatajpademo.repository.FibonaciRepository;

@Service
public class Fibonaciservice {
	@Autowired
	private FibonaciRepository repo;
	
	
	

	public Fibonaci getfibonacimunbers(int input) {
		Optional<Fibonaci> findByInput = repo.findByInput(input);
		
		if(!findByInput.isPresent()) {
			String str=getfibonacci(input);
			
			Fibonaci fib = new Fibonaci(str,input,1);

			// store the model
			repo.save(fib);

			return fib;

			
		}
		else {
			Fibonaci fibonaci = findByInput.get();
			
			fibonaci.setCount(fibonaci.getCount() + 1);
			repo.save(fibonaci);

			// return the series
			return fibonaci;
		}

		
		
	}

	private String getfibonacci(int input) {
		
		String str = "";
		int n = input, firstTerm = 0, secondTerm = 1;
		
		for (int i = 1; i <= n; ++i) {
			
			if (str.equals("")) {
				str = String.valueOf(firstTerm);
			} else {
				str = str + "," + String.valueOf(firstTerm);
			}
			
			// compute the next term
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		
		return str;
	}

	public Fibonaci get(Integer id) {
		return null;
	}
}
