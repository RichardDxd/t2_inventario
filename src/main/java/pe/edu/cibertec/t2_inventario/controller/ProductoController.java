package pe.edu.cibertec.t2_inventario.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.t2_inventario.model.entity.Producto;
import pe.edu.cibertec.t2_inventario.service.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    @GetMapping("/detalle/{id}")
    public Producto obtenerProductoPorId(@PathVariable Long id) {
        return productoService.obtenerProductoPorId(id);
    }

    @PostMapping("/registrar")
    public Producto registrarProducto(@RequestBody Producto producto) {
        return productoService.registrarProducto(producto);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
    }
}
