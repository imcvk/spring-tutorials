package com.springmvc.dao;

import com.springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;

@Component
public class ProductDAO {
    static Logger log = Logger.getLogger(ProductDAO.class.getName());
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Transactional
    public void addProduct(Product p) {
        log.info("adding product");
        try {
            this.hibernateTemplate.saveOrUpdate(p);
            log.info("product added");
        } catch (Exception e) {
            log.info("product not added");
            e.printStackTrace();
        }
    }

    @Transactional
    public void deleteProduct(long id) {
        Product p = this.hibernateTemplate.get(Product.class, id);
        try {
            this.hibernateTemplate.delete(p);
            log.info("product deleted.");
        } catch (Exception e) {
            log.info("product not deleted.");
            e.printStackTrace();
        }
    }


    public List<Product> getAllProducts() {
        List<Product> prodList = null;
        try {
            log.info("fetching product list");
            prodList = this.hibernateTemplate.loadAll(Product.class);
            log.info("product list fetched");
        } catch (Exception e) {
            log.info("could not get product list");
            e.printStackTrace();
        }
        return prodList;
    }

    public Product getProduct(long id) {
        Product p = null;
        try {
            log.info("fetching intended product");
            p = this.hibernateTemplate.get(Product.class, id);
        } catch (Exception e) {
            log.info("could not get product");
            e.printStackTrace();
        }
        return p;
    }
    @Transactional
    public void updateProduct(Product product) {
        this.hibernateTemplate.update(product);
    }
}
