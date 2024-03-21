
public class Carta {
    
    private int numero;
    private String palo;
    
    public static final String[] PALOS={"Espada", "Basto", "Oro", "Copa"};
    public static final int LIMITE_NRO_CARTA=12;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
}
