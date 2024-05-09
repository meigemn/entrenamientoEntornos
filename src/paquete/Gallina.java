package zoo;

/**
 *
 * @author carloscc
 */
public class Gallina extends Ave {
 
    private String cacareo = "GRRRRR";
    
    /**
     *
     */
    public Gallina () {}
    
    /**
     * clase publica gallina 
     * @param habitat parametro que almazcena donde vive el animal
     * @param comida parametro que almazcena lo que come el animaml
     * @param longevidad parametro que determina la edad máxima del animal
     * @param periodoIncubacion parametro que determina el periodo de incubacion del animal
     */
    public Gallina (Habitat habitat, String comida, int longevidad, int periodoIncubacion) {
        super(habitat, comida, longevidad, periodoIncubacion);
    }
    
    /**
     * Método setter  para fijar el valor de cacareo
     * @param cacareo String 
     */
    public void setCacareo (String cacareo) { this.cacareo = cacareo; }
    
    /**
     * Metodo getter que devuelve el valor del atributo cacareo
     * @return cacareo
     */
    public String getCacareo () { return cacareo; }
    
    /**
     *
     */
    public void rugir () { System.out.println(cacareo); }
    
    /**
     *
     */
    public void comer () { System.out.println("Estoy comiendo " + comida); }
    
    /**
     *
     */
    public void desplazar () { System.out.println("Estoy volando con mucha dificultad"); }
}
