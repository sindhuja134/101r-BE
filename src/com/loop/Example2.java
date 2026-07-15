package com.loop;

public class Example2 {
	public boolean isHarshad(int num) {
		
	
	if(num<=0) {
		return false;
	}	
	int temp=num;
	int sum=0;
	while(temp>0) {
		sum=sum+temp%10;
		temp/=10;
	}
	return num%sum==0;
	
	}

	public static void main(String[] args) {
		Example2 obj=new Example2();
		System.out.println(obj.isHarshad(12)? "harshad number": "!harshad number");
	}

}
