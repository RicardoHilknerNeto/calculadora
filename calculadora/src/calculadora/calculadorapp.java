package calculadora;

import javax.swing.JOptionPane;

public class calculadorapp {
	public static void main(String[] args) {
		  int op2, op3=0; 
		    double a, b ;
		    String x, op;

		    do{
		    op = JOptionPane.showInputDialog(null,"Insira a operação\n1- Soma\n2-Subtração\n3-Multiplicação\n4-Divisão");
		    op2 = Integer.parseInt(op);
		    x = JOptionPane.showInputDialog(null,"Digite o primeiro valor");
		    a = Double.parseDouble(x);
		     x = JOptionPane.showInputDialog(null,"Digite o segundo valor");
		     b = Double.parseDouble(x);  
		     if(op2 == 1){
		      JOptionPane.showMessageDialog(null, " O resultada da soma é "+ (a+b));   
		     }else if(op2 ==2){
		        JOptionPane.showMessageDialog(null, " O resultada da subtração é "+ (a-b));    
		     }else if(op2 == 3){
		           JOptionPane.showMessageDialog(null, " O resultada da multiplicação é "+ (a*b)); 
		     }else if(op2 == 4){
		           JOptionPane.showMessageDialog(null, " O resultada da divisão é "+ (a/b)); 
		     }else{
		           JOptionPane.showMessageDialog(null, " Operação Inválida"); 
		     }
		     op = JOptionPane.showInputDialog(null,"Digite 1 para continuar ou 2 para sair");
		    op3 = Integer.parseInt(op);
		    }while(op3 != 2);

		    }
	}
