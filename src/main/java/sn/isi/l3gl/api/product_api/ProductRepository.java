package sn.isi.l3gl.api.product_api;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.isi.l3gl.api.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}