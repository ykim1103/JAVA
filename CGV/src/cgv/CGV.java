package cgv;

import javax.swing.JOptionPane;

public class CGV { 
public static void main(String[] args) {
	String helloMsg="★어서오세요 CGV입니다★\n";
	String menuMsg= "①예매하기\n②구매하기\n③포인트조회\n④나가기";
	String films = "①라이언킹(08:00)\n②스파이더맨(12:00)\n③사일런스(23:00)[청소년관람불가]\n④뒤로가기";
    String ageMsg ="[청소년 구매 불가 상품]\n나이를 입력하세요\n";
    String food ="①팝콘\n②콜라\n③맥주\n④뒤로가기";
	int choice = 0;
	int age = 0;
	int money= 100000;
	int point = 0;
	int t_price = 10000;
	int f_price = 5000;
	boolean t_check;
	boolean f_check;
	
	
	while(true) {
		t_check =true;
		f_check =true;
         choice= Integer.parseInt(JOptionPane.showInputDialog(helloMsg+menuMsg));
	     if(choice ==4) break; 
	     //잘못 입력했을 때 continue
	     if(!(choice >=1 && choice<=3)) continue;  //choice가 1이거나 2가 아닐 때
	     
	     switch(choice) {
	//예매하기 영역
	     case 1:
	    	 if(money-t_price<0) {
	    		JOptionPane.showMessageDialog(null, "잔액이 부족합니다");
	    		continue;
	    	 }  //변수의 재사용->위에 있는 choice는 이제 다 써서 그냥 choice 써도 괜찮다.
	    	 choice=Integer.parseInt(JOptionPane.showInputDialog(films));
	    	 if(choice==1) {
	    		 JOptionPane.showMessageDialog(null,"라이언킹(08:00)예매완료"); }
	    	 else if (choice ==2) {JOptionPane.showMessageDialog(null,"스파이더맨(12:00)예매완료");   }
	    	 else if (choice ==3) {
	    		 age= Integer.parseInt (JOptionPane.showInputDialog(ageMsg));
	    		 if (age>19){
	    	          JOptionPane.showMessageDialog(null,"사일런스(23:00)예매완료");
	    	          } else {
	    	        	  t_check = false;
	    	        	  JOptionPane.showMessageDialog(null,"다시 시도해주세요");
	    	          }
	    	 }else {JOptionPane.showInputDialog(null,"메인메뉴로 이동합니다");continue;}
	    	 if(t_check) {
	    	     if(point>0) {
	    	    	 if(point-t_price >=0) {
	    	    		 point -= t_price;
	    	    	 }else {money -= (t_price-point);
	    	    		        point = 0;
	    	    	 }
	    	    	 
	    	     }else {
	    		 money -= t_price;
	    	     point +=(int)(t_price *0.5);
	    	     }
	    	     JOptionPane.showInputDialog(null,"현재잔액:"+money+"원");
	    	 break;}
	 
	    	 
	   //구매하기 영역 
	     case 2: 
	    	 if(money-f_price<0) {
		    		JOptionPane.showMessageDialog(null, "잔액이 부족합니다");
		    		continue;}
	    	 choice=Integer.parseInt(JOptionPane.showInputDialog(food));
	    	 if(choice ==1) {
	    		 JOptionPane.showMessageDialog(null,"팝콘구매완료"); }
	    		 
	         else if(choice ==2) {JOptionPane.showMessageDialog(null, "콜라구매완료");
	        	 
	         }
	         else if (choice ==3) {JOptionPane.showMessageDialog(null, "맥주구매완료");
	        	 
	         }else {JOptionPane.showInputDialog(null,"메인메뉴로 이동합니다");continue;}
	         if(f_check)  {
	        	 if(point>0) {
	        		 if(point- f_price>0) {
	        			 point -= f_price;}
	        		 else {money-= (f_price-point);
	        		 point= point;}
	        	 }
	        	 else {money -= f_price;
	        	 point +=(int)(f_price*0.5);} 
	        	 JOptionPane.showInputDialog(null,"현재잔액:"+money+"원");
	    	 break;}
	
	    	 
	   //포인트조회 영역
	     case 3:  
	    	 JOptionPane.showMessageDialog(null,"잔여포인트"+point+"점");
	    	 break;
	        
	     }
	}
}
}
