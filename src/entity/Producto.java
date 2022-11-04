
package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author admin
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
}
