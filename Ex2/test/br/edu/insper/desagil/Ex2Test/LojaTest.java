package br.edu.insper.desagil.Ex2Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


import br.edu.insper.desagil.Ex2.Produto;
import br.edu.insper.desagil.Ex2.Usuario;
import br.edu.insper.desagil.Ex2.Vendedor;
import br.edu.insper.desagil.Ex2.Video;

public class LojaTest {
	
	@Test
	public void teste2() {
		Vendedor usuario1 = new Vendedor("Ricardo");
		Produto produto = new Produto("bola", 39.9);
		Video video = new Video(1, usuario1, produto);
		Usuario usuario = new Usuario("Hashi");
		video.adicionaAvaliacao(usuario, 5);
		assertEquals(5,usuario.totalAvaliacoes());
		
		
	}
	
	@Test
	public void teste3() {
		Vendedor usuario1 = new Vendedor("Ricardo");
		Produto produto = new Produto("bola", 39.9);
		Video video = new Video(1, usuario1, produto);
		Usuario usuario = new Usuario("Hashi");
		video.adicionaAvaliacao(usuario, 5);
		video.adicionaAvaliacao(usuario, 4);
		assertEquals(5,usuario.totalAvaliacoes());
		
		
	}
	
	@Test
	public void teste4() {
		Vendedor usuario1 = new Vendedor("Ricardo");
		Produto produto = new Produto("bola", 39.9);
		Video video = new Video(1, usuario1, produto);
		Usuario usuario = new Usuario("Hashi");
		video.adicionaAvaliacao(usuario, 5);
		video.adicionaAvaliacao(usuario, 4);
		video.adicionaAvaliacao(usuario, 3);
		assertEquals(4,usuario.totalAvaliacoes());
	}
	
	

}
