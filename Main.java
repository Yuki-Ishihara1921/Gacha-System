import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		String[] dogs = {"ゴールデン・レトリバー", "ヨークシャー・テリア", "ミニチュア・シュナウザー", "ポメラニアン", "ミニチュア・ダックスフンド", "柴犬", "チワワ", "トイ・プードル"}; 
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
    			
    			if (g == 1) {
					c -= 1;
					Random r = new Random();
					int num = r.nextInt(dogs.length);
					System.out.println(dogs[num]);
    				array.add(dogs[num]);
    		        if (c <= 0) {
    		            System.out.println("コインが足りません。");
    		        }
    			} else if (g == 2) {
    				c -= 10;
    				for (int i = 0; i < 10; i++) {
						Random r = new Random();
						int num10 = r.nextInt(26);
						if (num10 >= 0 && num10 <5) {
							System.out.println(dogs[0]);
							array.add(dogs[0]);
						} else if (num10 >= 5 && num10 < 10) {
							System.out.println(dogs[1]);
							array.add(dogs[1]);
						} else if (num10 >= 10 && num10 < 15) {
							System.out.println(dogs[2]);
							array.add(dogs[2]);
						} else if (num10 >= 15 && num10 < 18) {
							System.out.println(dogs[3]);
							array.add(dogs[3]);
						} else if (num10 >= 18 && num10 < 21) {
							System.out.println(dogs[4]);
							array.add(dogs[4]);
						} else if (num10 >= 21 && num10 < 23) {
							System.out.println(dogs[5]);
							array.add(dogs[5]);
						} else if (num10 >= 23 && num10 < 25) {
							System.out.println(dogs[6]);
							array.add(dogs[6]);
						} else if (num10 == 25) {
							System.out.println(dogs[7]);
							array.add(dogs[7]);
						}
    					
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