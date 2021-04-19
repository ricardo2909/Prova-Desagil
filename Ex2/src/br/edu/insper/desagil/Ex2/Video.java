package br.edu.insper.desagil.Ex2;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private int id;
	private Usuario usuario;
	private Produto produto;
	private Map<String, Integer> avaliacoes;
	
	
	public Video(int id, Usuario usuario, Produto produto) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.produto = produto;
		this.avaliacoes = new HashMap<>();
		
		}


	public int getId() {
		return id;
	}

	public Produto getProduto() {
		return produto;
	}
	
	public void adicionaAvaliacao(Usuario usuarioDif, int aval) {
		if (usuarioDif.getNome() != this.usuario.getNome() && aval>=5 && aval<=1) {
			this.avaliacoes.put(usuarioDif.getNome(), aval);
			
		}
	}

	public int mediaAvalicoes() {
		double total = 0;
		int n = 0;
		for (int avals : this.avaliacoes.values()) {
			total = total + avals;
			n +=1;
		}
		
		return (int) Math.round(total/n);
		
	}
	

}
