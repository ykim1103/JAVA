package kr.co.library;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

//�������� å ����(BookVO)�� ����� Arraylist
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
	str += "������ ���ڸ� ���ǻ�� ������ ���� \n";
	str +="======================\n";
	
	double total=0.0;
	
//�Ϲ� for��	
//	for (int i = 0; i < booklist.size(); i++) {
//		str += booklist.get(i)+"\n";
//		total += booklist.get(i).getPrice();
//	} 
	
//���� for ��
//for(�迭�̳� ArrayList)�� �ڷ��� ������: �迭�̳� ArrayList �̸�{
//	     �ݺ��ؼ� ������ ����;     }
 for(BookVO book : booklist) {
	 str +=book + "\n";
	 total += book.getPrice();
}	
	
	
	str +="======================\n";
    DecimalFormat df = new DecimalFormat("#,##0��");
	str +="�հ�ݾ�: "+df.format(total)+"\n";
	str +="======================\n";
	return str;
}
//�迭(booklist�� BookVOŬ���� ��ü�� �����ϴ� �޼ҵ�)
  public void addBook(BookVO book) {
//if �� ����ϴ� �������� ����ó��	 
//	  if(count<size) {
//	  booklist[count++] =book;
//      }else {
//    	  System.out.println("�迭�� ��������"+book.getAuthor()+ "�� �����͸� �߰��� �� �����ϴ�.");
//      }
   
//try~catch�� ����ϴ� ����ó��
//���ܰ� �߻��� ������ ����Ǵ� ������ try ��Ͽ� ����.	  
//���ܰ� �߻��Ǹ� ó���� ������ catch ��Ͽ� ����.
//try ����� ������ �����ϴٰ� ���� �߻��Ǹ� ���̻� try ����� �������� �ʰ� catch��Ͻ���
	  //finally ����� ���û������μ� ���� �߻����ο� ������� ������ �����ؾ� �� ������ ������ ���´�.
	booklist.add(book);
  
  
     
    




}  }


