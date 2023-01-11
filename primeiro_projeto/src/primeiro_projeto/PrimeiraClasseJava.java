package primeiro_projeto;

public class PrimeiraClasseJava {
	
	/*A seguir variável GLOBAL*/
	static String nomeDeveloper="João Lucas";
	
	
	/* Main é um método auto executavel em java */
	
	public static void main(String[] args) {
		
		/* Escreva texto no console*/
		System.out.println("Meu primeiro programa em Java");
		System.out.println("Java é POO");
		
		/*A seguir variaveis locais ,pois pertence ao método main*/
		
		int numero=2;
		int numero2=0;
		System.out.println(numero + numero2);
		
		/*Estrutura de variavel*/
		
		boolean logica;
		boolean logica2;
		
		/*Testando*/
		
		int idadePadrao=18;
		
		if(idadePadrao >=18) {
			System.out.println("Poderá beber");
		}else {
			System.out.println("Não poderá beber");
		}
		
		metodo2();
		
		/*Realizando operações*/
		
		double num1=90;
		double num2=70;
		double num3=50;
		double mediaFinal= (num1+num2+num3)/ 4;
		System.out.println("O total é = " + mediaFinal);
		
		/*Tipo CHAR - representa UMA letra*/
		char pessoaFisica='F';
		char pessoaJuridica='J';
		if(pessoaFisica == 'F') {
			System.out.println("Pessoa Fisica");
		}else {
			System.out.println("Pessoa Juridica");
		}
		
		/*String*/
		
		String textoQualquer="Bem vindo ao Java";
	}
	
	public static void metodo2() {
		System.out.println("Meu nome é " + nomeDeveloper);
	}/*Invoca o seu método no main pois main é auto executável*/
}
