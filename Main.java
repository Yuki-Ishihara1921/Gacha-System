import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		String[] pokemons = {"シャワーズ", "サンダース", "ブースター", "エーフィー", "ブラッキー", "リーフィア", "グレイシア", "ニンフィア"}; 
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
					int num = r.nextInt(pokemons.length);
					System.out.println(num);
    				array.add(pokemons[num]);
    		        if (c <= 0) {
    		            System.out.println("コインが足りません。");
    		        }
    			} else if (g == 2) {
    				c -= 10;
    				for (int i = 0; i < 10; i++) {
						Random r = new Random();
						int num10 = r.nextInt(26);
						if (num10 >= 0 && num10 <5) {
							System.out.println(pokemons[0]);
							array.add(pokemons[0]);
						} else if (num10 >= 5 && num10 < 10) {
							System.out.println(pokemons[1]);
							array.add(pokemons[1]);
						} else if (num10 >= 10 && num10 < 15) {
							System.out.println(pokemons[2]);
							array.add(pokemons[2]);
						} else if (num10 >= 15 && num10 < 18) {
							System.out.println(pokemons[3]);
							array.add(pokemons[3]);
						} else if (num10 >= 18 && num10 < 21) {
							System.out.println(pokemons[4]);
							array.add(pokemons[4]);
						} else if (num10 >= 21 && num10 < 23) {
							System.out.println(pokemons[5]);
							array.add(pokemons[5]);
						} else if (num10 >= 23 && num10 < 25) {
							System.out.println(pokemons[6]);
							array.add(pokemons[6]);
						} else if (num10 == 25) {
							System.out.println(pokemons[7]);
							array.add(pokemons[7]);
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