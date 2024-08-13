package iPhone.display;
import iPhone.Iphone;
import java.util.Scanner;

public class Display {
    public static void main(String[] args) throws Exception {
        Iphone equipamento = new Iphone();
        System.out.println("Opções:");
        System.out.println("1. Abrir Ipod");
        System.out.println("2. Abrir telefone");
        System.out.println("3. Abrir navegador");
        Scannernner terminal = new Scanner(System.in);
        int option = terminal.nextInt();
        switch (option) {
            case 1:
                equipamento.selecionarMusica();
                equipamento.tocar();
                equipamento.pausar();
                break;
            case 2:
                equipamento.atender();
                equipamento.ligar();
                equipamento.iniciarCorreioVoz();
                break;
            case 3:
                equipamento.exibirPagina();
                equipamento.atualizarPagina();
                equipamento.adicionarNovaAba();
                break;
            default:
                System.out.println("Ativando descanso de tela");
        }
        terminal.close();

    }
}