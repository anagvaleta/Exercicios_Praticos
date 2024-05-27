package funcionalidades;
import excecoes.RedeSocialCheckedException;
import excecoes.RedeSocialUncheckedException;

public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    public RedeSocial(String senha, int numAmigos) throws RedeSocialCheckedException {
        if (numAmigos < 0) {
            throw new RedeSocialUncheckedException("Número de amigos não pode ser negativo.");
        }
        if (senha == null || senha.isEmpty()) {
            throw new RedeSocialCheckedException("Senha não pode ser nula ou vazia.");
        }
        this.senha = senha;
        this.numAmigos = numAmigos;
    }

    public RedeSocial() {
    }

    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();

    public void curtirPublicacao(){
        System.out.println("Curtiu uma publicação.");
    }
}
