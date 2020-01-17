package SistemaLivraria;

import SistemaLivraria.Autor;
import SistemaLivraria.Editora;
import SistemaLivraria.Livro;

import java.util.Scanner;

public class App{
    public static void main (String[] args){
        Autor pessoa = new Autor(
                "Rick",
                "Riordan",
                "Aventura",
                "Masculino",
                "Estados Unidos",
                "boston",
                34
        );
        Livro Rick = new Livro(
                "A Piramide Vermelha",
                445,
                "true",
                "Rick Riordan",
                "Amazon",
                0,
                2010
        );
        Editora Amazon = new Editora(
                "Intriseca",
                1994,
                765,
                "Brasil",
                "Sao paulo"
        );
        System.out.println(pessoa.retornarDadosAutor());
        System.out.println(Rick.retornarDadosLivro());
        System.out.println(Amazon.retornarDadosEditora());
    }
}