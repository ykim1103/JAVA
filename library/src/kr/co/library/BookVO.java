package kr.co.library;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//책 한권의 정보를 기억하는 클래스
public class BookVO {   //멤버구현(책에 필요한 정보구현)
	private String title;               //책이름
	private String author;           //저자명
	private String publisher;       //출판사
    private Date date;                //출판일
    private double price;            //가격
    
    
    public BookVO() { //기본생성자
	}

    //기본생성자 구현하고 멤버를 넘겨받기 위해 alt shift o-> using field한다.
	public BookVO(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		 
		//날짜를 입력할 때 년도는 자바에서는 1900년이 기준이서 입력할 때는 1900빼야한다.
		//월은 1을 빼서 입력해야 정상적으로 처리한다.  
		date.setYear(date.getYear()-1900);
		date.setMonth(date.getMonth()-1);
		this.date = date;
		this.price = price;
	}

	//alt shift o -> getter,setter 생성
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	//위에 한것을 출력해서 확인해보기 위함
	//  alt shift o ->toString
	@Override
	public String toString() {//s =문자열(책이름,작가,출판사,날짜)  f=실수(가격)    
		//날짜편집
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd(E)");
		//DecimalFormat 클래스는 숫자의 출력 서식을 지정한다.
		// #,##0의 의미는 천 단위마다 컴마를 찍으라는 의미
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("%s %s %s %s %s",  title, author , publisher, sdf.format(date),df. format(price));
	}
    
}
