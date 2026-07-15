package com.loops;

public class Example1 {

		public boolean isUgly(int num) {
			if(num<=0) {
				return false;
			}
			while(num%2==0) {
				num=num/2;
			}
			while(num%3==0) {
				num=num/3;
			}
			
			while(num%5==0) {
				num=num/5;
			}

				
		return num==1;
		}

		public static void main(String[] args) {
			Example1 obj=new Example1();
		System.out.println(obj.isUgly(10)? "ugly number": "!ugly number");
				
			}
			

		}




