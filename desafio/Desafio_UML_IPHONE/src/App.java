import product.IPhone;

public class App {
    public static void main(String[] args) throws Exception {
       IPhone iPhone = new IPhone();
       iPhone.setHeight(800);
       iPhone.setWidth(400);
       iPhone.setIme("123456789");
       iPhone.on();

       iPhone.adicionarNovaAba();
       iPhone.exibirPagina("http://globo.com");
       iPhone.atualizarPagina("http://globo.com");

       iPhone.selecionarMusica("device://number.mp4");
       iPhone.tocar();
       iPhone.pausar();

       iPhone.iniciarCorrerioVoz();
       iPhone.ligar("(98) 98761-98761");
       iPhone.desligar();
       iPhone.atender();
       iPhone.desligar();

       iPhone.off();
    }
}
