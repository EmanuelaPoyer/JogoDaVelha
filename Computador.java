package com.uninter;

import java.util.Random;

public class Computador extends Jogador{
	
	 public Computador(int jogador){ //definir jogador ou computador  
		 super(jogador);
		 System.out.println("Jogador Computador criado!");
	 }
	 
	 @Override    
	 public void jogar(Tabuleiro tabuleiro){
		 Tentativa(tabuleiro);
		 tabuleiro.setPosicao(tentativa, jogador);
	 }
	 @Override
	 public void Tentativa(Tabuleiro tabuleiro){ //computador joga
		 Random gerador = new Random();
		 do{   
			 do{      
				 tentativa[0] = gerador.nextInt(2) + 1; 
			 }while( tentativa[0] > 3 ||tentativa[0] < 1); 
			 
			 do{
				 tentativa[1] =  gerador.nextInt(2) + 1; 

			 }while(tentativa[1] > 3 ||tentativa[1] < 1);
			 
			 tentativa[0]--;
			 tentativa[1]--;
			 
			 
			 }while( !checaTentativa(tentativa, tabuleiro));  
	 }

}
