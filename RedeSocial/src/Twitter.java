public class Twitter extends RedeSocial implements Compartilhamento{
    public Twitter(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou uma publicação no Twitter");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeo no Twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentário Twitter");

    }
    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.print(" no Twitter");
    }
}
