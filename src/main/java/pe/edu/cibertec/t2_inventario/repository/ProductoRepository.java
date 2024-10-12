package pe.edu.cibertec.t2_inventario.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.t2_inventario.model.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
