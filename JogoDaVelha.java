package com.uninter;

public class JogoDaVelha { 
	private static Jogo jogo1;
	
	public static void main(final String[] args) { //inicia o jogo 
		
		setJogo1(new Jogo());
	}
	
	public static Jogo getJogo1() { 
		return jogo1;
	}
	public static void setJogo1(Jogo jogo1) {
		JogoDaVelha.jogo1 = jogo1;
	}
	
}
