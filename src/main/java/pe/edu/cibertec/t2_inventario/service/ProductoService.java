package pe.edu.cibertec.t2_inventario.service;
import pe.edu.cibertec.t2_inventario.model.entity.Producto;

import java.util.List;
public interface ProductoService {
    List<Producto> listarProductos();
    Producto obtenerProductoPorId(Long id);
    Producto registrarProducto(Producto producto);
    void eliminarProducto(Long id);
}
