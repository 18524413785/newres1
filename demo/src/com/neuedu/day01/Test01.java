package com.neuedu.day01;

public class Test01 {

	public static void main(String args[]) { 
		int i = 0, total = 0; 
		do {
		 i = i + 2;
		total = total + (i++) * 2; } 
		while (i < 12); 
		System.out.print("总数为：" + total); 
		System.out.println("world");
		System.out.println("world");
		System.out.println("hello");
		System.out.println("有别人修改了代码");
		System.out.println("pull完之后更新了代码再敲的代码");
	}


}
