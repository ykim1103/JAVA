package cgv;

import javax.swing.JOptionPane;

public class CGV { 
public static void main(String[] args) {
	String helloMsg="�ھ������ CGV�Դϴ١�\n";
	String menuMsg= "�翹���ϱ�\n�豸���ϱ�\n������Ʈ��ȸ\n�곪����";
	String films = "����̾�ŷ(08:00)\n�轺���̴���(12:00)\n����Ϸ���(23:00)[û�ҳ�����Ұ�]\n��ڷΰ���";
    String ageMsg ="[û�ҳ� ���� �Ұ� ��ǰ]\n���̸� �Է��ϼ���\n";
    String food ="������\n���ݶ�\n�����\n��ڷΰ���";
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
	     //�߸� �Է����� �� continue
	     if(!(choice >=1 && choice<=3)) continue;  //choice�� 1�̰ų� 2�� �ƴ� ��
	     
	     switch(choice) {
	//�����ϱ� ����
	     case 1:
	    	 if(money-t_price<0) {
	    		JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�");
	    		continue;
	    	 }  //������ ����->���� �ִ� choice�� ���� �� �Ἥ �׳� choice �ᵵ ������.
	    	 choice=Integer.parseInt(JOptionPane.showInputDialog(films));
	    	 if(choice==1) {
	    		 JOptionPane.showMessageDialog(null,"���̾�ŷ(08:00)���ſϷ�"); }
	    	 else if (choice ==2) {JOptionPane.showMessageDialog(null,"�����̴���(12:00)���ſϷ�");   }
	    	 else if (choice ==3) {
	    		 age= Integer.parseInt (JOptionPane.showInputDialog(ageMsg));
	    		 if (age>19){
	    	          JOptionPane.showMessageDialog(null,"���Ϸ���(23:00)���ſϷ�");
	    	          } else {
	    	        	  t_check = false;
	    	        	  JOptionPane.showMessageDialog(null,"�ٽ� �õ����ּ���");
	    	          }
	    	 }else {JOptionPane.showInputDialog(null,"���θ޴��� �̵��մϴ�");continue;}
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
	    	     JOptionPane.showInputDialog(null,"�����ܾ�:"+money+"��");
	    	 break;}
	 
	    	 
	   //�����ϱ� ���� 
	     case 2: 
	    	 if(money-f_price<0) {
		    		JOptionPane.showMessageDialog(null, "�ܾ��� �����մϴ�");
		    		continue;}
	    	 choice=Integer.parseInt(JOptionPane.showInputDialog(food));
	    	 if(choice ==1) {
	    		 JOptionPane.showMessageDialog(null,"���ܱ��ſϷ�"); }
	    		 
	         else if(choice ==2) {JOptionPane.showMessageDialog(null, "�ݶ󱸸ſϷ�");
	        	 
	         }
	         else if (choice ==3) {JOptionPane.showMessageDialog(null, "���ֱ��ſϷ�");
	        	 
	         }else {JOptionPane.showInputDialog(null,"���θ޴��� �̵��մϴ�");continue;}
	         if(f_check)  {
	        	 if(point>0) {
	        		 if(point- f_price>0) {
	        			 point -= f_price;}
	        		 else {money-= (f_price-point);
	        		 point= point;}
	        	 }
	        	 else {money -= f_price;
	        	 point +=(int)(f_price*0.5);} 
	        	 JOptionPane.showInputDialog(null,"�����ܾ�:"+money+"��");
	    	 break;}
	
	    	 
	   //����Ʈ��ȸ ����
	     case 3:  
	    	 JOptionPane.showMessageDialog(null,"�ܿ�����Ʈ"+point+"��");
	    	 break;
	        
	     }
	}
}
}
