import java.util.Scanner;


public class SEP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		
		
		int verificação_menu_inicial = 1, opçao=1;
		
		String usuário, senha_usuário = "";

		
		
		do {

			// menu inicial

			System.out.println("Sistema Econônico Pessoal");
			System.out.println("");
			System.out.println("[1] - Realizar Cadastro");
			System.out.println("[2] - Login");
			System.out.println("[0] - Finalizar programa");
			verificação_menu_inicial = scan.nextInt();

			//---------

			switch (verificação_menu_inicial) {

			case 1:
				
				//CADASTRO PESSOAL
				
				
				System.out.println("Cadastro");
				System.out.println("");
				
				System.out.println("Nome: ");
				
				
				System.out.println("Data de nascimento: ");
				
				
				System.out.println("Nome de usuário: ");
				
				
				System.out.println("Senha: ");
				
				//----------
				
				
				
				//CADASTRO DOS PLANOS
				
				//----------
				
				
				break;
			
			case 2:

				
		
				
				
				
				
				break;
			
				
			case 0:

				System.out.println("PROGRAMA FINALIZADO PELO USUÁRIO!");
				verificação_menu_inicial = 0;
				break;

			default:

				System.out.println("Opção incorreta, por favor tente novamente!");

			}

		} while (verificação_menu_inicial != 0);

	}

}
