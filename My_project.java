package My_project;
import java.util.Scanner;
public class My_project {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	//declara��o de variaveis 
	int num;
	float n1, n2, resul;
	int sim;
	// menssagem de boas vindas
    System.out.println("===========================");	
	System.out.println("PROGRAMA CALCULADORA BASICA ");
	System.out.println("== ========================");
	do //---------------------------------- Esse do foi criado para determinar continua��o caso o usuario digite 1;
	{
	// informa menu op��es de menu
	System.out.println("======================");
	System.out.println("ABAIXO EST� NOSSO MENU");
	System.out.println("======================\n");
	
	// mostra op��es do menu de opera��es
	System.out.println("| DIGITE 1 PARA SOMAR      |");
	System.out.println("| DIGITE 2 PARA SUBTRAIR   |");
	System.out.println("| DIGITE 3 PARA MULTIPLICAR|");
	System.out.println("| DIGITE 4 PARA DIVIDIR    |\n");
	System.out.println("============================");
	//l�gica para se o numero digitado for errado, diferente das op��es do menu, o programa pede para que digite novamente.
	
    do
		{
	System.out.println("  DIGITE UMA OP��O:");
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
		System.out.println("O RESULTADO DA SOMA �: "+resul);
		System.out.println("==============================\n");
	
		
		
		// se o numero for igual a 2 entra no menu subtra��o
	}
	if (num==2)
	{
		System.out.println("==============================================");
		System.out.println("PARA EFETUAR A SUBTRA��O SIGA OS PASSOS ABAIXO");
		System.out.println("==============================================\n");
		System.out.println("DIGITE O PRIMEIRO NUMERO");
		n1 = sc.nextFloat();
		System.out.println("DIGITE O SEGUNDO NUMERO");
		n2 = sc.nextFloat();
		resul = n1-n2;
		System.out.println("===================================");
		System.out.println("O RESULTADO DA SUBTRA��O �: "+resul);
		System.out.println("===================================\n");
	}
	
	// se o numero for igual a 3 entra no menu multiplica��o 
	if (num==3)
	{
		System.out.println("==================================================");
		System.out.println("PARA EFETUAR A MULTIPLICA��O SIGA OS PASSOS ABAIXO");
		System.out.println("==================================================\n");
		System.out.println("DIGITE O PRIMEIRO NUMERO");
		n1 = sc.nextFloat();
		System.out.println("DIGITE O SEGUNDO NUMERO");
		n2 = sc.nextFloat();
		resul = n1*n2;
		
		System.out.println("=======================================");
		System.out.println("O RESULTADO DA MULTIPLICA��O �: "+resul);
		System.out.println("=======================================\n");
		
		// se o numero for igual a 4 entra no menu divis�o
	}
	if (num==4)
	{
		System.out.println("============================================");
		System.out.println("PARA EFETUAR A DIVIS�O SIGA OS PASSOS ABAIXO");
		System.out.println("============================================\n");
		System.out.println("DIGITE O PRIMEIRO NUMERO");
		n1 = sc.nextFloat();
		System.out.println("DIGITE O SEGUNDO NUMERO");
		n2 = sc.nextFloat();
		resul = n1/n2;
		System.out.println("=================================");
		System.out.println("O RESULTADO DA DIVIS�O �: "+resul);
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
		System.out.println("OBRIGADO AT� A PROXIMA");
		System.out.println("**********************");
	}
	
} while(sim==1); // Caso o usuario digite 1 ele retorna ao menu inicial 
		
	}

	}

