import java.util.Scanner;

public class SEP {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// variáveis de verificação
		int verificação_case=1, verificação_menu_inicial = 1, verificação_logado = 1, verificação_relatório = 1, opçao=1;
		
		//matrizes
		String matriz_cadastro[][] = new String[500][4];
		
		//contadores
		int contador_cadastro = 0;
		
		//variáveis Strings
		String usuário, senha_usuário = "";

		do {

			// menu inicial

			System.out.println("Sistema Econônico Pessoal");
			System.out.println("");
			System.out.println("[1] - Realizar Cadastro");
			System.out.println("[2] - Login");
			System.out.println("[0] - Finalizar programa");
			verificação_menu_inicial = scan.nextInt();

			// menu inicial

			switch (verificação_menu_inicial) {

			case 1:
				
				contador_cadastro++;
				System.out.println("Cadastro");
				System.out.println("");
				
				System.out.println("Nome: ");
				matriz_cadastro[contador_cadastro][0] = scan.next();
				System.out.println("Data de nascimento: ");
				matriz_cadastro[contador_cadastro][1] = scan.next();
				System.out.println("Nome de usuário: ");
				matriz_cadastro[contador_cadastro][2] = scan.next();
				System.out.println("Senha: ");
				matriz_cadastro[contador_cadastro][3] = scan.next();
				
				
				
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
