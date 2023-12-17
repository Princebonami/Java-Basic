package Functional_Interface;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Consumer<Integer> c1=(a)->
		{
			for(int i=1;i<=a;i++)
			{
				System.out.print(i+" ");
			}
		};
//		System.out.println("Enter the number till where you want count :");
//		c1.accept(sc.nextInt());
		
		Consumer<Integer> c2=(a)->
		{
			for(int i=a;i>=1;i--)
			{
				System.out.print(i+" ");
			}
		};
		Consumer<Integer> c3=(a)->
		{
			for(int i=1;i<=a;i++)
			{
				int pow=1;
				for(int j=1;j<=2;j++)
				{
					pow=pow*i;
				}
				System.out.println(pow);
			}
			
		};
//		System.out.println("Enter the number till where you want count :");
//		c1.accept(sc.nextInt());
		
		c1.andThen(c2,c3).accept(10);
		

	}

}
