package pe.edu.cibertec.t2_inventario.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t2_inventario.model.entity.Producto;
import pe.edu.cibertec.t2_inventario.repository.ProductoRepository;
import pe.edu.cibertec.t2_inventario.service.ProductoService;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public Producto registrarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}
