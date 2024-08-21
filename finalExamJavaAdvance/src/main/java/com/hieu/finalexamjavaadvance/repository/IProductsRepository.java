package com.hieu.finalexamjavaadvance.repository;

import com.hieu.finalexamjavaadvance.entity.Catalogs;
import com.hieu.finalexamjavaadvance.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductsRepository extends JpaRepository<Products, Long> {
    List<Products> findByCatalog(Catalogs catalog);
}
