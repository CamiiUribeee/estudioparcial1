
package superheroe;

import values.Dimension;

public class Figura {
    String id;
    double price;
    Dimension dimensiones;
    SuperHeroe superheroe; 
    
    
    public Figura(String id, double price, Dimension dimensiones, SuperHeroe superheroe){
        this.id=id;
        this.price=price;
        this.dimensiones=dimensiones;
        this.superheroe=superheroe; 
    }

    public String getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public SuperHeroe getSuperheroe() {
        return superheroe;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setSuperheroe(SuperHeroe superheroe) {
        this.superheroe = superheroe;
    }

    @Override
    public String toString() {
        return "Figura{" + "id=" + id + ", price=" + price + ", dimensiones=" + dimensiones + ", superheroe=" + superheroe + '}';
    }
    public double subirPrecio(double cantidad){
        this.price=this.price+cantidad;
        return price; 
    }
}
