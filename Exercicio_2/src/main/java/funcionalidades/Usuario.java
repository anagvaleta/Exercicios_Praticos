package funcionalidades;
import excecoes.RedeSocialCheckedException;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class Usuario {
    private String nome;
    private String email;
    Set<RedeSocial> redeSociais = new HashSet<>();

    public Usuario(String nome, String email, RedeSocial[] redesSociais) throws RedeSocialCheckedException{
        if(nome == null || email == null){
            throw new RedeSocialCheckedException("Os campos não podem ser nulos");
        } else{
            this.nome = nome;
            this.email = email;

            for(int i = 0; i < redesSociais.length; i++){
                if(redesSociais[i] != null){
                    redeSociais.add(redesSociais[i]);
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void streamaFacebook() throws RedeSocialCheckedException {
        Facebook facebook = new Facebook();
        facebook.fazStreaming();
    }
    public void compartilhaFacebook() throws RedeSocialCheckedException {
        Facebook facebook = new Facebook();
        facebook.compartilhar();
    }

    public void usarRedesSociais(){
        int count = 0;
        for(RedeSocial redeSocial : redeSociais){
            if(count == 0){
                redeSocial.postarFoto();
                redeSocial.curtirPublicacao();
                redeSocial.postarComentario();
                count++;
            }
            else{
                redeSocial.postarVideo();
            }

}
    }
}