package model;

import java.util.List;

public class Spotify implements Player{
    @Override
    public void tocarMusica(Musica musica) {
        System.out.println("Reproduzindo " + musica.getTitulo());
    }

    @Override
    public void exibirTodasMusicas(List<Musica> todasMusicas) {
        for(Musica musicaAtual : todasMusicas){ //for-each
            System.out.println(musicaAtual.toString());
        }
    }

    @Override
    public void exibirHistorico(List<Musica> historico) {
        for(Musica musicaAtual : historico){
            System.out.println(musicaAtual.getTitulo());
        }
    }

    @Override
    public void atualizarHistorico(List<Musica> historico, Musica musicaTocada) {
        historico.add(0,musicaTocada);

    }

    @Override
    public Musica pesquisarMusica(List<Musica> todasMusicas, int codigo) {
        for (Musica musicaAtual : todasMusicas){
            if(musicaAtual.getCodigo() == codigo){
                return musicaAtual;
            }
        }
        return null;
    }
}
