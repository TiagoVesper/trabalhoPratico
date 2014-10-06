package Trabalho;

import java.util.Scanner;

public class Tp1App {

	public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        Agencia a = new Agencia();
        int numero;
        String proprietario;
        float valor;
        boolean opcao = false;

        while (!opcao) {
            try {
                menu();
                int operacao = dado.nextInt();
                switch (operacao) {
                    case 1:
                        System.out.println("========================================");
                        System.out.println("1 - Criar conta");
                        System.out.print("Informe o numero: ");
                        numero = dado.nextInt();
                        System.out.print("Informe o proprietario: ");
                        proprietario = dado.next();
                        System.out.print("Informe o saldo: ");
                        float saldo = dado.nextFloat();
                        a.criarConta(numero, proprietario, saldo);
                        break;
                    case 2:
                        System.out.println("========================================");
                        System.out.println("2 - Cancelar conta");
                        System.out.print("Informe o numero: ");
                        numero = dado.nextInt();
                        a.cancelarConta(numero);
                        break;
                    case 3:
                        System.out.println("========================================");
                        System.out.println("3 - Sacar");
                        System.out.print("Informe o numero: ");
                        numero = dado.nextInt();
                        System.out.print("Informe o valor de saque: ");
                        valor = dado.nextFloat();
                        a.sacar(numero, valor);
                        break;
                    case 4:
                        System.out.println("========================================");
                        System.out.println("4 - Depositar");
                        System.out.print("Informe o numero: ");
                        numero = dado.nextInt();
                        System.out.print("Informe o valor de deposito: ");
                        valor = dado.nextFloat();
                        a.depositar(numero, valor);
                        break;
                    case 5:
                        System.out.println("========================================");
                        System.out.println("5 - Listar contas existentes");
                        System.out.println(a.listarContas());
                        break;
                    case 6:
                        opcao = true;
                        break;
                    default:
                        throw new ExcecaoOpcaoInvalida("Opção Invalida.");
                }
            } catch (Exception e) {
                System.out.println("========================================");
                System.out.print(e.getMessage());
            }
        }
	}

    public static void menu() {
        System.out.println("========================================");
        System.out.println("Sistema Bancario - Operacoes Disponiveis");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Cancelar conta");
        System.out.println("3 - Sacar");
        System.out.println("4 - Depositar");
        System.out.println("5 - Listar contas existentes");
        System.out.println("6 - Finalizar o programa");
        System.out.println("");
        System.out.print("Selecione uma operacao: ");
    }

}
