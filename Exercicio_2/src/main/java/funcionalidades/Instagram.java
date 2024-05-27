package funcionalidades;

import excecoes.RedeSocialCheckedException;

public class Instagram extends RedeSocial{


    public Instagram(String senha, int numAmigos) throws RedeSocialCheckedException {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Insta.");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Insta.");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário no Insta.");
    }

    @Override
    public void curtirPublicacao() {
        System.out.println("Curtiu uma publicação no Insta.");
    }
}
