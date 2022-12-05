package com.uninter;

public class Tabuleiro { //classe tabuleiro
	private int[][] tabuleiro= new int[3][3];
		
	public Tabuleiro(){
		
	}
	public void exibeTabuleiro(){ //exibe o tabuleiro 
		System.out.println();
		for(int linha=0 ; linha<3 ; linha++){ //linhas
			 for(int coluna=0 ; coluna<3 ; coluna++){ //colunas
				if(tabuleiro[linha][coluna]== - 1){
					 System.out.print(" X ");
				 }
				 if(tabuleiro[linha][coluna]==1){
					 System.out.print(" O ");
				 }
				 if(tabuleiro[linha][coluna]==0){
					 System.out.print("-");
				 }
			 }
			 System.out.println();
		}
	}
	 public int getPosicao(int[] tentativa){  //pega as posiçoes
		return tabuleiro[tentativa[ 0]][tentativa[1]]; 
	 }
	 public void setPosicao(int[] tentativa, int jogador){ //define as posições
		if(jogador == 1)
			 tabuleiro[tentativa[0]][tentativa[1]] =  -1;
		 else
			 tabuleiro[tentativa[0]][tentativa[1]] = 1;
		 
		 exibeTabuleiro();
	 }
	 public int Linhas(){ //checa as linhas
		 for(int linha=0 ; linha<3 ; linha++){
			 
			if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == -3)
				 return-1;
			 if( (tabuleiro[linha][0] + tabuleiro[linha][1] + tabuleiro[linha][2]) == 3)
				 return 1;
		 }
		 return 0;
	 }
	 public int Colunas(){ // checa as colunas
		 for(int coluna=0 ; coluna<3 ; coluna++){
			if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == -3)
				  return -1;
			  if( (tabuleiro[0][coluna] + tabuleiro[1][coluna] + tabuleiro[2][coluna]) == 3)
				  return 1;
		 }
		 return 0;
	 }
	 public int Diagonais(){ //checa as diagonais
		if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == -3)
			 return -1;
		 if( (tabuleiro[0][0] + tabuleiro[1][1] + tabuleiro[2][2]) == 3)
			 return 1;
		 if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == -3)
			 return -1;
		 if( (tabuleiro[0][2] + tabuleiro[1][1] + tabuleiro[2][0]) == 3)
			 return 1;
		 
		 	return 0;
	 } 
	public boolean tabuleiroCompleto(){ //tabuleiro completo 
		for(int linha=0 ; linha<3 ; linha++)
			 for(int coluna=0 ; coluna<3 ; coluna++)
				 if( tabuleiro[linha][coluna]==0 )
					 return false;
		 return true;
		 
	}
	
	 }
		
		
