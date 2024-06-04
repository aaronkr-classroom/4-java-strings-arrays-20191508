import java.util.Scanner;

public class welcome {
	static final int NUM_BOOK =3;
	static final int NUM_ITEM =7;

	public static void menuCartAddItem{String[][]book) {
		//System.out.println("장바구니에 항복 추가하기:");
		
		boolean quit =false;
		
		while(!quit) {
			
			if (flag) {
				System.out.println("장바구니에 추가하겠습니까? Y:N");
				str = input.nextLine();
				
				if (str.toUpperCase().equals("Y")){
					System.out.println(book[numId][0]+"도서가 장바구니에 추가되었습니다.");			
				}
				quit =true;			
			}else
				System.out.println("다시 입력해 주세요");
		}	
		
		BookList(book);
		for (int i =0; i< NUM_BOOK; i++) {
			for (int j = 0; j<NUM_ITEM; j++)
				System.out.print(book[i][j]+":");
			System.out.println("");
		}
	}
	String[][]mBook =new String[NUM_BOOK][NUM_ITEM];
	}//main 메서드 끝
	public static void menuExit() {
		System.out.println("8. 종료");
	}
	public static void BookList(String[][]book) {
		
		book[0][0] ="ISBN1234";
		book[0][1] ="쉽게 배우는JSP 웹 프로그래밍";
		book[0][2] = "27000";
		book[0][3] ="송미영";
		book[0][4] ="단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍";
		book[0][5] ="IT전문서";
		book[0][6] ="2018/10/08";

		book[1][0]= "ISBN1235";
		book[1][1] ="안드로이드 프로그래밍";
		book[1][2] ="33000";
		book[1][3] = "우재남";
		book[1][4] ="실습 단계별 명쾌한 멘토링!";
		book[1][5] ="IT전문서";
		book[1][6] ="2022/01/22";
		
		book[2][0] ="ISBN1236";
		book[2][1] ="스크래치";
		book[2][2]="22000";
		book[2][3]="고광일";
		book[2][4]="컴퓨팅 사고력을 키우는 블록 코딩";
		book[2][5]="컴퓨터입문";
		book[2][6]="2019/06/10";
		
		
		
		
		

	}
	}
