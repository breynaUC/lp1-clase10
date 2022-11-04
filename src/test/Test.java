
package test;

import com.google.gson.Gson;
import dao.ProductoDao;
import entity.Producto;

/**
 *
 * @author admin
 */
public class Test {
    static ProductoDao dao = new ProductoDao();
    static Gson gson = new Gson();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        agregar();
        listar();
    }
    static void agregar(){
        Producto p1 = new Producto("Laptop", 1200, 3);
        Producto p2 = new Producto("Parlantes", 300, 10);
        Producto p3 = new Producto("Teclado", 120,20);
        dao.add(p1);
        dao.add(p2);
        dao.add(p3);
    }
    static void listar(){
        System.out.println(gson.toJson(dao.getLista()));
    }
    static void buscar(){}
}
