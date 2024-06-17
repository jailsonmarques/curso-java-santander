public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);

        System.out.println("Qual o canal atual? " + smartTv.canal);

        System.out.println("Qual o volume atual? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("A TV está ligada? " + smartTv.ligada);
    }
}
