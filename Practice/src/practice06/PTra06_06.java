package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 *                            [int j==??]
		 * □□□□□　  int i == 1  ＊＊＊＊＊
		 * ■□□□□　  int i == 2  　＊＊＊＊
		 * ■■□□□　  int i == 3  　　＊＊＊
		 * ■■■□□　  int i == 4  　　　＊＊
		 * ■■■■□　  int i == 5  　　　　＊
		 *             				if(i==2 && j==2 && j==3 && j==4 && j==5) {
					System.out.println("□");
				}
		 */
		
		for(int i =1; i<=5 ;i++) {
			for(int j =1;j<=5 ;j++) {
			if(j<i) {
				System.out.print("■");
			}else{
				System.out.print("□");
			}
		}
		System.out.println();
		}
	}
}
