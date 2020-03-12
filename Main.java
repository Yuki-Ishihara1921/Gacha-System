import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		System.out.println("Hello, world!");
		int c = 30;
		System.out.println("所持コイン_" + c + "_枚");
		System.out.println("１：ガチャ　２：獲得数一覧　３：終了");
		Scanner s = new Scanner(System.in);
		int sentaku = s.nextInt();
		if (sentaku == 1) {
		    while (c > 0){
		        System.out.println("ガチャを引くことができます。");
		        System.out.println("所持コイン_" + c + "_枚");
		        System.out.println("１：ガチャ　２：10連ガチャ　３：獲得数一覧　４：終了");
    			int g = s.nextInt();
    			Random rand = new Random();
    			int num = rand.nextInt(20);
    			num++;
    			
    			if (g == 1) {
    				c -= 1;
    				System.out.println(num);
    				array.add(num);
    		        if (c <= 0) {
    		            System.out.println("コインが足りません。");
    		        }
    			} else if (g == 2) {
    				c -= 10;
    				for (int i = 0; i < 10; i++) {
    					num = rand.nextInt(20);
    					num++;
    					System.out.println(num);
    					array.add(num);
    				}
    		        if (c <= 0) {
    		            System.out.println("コインが足りません。");
    		        }
    		    } else if (g == 3) {
    		        System.out.println(array);
    		    } else if (g > 3) {
    		        System.out.println("終了");
    		        break;
    		    }
		    }
		    System.out.println(array);
		    
		} else if (sentaku == 2) {
		    System.out.println(array);
		} else {
		    System.out.println("終了");
		}
	}
}