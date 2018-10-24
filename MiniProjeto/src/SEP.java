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

		

		//opções
		int opção = 1, opção_2 = 1, opção_3 = 3;
		
		
		//contadores
		int contador_cadastro = 0, contador_confirmar, confirmar=0;
		
		
		//login
		String usuário="", senha = "";
		String continuar_p_person="";
		
		
		//gastos R$
		double água, energia, internet, alimentação, cartão_de_crédito, soma_gastos=0;
		
		
		//percentuais dos gastos
		double percentual_água, percentual_internet, percentual_alimentação,
		percentual_energia, percentual_cartão_de_crédito, percentual_poupança;
		
		
		//variáveis de salvar configuração
		double salvar_água=0, salvar_energia=0, salvar_internet=0, salvar_alimentação=0, salvar_cartão_de_crédito=0, salvar_poupança=0;
		
		

		do {

			// menu inicial

			System.out.println("Sistema Econônico Pessoal");
			System.out.println("");
			System.out.println("[1] - Realizar Cadastro");
			System.out.println("[2] - Login");
			System.out.println("[3] - Descrição");
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

				
				do {
					
				confirmar=0;
					
				System.out.println("Nome de usuário: ");
				vetor_usuário[contador_cadastro] = scan.next();
				
				
				for (int i = 0; i < contador_cadastro; i++) {
					
					
					if (vetor_usuário[i].equalsIgnoreCase(vetor_usuário[contador_cadastro])) {
						
						confirmar++;
						
					}
				}
				
				
				if (confirmar>=1) {
					
					System.out.println("Usuário já cadastrado, tente outro nome de usuário!");
				}
				
				
				
				}while(confirmar!=0);
				//---------------------
				
				System.out.println("Senha: ");
				vetor_senha[contador_cadastro] = scan.next();
				
				System.out.println("Quantos membros seu grupo familiar tem? ");
				vetor_membro[contador_cadastro] = scan.nextInt();
				
				System.out.println("Qual a renda total do seu grupo familiar (R$)? ");
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
							
							System.out.println("[1] - Plano de economia máxima");
							
							/*case 1:
							 * 
							 * 
							 * if(valor_renda_total<=1000){
							 * 
							 * percentual_água = 10%;
							 * percentual_energia=8%;
							 * 
							 * }else if(valor_renda_total>1000 && valor_renda_total<3000 ) {
							 * 
							 * percentual_água = 8%;
							 * percentual_energia= 5%;
							 * 
							 * }
							 * 
							 * % -> salário  = R$30 ~ R$100
							 * 0-100 -> salário = 30 [valor] 100
							 * 
							 * 
							 * 
							 *  
							 * 
							 * 
							 * 
							 * 
							 * salvar_água = percentual_água;
							 * 
							 * 
							 */
							
							
							System.out.println("[2] - Plano poupança");
							System.out.println("[3] - Plano gasto médio");
							System.out.println("[4] - Plano alto gasto");
							System.out.println("[0] - Voltar");
							
							
							
							//variavel = essa configuração
							
							
							
							
							break;
						case 2:
							
							percentual = 100;
							
							System.out.println("PLANO PERSONALIZADO");
							System.out.println("Selecione o percentual desejado para cada item a seguir: ");
							System.out.println("Por padrão do sistema, o percentual máximo é de 60%!");
							
							
							
							
							do {
								do {
							System.out.println("Água: ");
							percentual_água = scan.nextDouble();
							if (percentual_água<0 || percentual_água>60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
							}while(percentual_água<0 || percentual_água>60);
							cálculo_plano_personalizado(percentual_água);
							}while(confirmação_p_person!=0);
							
							
							
					
							do {
								do {
							System.out.println("Energia: ");
							percentual_energia = scan.nextDouble();
							
							if (percentual_energia<0 || percentual_energia>60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
							}while(percentual_energia<0 || percentual_energia>60);
							cálculo_plano_personalizado(percentual_energia);
							}while(confirmação_p_person!=0);
							
							
							
							
							do {
								do {
							System.out.println("Alimentação: ");
							percentual_alimentação = scan.nextDouble();
							
							if (percentual_alimentação<0 || percentual_alimentação>60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
							}while(percentual_alimentação<0 || percentual_alimentação>60);
							cálculo_plano_personalizado(percentual_alimentação);
							}while(confirmação_p_person!=0);
							
							
							
							
							do {
								do {
							System.out.println("Internet: ");
							percentual_internet = scan.nextDouble();
							
							if (percentual_internet<0 || percentual_internet>60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
							}while(percentual_internet<0 || percentual_internet>60);
							cálculo_plano_personalizado(percentual_internet);		
							}while(confirmação_p_person!=0);
						
					
							
							
							do {
								do {
							System.out.println("Cartão de crédito: ");
							percentual_cartão_de_crédito = scan.nextDouble();
							
							if (percentual_cartão_de_crédito<0 || percentual_cartão_de_crédito>60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
							}while(percentual_cartão_de_crédito<0 || percentual_cartão_de_crédito>60);
							cálculo_plano_personalizado(percentual_cartão_de_crédito);
							}while(confirmação_p_person!=0);
							
							
							
							
							do {
								do {
							System.out.println("Poupança: ");
							percentual_poupança = scan.nextDouble();
							
							if (percentual_poupança<0 || percentual_poupança>60) {
								System.out.println("Percentual inválido, tente novamente!");
							}
							}while(percentual_poupança<0 || percentual_poupança>60);
							cálculo_plano_personalizado(percentual_poupança);
							}while(confirmação_p_person!=0);
							
							
							
							
							
							System.out.println("Configuração do plano: \n");
							System.out.println("Água: "+percentual_água+"%");
							System.out.println("Energia: "+percentual_energia+"%");
							System.out.println("Alimentação: "+percentual_alimentação+"%");
							System.out.println("Internet: "+percentual_internet+"%");
							System.out.println("Cartão de crédito: "+percentual_cartão_de_crédito+"%");
							System.out.println("Poupança: "+percentual_poupança+"% \n");
							
							
							System.out.println("Continuar? (S/N)");
							continuar_p_person = scan.next();
							
							//////////////////////////////////
							
							
							//SWITCH de confirmação de plano
							switch (continuar_p_person) {
							case "S":
								
								//salvar_configuração();
								
								
								salvar_água=percentual_água; salvar_alimentação=percentual_alimentação;
								salvar_cartão_de_crédito=percentual_cartão_de_crédito; salvar_energia=percentual_energia;
								salvar_internet=percentual_internet; salvar_poupança=percentual_poupança;
								
								
								break;
							case "N":
								percentual_água=salvar_água; percentual_energia=salvar_energia; 
								percentual_alimentação=salvar_alimentação;
								percentual_internet=salvar_internet; percentual_cartão_de_crédito=salvar_cartão_de_crédito;
								percentual_poupança=salvar_poupança; break;
								
							default:
									System.out.println("Opção incorreta, por favor tente novamente!");
							}
							//---------------------
							
							break;
						
						case 0:
							break;
					
						default:
							
							System.out.println("Opção incorreta, por favor tente novamente!");
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

///////////////////////////// MÉTODOS //////////////////////////////////
	
	
	static double percentual;

	public static void cálculo_plano_personalizado (double x) {
		
		
		
			
			if (x<=percentual) {
			percentual = percentual-x;
			confirmação_p_person=0;
			System.out.println("Pontos percentuais restantes a serem distribuídos = "+percentual+"%");
		}else {
			confirmação_p_person=1;
			System.out.println("valor não pode ser aceitado pois não há "
					+ " pontos percentuais suficientes a serem distribuídos (Restam "+percentual+"%)");
		
		}
	}
	
	static int confirmação_p_person=1;
	
	public static void salvar_configuração(){
		
		/*salvar_água=percentual_água; salvar_alimentação=percentual_alimentação;
		salvar_cartão_de_crédito=percentual_cartão_de_crédito; salvar_energia=percentual_energia;
		salvar_internet=percentual_internet; salvar_poupança=percentual_poupança;
		 */
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
