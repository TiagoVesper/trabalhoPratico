package TP1_TiagoCoimbrVesper_WagnerDiasMartins;

import java.util.ArrayList;

public class Agencia {
	private final byte MAX_CONTAS = 20;
	private ArrayList<Conta> contas = new ArrayList<Conta>(MAX_CONTAS);
	
	public void criarConta(int numero, String proprietario, float saldo) {
		if (contas.size() < MAX_CONTAS) {
            for (int aux = 0; aux < contas.size(); aux ++) {
                Conta c  = contas.get(aux);
                if (numero == c.getNumero()){
                    throw new ExcecaoContaExistente("O numero de conta informado já existe.");
                }
            }
            Conta c = new Conta(numero, proprietario, saldo);
            contas.add(c);
        } else {
            throw new ExcecaoFaltaEspaco("O numero maximo de contas já foi cadastrada.");
        }
	}
	
	public void cancelarConta(int numero) {
        Conta c = getConta(numero);
        contas.remove(c);
	}
	
	public void depositar(int numero, float valor) {
        Conta c = getConta(numero);
        c.depositar(valor);
	}

    public void sacar(int numero, float valor) {
        Conta c = getConta(numero);
        c.sacar(valor);
    }

    public String listarContas() {
        String listaDeContas = "";
        for (int aux = 0; aux < contas.size(); aux ++) {
            Conta c = contas.get(aux);
            listaDeContas = listaDeContas + c.listarDados();
        }
        return listaDeContas;
    }

    private Conta getConta(int numero) {
        for (int aux = 0; aux < contas.size(); aux ++) {
            Conta c = contas.get(aux);
            if (numero == c.getNumero()){
                return c;
            }
        }
        throw new ExcecaoContaInexistente("O numero de conta informado não existe.");
    }

    private float getSaldo(int numero) {
        Conta c = getConta(numero);
        return c.getSaldo();
    }

}
