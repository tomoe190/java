package mymodel;

 //得到一个不重复的随机数

import java.util.*;
    class RandomClassTest{
     public static int[] getNoRepeatNumber(int number){
		int [] oldArr = new int[number];
		int [] newArr = new int[number];
		
		for(int i = 0 ;i<number ;i++) {
			oldArr[i] = i+1;			
		}
		
		int end = number;
		
		for(int i = 0;i<number;i++) {
			int num = new Random().nextInt(end);			
			newArr[i] = oldArr[num];
			oldArr[num] = oldArr[end-1];
			end--;	
			//System.out.println("num "+num+"  new "+newArr[i]);
		}
        return newArr;


     }
	public static void main(String[] args){
		int[] noRepeatNumbers=RandomClassTest.getNoRepeatNumber(15);
		for(int i=0 ;i<15;i++){
		System.out.print(noRepeatNumbers[i]+"  ");
		}
	}
	
}