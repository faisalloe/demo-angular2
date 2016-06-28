package net.xeric.demos.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumberService {

	public Integer findNumberClosestToZero(List<Integer> numbers)throws Exception{

		Integer num = null;
		Integer currentNumber = 0;
		for(int i=0; i<numbers.size(); i++){
			
			// using first number as seed
			currentNumber = numbers.get(i);
			
			// take first element as starting point
			if(i == 0){
				num  = numbers.get(i);
			}
			
			
			if(Math.abs(currentNumber) < Math.abs(num) ){
				num = currentNumber;
			}
			
		}
		
		return num;
	}
	

}
