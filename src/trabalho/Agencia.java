package trabalho;

import java.util.ArrayList;

public class Agencia {
	private byte MAX_CONTAS = 3;
	private ArrayList<Conta> contas = new ArrayList<Conta>(MAX_CONTAS);
	
	public void criarConta(int numero, String proprietario, float saldo) {
		// cria uma conta conforme dados enviado via paramentro
        Conta c = new Conta(numero, proprietario, saldo);
        this.contas.add(c);
	}
	
	public void cancelarConta(int numero) {
		// cancela conta conforme numero passando o numero
        for (Conta c : this.contas){
           if(c.getNumero() == numero){
               this.contas.remove(c);
           }
        }
	}
	
	public void depositar(int numero, float valor) {
		// depoista valor conforme paramentros de valor e numero da conta
	}
	
	private int getConta(int numero) {
		// retorna uma conta conforme seu numero
		return conta;
	}
	
	private float getSaldo(int numero) {
		// retorna saldo conforme numero da conta
		return saldo;
	}
	
	public String listarContas() {
		return "contasDaAgencia";
	}

    public void sacar(int numero, float valor) {
    	//realiza saque em uma conta passando numero da conta e valor a ser sacado
    }


}
