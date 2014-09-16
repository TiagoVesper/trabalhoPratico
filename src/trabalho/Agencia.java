package trabalho;

import java.util.ArrayList;

public class Agencia {
	private byte MAX_CONTAS = 20;
	private ArrayList<Conta> contas = new ArrayList<Conta>(MAX_CONTAS);
	
	public void criarConta(int numero, String proprietario, float saldo) {
		if (contas.size() < MAX_CONTAS) {
            Conta c = new Conta(numero, proprietario, saldo);
            contas.add(c);
        }
            // TODO CRIAR EXCECAO PARA PARA NUMERO MAXIMO DE CONTAS CADASTRADO

	}
	
	public void cancelarConta(int numero) {
        for (int aux = 0; aux < contas.size(); aux ++) {
            Conta c  = contas.get(aux);
            if (numero == c.getNumero()){
                contas.remove(aux);
            }
        }
        // TODO CRIAR EXCECAO PARA NUMERO DE CONTA NAO EXISTENTE
	}
	
	public void depositar(int numero, float valor) {
        for (int aux = 0; aux < contas.size(); aux ++) {
            Conta c = contas.get(aux);
            if (numero == c.getNumero()){
                c.depositar(valor);
                contas.add(c);
            }
        }
        // TODO CRIAR EXECAO PARA NUMERO DE CONTA NAO EXISTENTE

	}

    public void sacar(int numero, float valor) {
        for (int aux = 0; aux < contas.size(); aux ++) {
            Conta c = contas.get(aux);
            if (numero == c.getNumero()){
                c.listarDados();
                c.sacar(valor);
                c.listarDados();
                contas.add(c);
            }
        }
        // TODO CRIAR EXECAO PARA NUMERO DE CONTA NAO EXISTENTE
    }

    public void listarContas() {
        for (int aux = 0; aux < contas.size(); aux ++) {
            Conta c = contas.get(aux);
            System.out.println(c.listarDados());
        }
    }

    //private int getConta(int numero) {
    // retorna uma conta conforme seu numero
    //return conta;
    //}

    //private float getSaldo(int numero) {
    // retorna saldo conforme numero da conta
    //	return saldo;
    //}

}
