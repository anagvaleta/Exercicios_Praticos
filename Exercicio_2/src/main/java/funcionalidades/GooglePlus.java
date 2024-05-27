package funcionalidades;

import excecoes.RedeSocialCheckedException;

public class GooglePlus extends RedeSocial implements Compartilhamento, VideoConferencia{


    public GooglePlus(String senha, int numAmigos) throws RedeSocialCheckedException {

        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou um post no Gplus.");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no GPlus.");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Gplus.");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Gplus.");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu um post no Gplus.");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Realizou uma Stream");
    }
}
