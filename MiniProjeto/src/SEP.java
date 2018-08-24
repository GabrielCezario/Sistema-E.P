import java.util.Scanner;

public class SEP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// vetores
		String vetor_nome[] = new String[500];
		String vetor_data[] = new String[500];
		String vetor_usuário[] = new String[500];
		String vetor_senha[] = new String[500];
		String vetor_usuário_cadastrado[] = new String[500];
		double vetor_renda_total[] = new double[500];
		int vetor_membro[] = new int[500];

		double renda_bruta;

		int opção = 1, opção_2 = 1, opção_3 = 3, contador_cadastro = 0, grupo_familiar,
				confirmar_login = 1, contador_confirmar;
		String usuário="", senha = "";
		
		double água, energia, internet, alimentação, cartão_de_crédito, soma_gastos=0;

		do {

			// menu inicial

			System.out.println("Sistema Econônico Pessoal");
			System.out.println("");
			System.out.println("[1] - Realizar Cadastro");
			System.out.println("[2] - Login");
			System.out.println("[0] - Finalizar programa");
			opção = scan.nextInt();

			// ---------

			switch (opção) {

			case 1:

				// CADASTRO PESSOAL

				System.out.println("Cadastro \n \n");

				System.out.println("Nome: ");
				vetor_nome[contador_cadastro] = scan.next();

				System.out.println("Data de nascimento: ");
				vetor_data[contador_cadastro] = scan.next();


				System.out.println("Nome de usuário: ");
				vetor_usuário[contador_cadastro] = scan.next();
	
	
				System.out.println("Senha: ");
				vetor_senha[contador_cadastro] = scan.next();
				
				System.out.println("Quantos membros seu grupo familiar tem? ");
				vetor_membro[contador_cadastro] = scan.nextInt();
				
				System.out.println("Qual a renda total do seu grupo familiar? ");
				vetor_renda_total[contador_cadastro] = scan.nextDouble();
				
				
				
				//E.U.L.A.
				

				contador_cadastro++;
				// ----------

				break;

			case 2:

				// ÁREA DE LOGIN
				do {

					contador_confirmar = 0;

					System.out.println("Digite seu nome de usuário: ");
					usuário = scan.next();

					System.out.println("Digite a senha: ");
					senha = scan.next();

					for (int i = 0; i < vetor_usuário.length; i++) {

						if (usuário.equals(vetor_usuário[i])) {
							contador_confirmar++;
						}
					}

					for (int i = 0; i < vetor_senha.length; i++) {

						if (senha.equals(vetor_senha[i])) {
							contador_confirmar++;
						}
					}

					if (contador_confirmar != 2) {
						System.out.println("Nome de usuário ou senha não existe/incorreto! \n");
					}
				} while (contador_confirmar != 2);
				// ----------

				// APÓS LOGIN

				System.out.println("Olá, " + usuário + ". Bem vindo ao Sistema Econômico Pessoal!");
				System.out.println("[1] - Calcular Despesas");
				System.out.println("[2] - Criar plano econômico");
				System.out.println("[3] - Exibir relatório");
				System.out.println("[0] - Voltar");
				//------------
				opção_2 = scan.nextInt();

				switch (opção_2) {

				case 1:

					System.out.println("CÁLCULO DE DESPESAS");
					
					System.out.println("Água: ");
					água = scan.nextDouble();
					
					System.out.println("Energia: ");
					energia = scan.nextDouble();
					
					System.out.println("Alimentação: ");
					alimentação = scan.nextDouble();
					
					System.out.println("Internet: ");
					internet = scan.nextDouble();
					
					System.out.println("Cartão de crédito: ");
					cartão_de_crédito = scan.nextDouble();
					

					soma_gastos = água+energia+alimentação+internet+cartão_de_crédito;	
					

					break;
					
				case 2:

					
						System.out.println("[1] - Ver opções de plano padrão");
						System.out.println("[2] - Plano personalizado");
						System.out.println("[0] - Voltar");
					
						opção_3 = scan.nextInt();
						
						
						switch (opção_3) {
						
						
						case 1:
							
							System.out.println("PLANOS PADRÃO");
							
							System.out.println("Plano de economia máxima");
							System.out.println("Plano poupança");
							System.out.println("Plano médio");
							System.out.println("Plano ostentação");
							
							
							
							
							
							
							
							
							
							break;
						case 2:
							System.out.println("PLANO PERSONALIZADO");
							
							
							
							
							
							
							
						
							
							
							
							
							break;
						case 0:
							
							break;
					
						default:
							
							break;
						
						}
						
						
						
					
						
						
						
						
						
	
						
						
					break;

				case 3:

					break;

					
					
					
					
					
				case 0:

					break;

				default:
					
					System.out.println("Opção incorreta, por favor tente novamente!");
					break;

				}

				
				
				
				
				
				break;

			case 0:

				System.out.println("PROGRAMA FINALIZADO PELO USUÁRIO!");
				opção = 0;
				break;

			default:

				System.out.println("Opção incorreta, por favor tente novamente!");

			}

		} while (opção != 0);

	}

}
