package My_project;
import java.util.Scanner;
public class My_project {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	//declaração de variaveis 
	int num;
	float n1, n2, resul;
	int sim;
	// menssagem de boas vindas
    System.out.println("===========================");	
	System.out.println("PROGRAMA CALCULADORA BASICA ");
	System.out.println("== ========================");
	do //---------------------------------- Esse do foi criado para determinar continuação caso o usuario digite 1;
	{
	// informa menu opções de menu
	System.out.println("======================");
	System.out.println("ABAIXO ESTÁ NOSSO MENU");
	System.out.println("======================\n");
	
	// mostra opções do menu de operações
	System.out.println("| DIGITE 1 PARA SOMAR      |");
	System.out.println("| DIGITE 2 PARA SUBTRAIR   |");
	System.out.println("| DIGITE 3 PARA MULTIPLICAR|");
	System.out.println("| DIGITE 4 PARA DIVIDIR    |\n");
	System.out.println("============================");
	//lógica para se o numero digitado for errado, diferente das opções do menu, o programa pede para que digite novamente.
	
    do
		{
	System.out.println("  DIGITE UMA OPÇÃO:");
		num= sc.nextInt();
		// informa mensagem de erro.
		if((num!=1)&&(num!=2)&&(num!=3)&&(num!=4))
		{
		System.out.println("VOCE ERROU! TENTE NOVAMENTE");
		}
		}while((num!=1)&&(num!=2)&&(num!=3)&&(num!=4));
	
	// se o numero digitado for igaul a 1 entra no menu soma.
	if (num==1)
	{
		
		System.out.println("=========================================");
		System.out.println("PARA EFETUAR A SOMA SIGA OS PASSOS ABAIXO");
		System.out.println("=========================================\n");
		System.out.println("DIGITE O PRIMEIRO NUMERO");
		n1 = sc.nextFloat();
		System.out.println("DIGITE O SEGUNDO NUMERO");
		n2 = sc.nextFloat();
		resul = n1+n2;
		System.out.println("==============================");
		System.out.println("O RESULTADO DA SOMA É: "+resul);
		System.out.println("==============================\n");
	
		
		
		// se o numero for igual a 2 entra no menu subtração
	}
	if (num==2)
	{
		System.out.println("==============================================");
		System.out.println("PARA EFETUAR A SUBTRAÇÃO SIGA OS PASSOS ABAIXO");
		System.out.println("==============================================\n");
		System.out.println("DIGITE O PRIMEIRO NUMERO");
		n1 = sc.nextFloat();
		System.out.println("DIGITE O SEGUNDO NUMERO");
		n2 = sc.nextFloat();
		resul = n1-n2;
		System.out.println("===================================");
		System.out.println("O RESULTADO DA SUBTRAÇÃO É: "+resul);
		System.out.println("===================================\n");
	}
	
	// se o numero for igual a 3 entra no menu multiplicação 
	if (num==3)
	{
		System.out.println("==================================================");
		System.out.println("PARA EFETUAR A MULTIPLICAÇÃO SIGA OS PASSOS ABAIXO");
		System.out.println("==================================================\n");
		System.out.println("DIGITE O PRIMEIRO NUMERO");
		n1 = sc.nextFloat();
		System.out.println("DIGITE O SEGUNDO NUMERO");
		n2 = sc.nextFloat();
		resul = n1*n2;
		
		System.out.println("=======================================");
		System.out.println("O RESULTADO DA MULTIPLICAÇÃO É: "+resul);
		System.out.println("=======================================\n");
		
		// se o numero for igual a 4 entra no menu divisão
	}
	if (num==4)
	{
		System.out.println("============================================");
		System.out.println("PARA EFETUAR A DIVISÃO SIGA OS PASSOS ABAIXO");
		System.out.println("============================================\n");
		System.out.println("DIGITE O PRIMEIRO NUMERO");
		n1 = sc.nextFloat();
		System.out.println("DIGITE O SEGUNDO NUMERO");
		n2 = sc.nextFloat();
		resul = n1/n2;
		System.out.println("=================================");
		System.out.println("O RESULTADO DA DIVISÃO É: "+resul);
		System.out.println("=================================\n");
	}
	System.out.println("=====================================");
	System.out.println("SE DESEJA CONTINUAR DIGITE O NUMERO 1");
	System.out.println("=====================================\n");
	sim = sc.nextInt();
	
	
	if (sim!=1)
	{
		System.out.println("**********************");
		System.out.println("**********************");
		System.out.println("**********************");
		System.out.println("**********************");
		System.out.println("**********************");
		System.out.println("OBRIGADO ATÉ A PROXIMA");
		System.out.println("**********************");
	}
	
} while(sim==1); // Caso o usuario digite 1 ele retorna ao menu inicial 
		
	}

	}

