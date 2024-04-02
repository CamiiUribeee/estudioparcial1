
package superheroe;


public class SuperHeroe {
    String name;
    String description;
    boolean capa; 
    
    public SuperHeroe(String name){
        this.name=name;
        this.description="";
        this.capa=false; 
    }
    
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "SuperHeroe{" + "name=" + name + ", description=" + description + ", capa=" + capa + '}';
    }
    
    
}
