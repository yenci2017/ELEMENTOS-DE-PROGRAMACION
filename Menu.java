

public class Menu
{
   private String nombre;
   private int precio;
   private String descripcion;
   private boolean especial;
   
   public Menu (String nombrePlatillo, int precio, String descripcion){
       nombre = nombrePlatillo;
       this.precio = precio;
       this.descripcion = descripcion;
       especial = false;
   }
    
   public String getNombre(){
       return nombre;
   }
   public int getPrecio(){
       return precio;
    }
   
    public void setPrecio(int nuevoPrecio){
        precio = nuevoPrecio;
}
 public boolean Esespecial(){
    
     if (precio>=20){
         especial= true;
         
     
    }
    return especial;
}
}
