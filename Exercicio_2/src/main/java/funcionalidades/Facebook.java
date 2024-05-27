package funcionalidades;

import excecoes.RedeSocialCheckedException;

public class Facebook extends RedeSocial implements Compartilhamento, VideoConferencia{

    public Facebook(String senha, int numAmigos) throws RedeSocialCheckedException {
        super(senha, numAmigos);
    }

    public Facebook() {
        super();
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Facebook.");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook.");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Facebook.");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Facebook.");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu um post no Facebook.");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Fez uma live no Facebook.");
    }
}
