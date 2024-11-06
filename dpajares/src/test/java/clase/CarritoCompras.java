package clase;

import java.util.List;

public class CarritoCompras {
	private List<Producto> productos;

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio() * (1 - producto.getDescuento());
        }
        return total;
    }
	
	

}
