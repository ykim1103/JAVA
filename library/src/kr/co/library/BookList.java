package kr.co.library;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

//여러권의 책 정보(BookVO)를 기억할 Arraylist
public class BookList {
  private ArrayList<BookVO> booklist = new ArrayList<>();
 
    
public ArrayList<BookVO> getBooklist() {
	return booklist;
}
public void setBooklist(ArrayList<BookVO> booklist) {
	this.booklist = booklist;
}
@Override
public String toString() {
	String str="";
	str +="======================\n";
	str += "도서명 저자명 출판사명 출판일 가격 \n";
	str +="======================\n";
	
	double total=0.0;
	
//일반 for문	
//	for (int i = 0; i < booklist.size(); i++) {
//		str += booklist.get(i)+"\n";
//		total += booklist.get(i).getPrice();
//	} 
	
//향상된 for 문
//for(배열이나 ArrayList)의 자료형 변수명: 배열이나 ArrayList 이름{
//	     반복해서 실행할 문장;     }
 for(BookVO book : booklist) {
	 str +=book + "\n";
	 total += book.getPrice();
}	
	
	
	str +="======================\n";
    DecimalFormat df = new DecimalFormat("#,##0원");
	str +="합계금액: "+df.format(total)+"\n";
	str +="======================\n";
	return str;
}
//배열(booklist에 BookVO클래스 객체를 저장하는 메소드)
  public void addBook(BookVO book) {
//if 를 사용하는 전통적인 예외처리	 
//	  if(count<size) {
//	  booklist[count++] =book;
//      }else {
//    	  System.out.println("배열이 가득차서"+book.getAuthor()+ "의 데이터를 추가할 수 없습니다.");
//      }
   
//try~catch를 사용하는 예외처리
//예외가 발생될 것으로 예상되는 문장을 try 블록에 쓴다.	  
//예외가 발생되면 처리할 문장을 catch 블록에 쓴다.
//try 블록의 내용을 실행하다가 예외 발생되면 더이상 try 블록을 실행하지 않고 catch블록실행
	  //finally 블록은 선택사항으로서 예외 발생여부와 관계없이 무조건 실행해야 할 문장이 있으면 적는다.
	booklist.add(book);
  
  
     
    




}  }


