package com.test.duplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class FindDuplicateNum {

	 public int findDuplicateNumber(List<Integer> numbers){
         
	        int highestNumber = numbers.size() - 1;
	        int total = getSum(numbers);
	        int duplicate = total - (highestNumber*(highestNumber+1)/2);
	        return duplicate;
	    }
	     
	    public int getSum(List<Integer> numbers){
	         
	        int sum = 0;
	        for(int num:numbers){
	            sum += num;
	        }
	        return sum;
	    }
	     
	    public static void main(String a[]){
	        List<Integer> numbers = new ArrayList<Integer>();
	        for(int i=1;i<100;i+=2){
	            numbers.add(i);
	        }
	        //add duplicate number into the list
	        numbers.add(21);
	        numbers.add(4);
	       /* numbers.add(23);*/
	        FindDuplicateNum dn = new FindDuplicateNum();
	        int tmp  = dn.findDupNum1(numbers);
	        if(tmp ==0){
	        	System.out.println("No duplicate num");
	        }else{
	        	System.out.println("Duplicate num::"+tmp);
	        }
	       // System.out.println("Duplicate Number: "+dn.findDupNum1(numbers));
	        int duplicateNum = findDupNum(numbers);
	        if(duplicateNum ==0){
	        	System.out.println("No duplicate num");
	        }else{
	        	System.out.println("Duplicate num::"+duplicateNum);
	        }
	    }
	    public static int findDupNum(List<Integer> list){

	    	Collections.sort(list);
	    	Integer previous=0 ;
	    	int duplicate =0;
	    	for(Integer tmp : list){
	    		Integer current = tmp;
	    		if(current == previous){
	    			duplicate = tmp;
	    		  break;
	    		}  
	    		else{
	    			previous = current;
	    		}
	    	}	
	    	return duplicate;
	    }
	    public static int findDupNum1(List<Integer> list){
	    	int cnt = 0;
	    	int num = 0;
	    	System.out.println(list);
	    	for(int i : list){
	    		cnt = 0;
	    		for(int j : list){
	    			if(i ==j){
	    				cnt++;
	    				num = i;
	    			}
	    			if(cnt>1){
	    				break;
	    			}
	    		}
	    		if(cnt>1){
    				break;
    			}
	    	}
	    	if(cnt>1){
	    		return num;
			}else
	    	   return 0;
	    }
	    

}
