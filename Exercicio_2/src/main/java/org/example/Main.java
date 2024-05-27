package org.example;
import excecoes.RedeSocialCheckedException;
import excecoes.RedeSocialUncheckedException;
import funcionalidades.Facebook;
import funcionalidades.RedeSocial;
import funcionalidades.Twitter;
import funcionalidades.Usuario;

public class Main {
    public static void main(String[] args) throws RedeSocialCheckedException {

        RedeSocial[] redeSociais = new RedeSocial[3];

        try {
            Facebook facebook = new Facebook("123456", 154);
            Twitter twitter = new Twitter("23456", 88);
            redeSociais[0] = twitter;
            redeSociais[1] = facebook;
        } catch (RedeSocialUncheckedException e){
            System.out.println(e.getMessage());
        }

        Usuario usuario = new Usuario("Nana", "ana.valeta@ges.inatel.br", redeSociais);
        System.out.println("Infos:");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        usuario.usarRedesSociais();
        usuario.streamaFacebook();
        usuario.compartilhaFacebook();
    }
}