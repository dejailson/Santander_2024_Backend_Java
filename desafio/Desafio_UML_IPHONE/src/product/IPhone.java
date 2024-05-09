package product;

import feature.Browser;
import feature.MusicPlayer;
import feature.Phone;

public class IPhone implements Browser,MusicPlayer,Phone{

    private String ime;
    private Integer width;
    private Integer height;

    

    public IPhone() {}

    public IPhone(String ime, Integer width, Integer height) {
        this.ime = ime;
        this.width = width;
        this.height = height;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public void on(){
        System.out.println("Ligando o IPhone");
    }

    public void off(){
        System.out.println("Desligando o IPhone");
    }

    @Override
    public void adicionarNovaAba() {
      System.out.println("Adicionando uma nova página");  
    }

    @Override
    public void atualizarPagina(String url) {
        System.out.println("Atualizando a página " + url); 
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url); 

    }

    @Override
    public void pausar() {
        System.out.println("Pause foi executado");  
    }

    @Override
    public void selecionarMusica(String dirMusica) {
        System.out.println("Selecionando música do diretório " + dirMusica);  
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música selecionada"); 
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a chamada");  
    }

    public void desligar(){
        System.out.println("Desligando a chamada");  
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Reproduzido o correio de voz");  
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);   
    }
    
}
