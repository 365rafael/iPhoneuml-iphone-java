package iPhone.navegador;

public class Safari implements Navegador {

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }
    
}