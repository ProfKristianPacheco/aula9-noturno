import model.Musica;
import model.Player;
import model.Spotify;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //STREAMING DE MÚSICAS
        System.out.println("Streaming de músicas");
        List<Musica> musicas = new ArrayList<>(); //melhor para adicionar elementos no fim da lista
        List<Musica> historico = new LinkedList<>(); //melhor para adicionar elementos no ínicio ou no meio da lista
        cadastrarMusicas(musicas);
        Scanner scanner = new Scanner(System.in);
        Player player = new Spotify();
        boolean continua;
        do {
            System.out.println("Menu:\n1-Tocar Música\n2-Exibir Histórico\n3-Encerrar");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    //exibir todas as músicas
                    player.exibirTodasMusicas(musicas);
                    System.out.println("Informe a música que deseja tocar!");
                    int codigo = scanner.nextInt();
                    Musica musica = player.pesquisarMusica(musicas, codigo);
                    if(musica == null){
                        System.out.println("Música não encontrada!");
                    }else{
                        player.tocarMusica(musica);//tocar música
                        player.atualizarHistorico(historico, musica); //atualizar histórico
                    }
                    continua = true;
                    break;
                case 2:
                    //exibir histórico
                    player.exibirHistorico(historico);
                    continua = true;
                    break;
                case 3:
                    System.out.println("Encerrando!");
                    continua = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continua = true;
                    break;
            }
        }while (continua);
    }
    public static void cadastrarMusicas(List<Musica> musicas){
        Musica musica1 = new Musica(1, "Caneta Azul", "Brega", 2, 2020, "Manoel Gomes");
        Musica musica2 = new Musica(2, "Let it Go", "Animação", 4, 2015, "Elza");
        Musica musica3 = new Musica(3, "Numb", "Rock", 4, 2003, "Linkin Park");

        musicas.add(musica1);
        musicas.add(musica2);
        musicas.add(musica3);
    }

}