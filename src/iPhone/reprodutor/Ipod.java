package iPhone.reprodutor;


public class Ipod implements ReprodutorMusical {

    @Override
    public void selecionarMusica() {
        System.out.println("Selcionando musica");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica");
    }
    
}