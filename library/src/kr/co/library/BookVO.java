package kr.co.library;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//å �ѱ��� ������ ����ϴ� Ŭ����
public class BookVO {   //�������(å�� �ʿ��� ��������)
	private String title;               //å�̸�
	private String author;           //���ڸ�
	private String publisher;       //���ǻ�
    private Date date;                //������
    private double price;            //����
    
    
    public BookVO() { //�⺻������
	}

    //�⺻������ �����ϰ� ����� �Ѱܹޱ� ���� alt shift o-> using field�Ѵ�.
	public BookVO(String title, String author, String publisher, Date date, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		 
		//��¥�� �Է��� �� �⵵�� �ڹٿ����� 1900���� �����̼� �Է��� ���� 1900�����Ѵ�.
		//���� 1�� ���� �Է��ؾ� ���������� ó���Ѵ�.  
		date.setYear(date.getYear()-1900);
		date.setMonth(date.getMonth()-1);
		this.date = date;
		this.price = price;
	}

	//alt shift o -> getter,setter ����
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

	
	//���� �Ѱ��� ����ؼ� Ȯ���غ��� ����
	//  alt shift o ->toString
	@Override
	public String toString() {//s =���ڿ�(å�̸�,�۰�,���ǻ�,��¥)  f=�Ǽ�(����)    
		//��¥����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd(E)");
		//DecimalFormat Ŭ������ ������ ��� ������ �����Ѵ�.
		// #,##0�� �ǹ̴� õ �������� �ĸ��� ������� �ǹ�
		DecimalFormat df = new DecimalFormat("#,##0");
		return String.format("%s %s %s %s %s",  title, author , publisher, sdf.format(date),df. format(price));
	}
    
}
