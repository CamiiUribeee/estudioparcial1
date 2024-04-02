
package coleccion;

import java.util.ArrayList;
import superheroe.Figura;


public class Coleccion {
    String nombreColeccion; 
    ArrayList<Figura> listafiguras; 
    
    public Coleccion(String nombreColeccion){
        this.nombreColeccion=nombreColeccion;
        this.listafiguras=new ArrayList<Figura>();  
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public ArrayList getListafiguras() {
        return listafiguras;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public void setListafiguras(ArrayList listafiguras) {
        this.listafiguras = listafiguras;
    }
    
    public String añadirFigura(Figura fig){
        listafiguras.add(fig);
        return fig.toString(); 
    }
    
    public void subirPrecio(double cantidad, String id){
        for (Figura figura1 : this.listafiguras){
            if (figura1.getId().equals(id)){
                figura1.subirPrecio(cantidad);
            }
        }
        
    }

    @Override
    public String toString() {
        String cadena2=""; 
        for (Figura figura2 : this.listafiguras){
            cadena2=cadena2 + "/" + figura2.toString();
        }
        return "Coleccion{" + cadena2 + '}';
    }
    
    public String conCapa(){
        String cadenaColeccion="Coleccion de juguetes con capa: "; 
        for (Figura figura3 : this.listafiguras){
            if(figura3.getSuperheroe().isCapa() == true){
                cadenaColeccion=cadenaColeccion+figura3.toString(); 
            }
            
        }
        return cadenaColeccion; 
    }
    
    public Figura masValioso(){
        Figura figura=this.listafiguras.get(0); 
        for (Figura figura4 : this.listafiguras){
            if (figura.getPrice() < figura4.getPrice()){
                figura=figura4; 
            }
        }
        return figura; 
    }
    
    public double getValorColeccion(){
        double precioTotal=0; 
        for (Figura figura5: this.listafiguras){
            precioTotal=precioTotal+figura5.getPrice();  
        }
        return precioTotal; 
    }
    
    public double getVolumenColeccion(){
        double VolAprox=0;
        for (Figura figura6 : this.listafiguras){
            VolAprox=VolAprox+figura6.getDimensiones().getVolumen(); 
        }
        return VolAprox; 
        
    }
    
}
