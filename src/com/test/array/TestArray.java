package com.test.array;

public class TestArray {

	private static int[] array = new int[15];
	private static int arraySize =10;
	private static int[] array1 = {1,4,2,7,4,8,9,4,4,4,2,10,12};
	public static void main(String[] args) {
		//createRandomArray();
        //printArray();
        //System.out.println("Value at index 9:::   "+findValueOfIndex(9));
        //System.out.println("Value "+ 16+" exist::"+valueExist(16));
		printArray(array1);
		System.out.println("after delete ");
		printArray(deleteValue(array1,4));
		//printArray(deleteIndex(array1,3));
	}
	public static void createRandomArray(){
		for(int i=0 ;i<arraySize;i++){
			array[i]=(int)(Math.random()*10+10);
		}
	}
    public static void printArray(){
    	for(int i=0 ;i<arraySize ;i++){
    		System.out.println(i+"  "+array[i]);
    	}
    }
    public static void printArray(int[] arr){
    	for(int i=0 ;i<arr.length ;i++){
    		System.out.println(i+"  "+arr[i]);
    	}
    
    }
    public static int findValueOfIndex(int index){
    	int value = 0;
    	if(index < arraySize ){    		
    		value = array[index];
    	}
    	return value;
    }
    public static boolean valueExist(int value){
    	boolean flag = false;
    	for(int i=0 ;i<arraySize ;i++){
    		if(array[i] == value){
    			flag = true;
    			break;
    		}    		
    	}
    	return flag;
    }
    public static int[] deleteValue(int []arr, int value){    	
    	int j=0;
    	int  k=0;
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==value ){
    			k++;
    		}
    	}
    	int []tmp =new int[arr.length-k];
    	for(int i=0;i<arr.length;i++){
    		if(arr[i]==value ){
    			continue;
    		}else{
    			tmp[j]=arr[i];
    			j++;
    		}
    	}
    	return tmp;
    }
    public static int[] deleteIndex(int []arr, int index){
    	int []tmp =new int[arr.length-1];
    	int j=0;
    	for(int i=0;i<arr.length;i++){
    		if(i==index ){
    			continue;
    		}else{
    			tmp[j]=arr[i];
    			j++;
    		}
    	}
    	return tmp;
    }
    
}
