package br.edu.insper.desagil.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	
	public Usuario(String nome) {
		super();
		this.nome = nome;
		this.videos = new ArrayList<>();
	}


	public String getNome() {
		return nome;
	}
	
	public void postaVideo(int id, Produto produto) {
		Video videos = new Video(id, this,produto);
		this.videos.add(videos);
		
	}
	
	public int totalAvaliacoes() {
		int soma = 0;
		for (Video videos : this.videos) {
			soma = soma + videos.mediaAvalicoes();
}
		return soma;
			
		
	}

	
	
	

}
