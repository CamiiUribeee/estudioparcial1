
package values;

public class Dimension {
    double alto;
    double ancho;
    double profundo; 
    
    public Dimension(){
        this.alto=0;
        this.ancho=0;
        this.profundo=0; 

    }
    public Dimension(double alto, double ancho, double profundo){
        this.alto=alto;
        this.ancho=ancho;
        this.profundo=profundo; 
    
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getProfundo() {
        return profundo;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setProfundo(double profundo) {
        this.profundo = profundo;
    }
    
    public double getVolumen(){
        double volumen = (alto*ancho*profundo);
        return volumen; 
    }

    @Override
    public String toString() {
        return "Dimension{" + "alto=" + alto + ", ancho=" + ancho + ", profundo=" + profundo + ", volumen=" + getVolumen() + '}';
    }
    
    
    
    
    
    
}
