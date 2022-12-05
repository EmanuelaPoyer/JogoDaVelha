package com.uninter;

import java.util.Scanner;

public class Jogo {
    private Tabuleiro tab;
    private int rodada=1, vez=1;
    private Jogador play1;
    private Jogador play2;
    public Scanner entrada = new Scanner(System.in);

    
    public Jogo(){ //inicia o jogo
        tab = new Tabuleiro();
        iniciarJogadores();
        
        while( Jogar() );
    }
    
    public void iniciarJogadores(){ //mensagem para escolher o jogador
        System.out.println("Quem vai ser o Jogador 1?");
        if(escolherJogador() == 1)
            this.play1 = new Humano(1);
        else
            this.play1 = new Computador(1);
        
        System.out.println("----------------------"); 
        System.out.println("Quem vai ser o Jogador 2 ?");
        
        if(escolherJogador() == 1)
            this.play2 = new Humano(2);
        else
            this.play2 = new Computador(2);
        
    }
    
    public int escolherJogador(){ //escolher qual jogador
        int opcao=0;
        
        do{
            System.out.println("1. Humano");
            System.out.println("2. Computador\n");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            
            if(opcao != 1 && opcao != 2)
                System.out.println("Opção inválida! Tente novamente");
        }while(opcao != 1 && opcao != 2);
        
        return opcao;
    }
    
    public boolean Jogar(){
        if(ganhou() == 0 ){
            System.out.println("----------------------");
            System.out.println("\nRodada "+rodada);
            System.out.println("É a vez do jogador " + vez() );
            
            if(vez()==1)
                play1.jogar(tab);
            else
                play2.jogar(tab);
            
            
            if(tab.tabuleiroCompleto()){ //mensagem se o tabuleiro estiver completo
                System.out.println("Tabuleiro Completo. Jogo empatado");
                return false;
            }
            vez++;
            rodada++;

            return true;
        } else{
            if(ganhou() == -1 ) //mensagem quem ganhou
                System.out.println("Jogador 1 ganhou!");
            else
                System.out.println("Jogador 2 ganhou!");
            
            return false;
        }
            
    }
    
    public int vez(){ // evita o jogo ficar em loop separando a vez de cada um
        if(vez%2 == 1)
            return 1;
        else
            return 2;
    }
    
    public int ganhou(){ //chega quem ganhou 
        if(tab.Linhas() == 1)
            return 1;
        if(tab.Colunas() == 1)
            return 1;
        if(tab.Diagonais() == 1)
            return 1;
        
        if(tab.Linhas() == -1)
            return -1;
        if(tab.Colunas() == -1)
            return -1;
        if(tab.Diagonais() == -1)
            return -1;
        
        return 0;
    }
    
    
}
