package kr.co.library;

import java.util.Date;

public class BookShop {
	public static void main(String[] args) {
		
	  BookList booklist= new BookList();
			  
		
  //��¥ ������ ���-> Date = new Date(); //���� ��ǻ�ͽð��� ������
  //���ϴ� ��¥�� �������� ���  	Date = new Date(��,��,��);
  //��¥�� �Է��� �� �⵵�� �ڹٿ����� 1900���� �����̼� �Է��� ���� 1900�����Ѵ�.
  //���� 1�� ���� �Է��ؾ� ���������� ó���Ѵ�.  (5���ϰ� ������ 4���� �Է�)
	BookVO book1= new BookVO("�ظ�����","���طѸ�","A���ǻ�",new Date(2000, 5, 15),20000);
	BookVO book2= new BookVO("�ȷ�Ȩ��","�Ƽ��ڳ�����","B���ǻ�",new Date(1990, 2, 27),19000);
	BookVO book3= new BookVO("�븣���� ��","����ī�� �Ϸ�Ű","C���ǻ�",new Date(1998, 11, 10),18000);
	BookVO book4= new BookVO("����������","ȫ����","D���ǻ�",new Date(1987,3,1),20000);
	BookVO book5= new BookVO("��ȭå","������","A���ǻ�",new Date(2020, 8, 23),10000);
   
	booklist.addBook(book1);
	booklist.addBook(book2);
	booklist.addBook(book3);
	booklist.addBook(book4);
	booklist.addBook(book5);
	
	System.out.println(booklist);
	
}}
