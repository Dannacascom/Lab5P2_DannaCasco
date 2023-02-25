
public class Personajes {

    private String nombre, poder, universo;
    private int debilidad, fuerza, agilidadF, agilidadM, vida;

    public Personajes(String nombre, String poder, String universo, int debilidad, int fuerza, int agilidadF, int agilidadM, int vida) {
        this.nombre = nombre;
        this.poder = poder;
        this.universo = universo;
        this.debilidad = debilidad;
        this.fuerza = fuerza;
        this.agilidadF = agilidadF;
        this.agilidadM = agilidadM;
        this.vida = vida;
    }

    public Personajes(String nombre) {
        this.nombre = nombre;
    }

    public Personajes() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(int debilidad) {
        this.debilidad = debilidad;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadF() {
        return agilidadF;
    }

    public void setAgilidadF(int agilidadF) {
        this.agilidadF = agilidadF;
    }

    public int getAgilidadM() {
        return agilidadM;
    }

    public void setAgilidadM(int agilidadM) {
        this.agilidadM = agilidadM;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre + "\n"
                + "Poder: " + poder + "\n"
                + "Fuerza: " + fuerza + "\n"
                + "Agilidad Fisica: " + agilidadF + "\n"
                + "Agilidad mental: " + agilidadM + "\n"
                + "Vida: " + vida;

    }

}
