
public class Main {
   
    public static void main(String[] args){
    
        Baraja b = new Baraja();
        
        System.out.println("Hay "+b.cartasDisponibles()+" cartas disponibles");
        
        b.siguienteCarta();
        
        b.darCartas(5);

        System.out.println("Hay "+b.cartasDisponibles()+" cartas disponibles");

        System.out.println("Cartas sacadas de momento");

        b.cartasMonton();


        b.barajar();

        Carta[] c = b.darCartas(5);

        System.out.println("Cartas sacadas despues de barajar ");
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
        
    }
}
