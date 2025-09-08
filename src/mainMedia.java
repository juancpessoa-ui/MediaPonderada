public class mainMedia {
    public static void main (String[]args){
        System.out.println(" Iniciando aplicação");

       MediaPonderada medianova = new MediaPonderada();
       medianova. obterDados();
       medianova.realizarCalculos();
       medianova.exibirResultado();
    }
}
