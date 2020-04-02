package kr.co.library;

import java.util.Date;

public class BookShop {
	public static void main(String[] args) {
		
	  BookList booklist= new BookList();
			  
		
  //날짜 얻어오는 방법-> Date = new Date(); //현재 컴퓨터시간을 가져옴
  //원하는 날짜를 가져오는 방법  	Date = new Date(년,월,일);
  //날짜를 입력할 때 년도는 자바에서는 1900년이 기준이서 입력할 때는 1900빼야한다.
  //월은 1을 빼서 입력해야 정상적으로 처리한다.  (5월하고 싶으면 4월로 입력)
	BookVO book1= new BookVO("해리포터","조앤롤링","A출판사",new Date(2000, 5, 15),20000);
	BookVO book2= new BookVO("셜록홈즈","아서코난도일","B출판사",new Date(1990, 2, 27),19000);
	BookVO book3= new BookVO("노르웨이 숲","무라카미 하루키","C출판사",new Date(1998, 11, 10),18000);
	BookVO book4= new BookVO("수학의정석","홍성대","D출판사",new Date(1987,3,1),20000);
	BookVO book5= new BookVO("동화책","지은이","A출판사",new Date(2020, 8, 23),10000);
   
	booklist.addBook(book1);
	booklist.addBook(book2);
	booklist.addBook(book3);
	booklist.addBook(book4);
	booklist.addBook(book5);
	
	System.out.println(booklist);
	
}}
