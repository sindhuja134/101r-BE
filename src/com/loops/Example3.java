package com.loops;

public class Example3 {
	
		public boolean isPerfect(int num) {
			if(num<=0) {
				return false;
			}
			int sum=0;
			for(int i=1;i<=num/2;i++) {
				if(num%i==0) {
					sum=sum+i;
				}
			}
			return sum==num;
		}

		public static void main(String[] args) {
			Example3 obj=new Example3();
			System.out.println(obj.isPerfect(6)? "Perfecct Number": "!Perfect Number");
			

		}

	}

