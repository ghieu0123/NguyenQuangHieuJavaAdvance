package com.hieu.finalexamjavaadvance.service;

import com.hieu.finalexamjavaadvance.entity.Products;
import com.hieu.finalexamjavaadvance.repository.ICatalogsRepository;
import com.hieu.finalexamjavaadvance.repository.IProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductsRepository productsRepository;

    @Autowired
    private ICatalogsRepository catalogsRepository;

    @Override
    public List<Products> findAll() {
        return productsRepository.findAll();
    }

    @Override
    public List<Products> getListProductByCatalogsId(long catalogId) {
        List<Products> lstPrt = productsRepository.findByCatalog(catalogsRepository.findById(catalogId).get());
        return lstPrt;
    }

    @Override
    public Products getProductById(long id) {
        Products prt = productsRepository.findById(id).get();
        return prt;
    }

}
