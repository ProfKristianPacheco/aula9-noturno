package model;

import java.util.List;

public interface Player {
    public void tocarMusica(Musica musica);
    public void exibirTodasMusicas(List<Musica> todasMusicas);
    public void exibirHistorico(List<Musica> historico);
    public void atualizarHistorico(List<Musica> historico, Musica musicaTocada);
    public Musica pesquisarMusica(List<Musica> todasMusicas, int codigo);
}
