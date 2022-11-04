/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Producto;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author admin
 */
public class ProductoDao {
    private List<Producto> lista;
    
    public ProductoDao(){
        lista = new ArrayList<>();
    }
    
    public void add(Producto prod){
        lista.add(prod);
    }

    public List<Producto> getLista() {
        return lista;
    }
    
    public void update(int index, Producto prod){
        lista.add(index, prod);
    }
    
    public void delete(int index){
        lista.remove(index);
    }
    
    public int search(String nombre){
        int index=-1;
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).getNombre().equals(nombre))
                index = i;
        }    
        return index;
    }
    
}
