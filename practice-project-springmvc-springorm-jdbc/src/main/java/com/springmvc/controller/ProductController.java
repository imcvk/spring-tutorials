package com.springmvc.controller;

import com.springmvc.dao.ProductDAO;
import com.springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.logging.Logger;

@Controller
public class ProductController {
    static Logger log = Logger.getLogger(ProductController.class.getName());

    @Autowired
    ProductDAO productDAO;

    @RequestMapping("/addProductForm")
    public String addProduct() {
        log.info("redirecting to add product form");
        return "addProductForm";
    }

    @RequestMapping("/addProductHandler")
    public String addProductHandler(@ModelAttribute("product") Product product) {
        log.info("product handler to add product in database");
        productDAO.addProduct(product);
        return "success";
    }

    @RequestMapping("/deleteProduct")
    public String deleteProduct() {
        return "deleteProductForm";
    }

    @RequestMapping("/deleteProductForm")
    public String deleteProductForm(@RequestParam("productId") long id) {
        productDAO.deleteProduct(id);
        return "deleteSuccess";
    }

    @RequestMapping("displayAllProducts")
    public String displayAllProducts(Model model) {
        List<Product> prodList = productDAO.getAllProducts();
        model.addAttribute("prodList",prodList);
        return "displayAllProducts";
    }

}
