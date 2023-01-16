package media;

import javax.swing.JOptionPane;

public class media_programs {
	
	public static void main(String[] args) {
		
		String nota1=JOptionPane.showInputDialog("Qual a nota do semestre 1?");
		String nota2=JOptionPane.showInputDialog("Qual nota do segundo semestre?");
		String nota3=JOptionPane.showInputDialog("Qual nota do terceito semestre?");
		String nota4=JOptionPane.showInputDialog("Qual nota do quarto semestre?");
		
		double calcNot1=Double.parseDouble(nota1);
		double calcNot2=Double.parseDouble(nota2);
		double calcNot3=Double.parseDouble(nota3);
		double calcNot4=Double.parseDouble(nota4);
		
		double total=(calcNot1 + calcNot2 + calcNot3 + calcNot4)/4;
	
		
		if(total >=50) {
			if(total >=70) {
				JOptionPane.showMessageDialog(null,"Aluno APROVADo");
			}else {
				JOptionPane.showMessageDialog(null, "Aluno foi para RECUPERAÇÃO: " + total);
			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno REPROVADO");
		}
		
	}
}
