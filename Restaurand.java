
import java.util.ArrayList;
public class Restaurand{
    private ArrayList<Menu> platillos; 
    public Restaurand (){
    platillos = new ArrayList<Menu>();
    }
    
    public void añadirPlatillos( Menu nuevoPlatillo){
        platillos.add(nuevoPlatillo);
    }  
    
}