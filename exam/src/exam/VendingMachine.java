package exam;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Drink[] drinks = new Drink[8];
		drinks[0] = new Drink("a",10);
		drinks[1] = new Drink("b",15);
		drinks[2] = new Drink("c",10);
		drinks[3] = new Drink("d",18);
		drinks[4] = new Drink("e",10);
		drinks[5] = new Drink("f",20);
		drinks[6] = new Drink("g",15);
		drinks[7] = new Drink("h",18);
		int i=1;
		int m=0;
		while(i>0){
			System.out.println("請投幣或選擇飲料(a或b或c),或輸入0結束:");
			 	Scanner scanner = new Scanner(System.in);
			 	String line = scanner.nextLine();
			 	switch(line){
			 	case "1" :
			 		 m = m +1;
			 		System.out.println("目前餘額:"+m);
			 		break;
			 	case "5" :
			 		 m = m +5;
			 		System.out.println("目前餘額:"+m);
			 		break;
			 	case "10" :
			 		 m = m +10;
			 		System.out.println("目前餘額:"+m);
			 		break;
			 	case "a" :
			 	 if( (m -10)>=0) {
			 		 		System.out.println("DON!");	 
			 		 		System.out.println("目前餘額:"+(m-10));
			 		 			 }else
			 		 				 System.out.println("BEEP!"+"目前餘額:"+m);
			 		 		 break;
			 	case "b" :
				 	 if( (m -15)>=0) {
				 		 		System.out.println("DON!");	 
				 		 		System.out.println("目前餘額:"+(m-15));
				 		 			 }else
				 		 				 System.out.println("BEEP!"+"目前餘額:"+m);
				 		 		 break;
				 case "c" :
				 			 if( (m -10)>=0) {
							 		 		System.out.println("DON!");	 
							 		 		System.out.println("目前餘額:"+(m-10));
							 		 			 }else
							 		 				 System.out.println("BEEP!"+"目前餘額:"+m);
							 		 		 break;
				 case "e" :
				 	 if( (m -10)>=0) {
				 		 		System.out.println("DON!");	 
				 		 		System.out.println("目前餘額:"+(m-10));
				 		 			 }else
				 		 				 System.out.println("BEEP!"+"目前餘額:"+m);
				 		 		 break;
				 case "f" :
				 	 if( (m -20)>=0) {
				 		 		System.out.println("DON!");	 
				 		 		System.out.println("目前餘額:"+(m-20));
				 		 			 }else
				 		 				 System.out.println("BEEP!"+"目前餘額:"+m);
				 		 		 break;
				 case "g" :
				 	 if( (m -18)>=0) {
				 		 		System.out.println("DON!");	 
				 		 		System.out.println("目前餘額:"+(m-18));
				 		 			 }else
				 		 				 System.out.println("BEEP!"+"目前餘額:"+m);
				 		 		 break;
				 case "h" :
				 	 if( (m -18)>=0) {
				 		 		System.out.println("DON!");	 
				 		 		System.out.println("目前餘額:"+(m-18));
				 		 			 }else
				 		 				 System.out.println("BEEP!"+"目前餘額:"+m);
				 		 		 break;
				 case "d" :
				 	 if( (m -18)>=0) {
				 		 		System.out.println("DON!");	 
				 		 		System.out.println("目前餘額:"+(m-18));
				 		 			 }else
				 		 				 System.out.println("BEEP!"+"目前餘額:"+m);
				 		 		 break;
				 case "0" :
					 			System.out.println("Bye!");
					 			i = -1;
					 		break;
				 		 		 
				 		 		 
			 	}
		}
		
	}

}
