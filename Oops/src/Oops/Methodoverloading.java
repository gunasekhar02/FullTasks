package Oops;
import java.util.*;
import java.util.Scanner;

public class Methodoverloading {
	public int add(int a,int b) { 
		int sum=a+b;
		return sum;
}
	public  float add(float a,float b) {
		float sum=a+b;
		return sum;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Methodoverloading ob = new Methodoverloading();
		System.out.println(ob.add(1, 5));
		System.out.println(ob.add(1.23f, 5.56f));

}
}
