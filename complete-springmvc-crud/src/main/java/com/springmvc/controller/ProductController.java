package com.springmvc.controller;

import com.springmvc.dao.ProductDAO;
import com.springmvc.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductDAO productDAO;

    @RequestMapping("/addProduct")
    public String addProduct() {
        return "addProduct";
    }

    @RequestMapping("/listAllProduct")
    public String listAllProduct(Model m) {
        List<Product> prodList = productDAO.getAllProducts();
        m.addAttribute("prodList", prodList);
        return "listAllProducts";
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/addProductHandler", method = RequestMethod.POST)
    public RedirectView addProductHandler(@ModelAttribute Product product, HttpServletRequest httpServletRequest) {
        productDAO.addProduct(product);
        String url = httpServletRequest.getContextPath();
        RedirectView view = new RedirectView(url);
        return view;
    }

    @RequestMapping(value = "/deleteProductHandler/{productId}")
    public RedirectView deleteProduct(
            @PathVariable("productId") long id,
            HttpServletRequest httpServletRequest) {
        productDAO.deleteProduct((long) id);
        String url = httpServletRequest.getContextPath();
        RedirectView view = new RedirectView(url);
        return view;
    }


    @RequestMapping(value = "/updateProduct/{productId}")
    public String updateProduct(
            @PathVariable("productId") int id, Model model) {
        Product p = productDAO.getProduct(id);
        model.addAttribute("product", p);
        return "updateForm";
    }


    @RequestMapping(value = "/updateProductHandler", method = RequestMethod.POST)
    public RedirectView updateProductHandler(@ModelAttribute Product product, HttpServletRequest httpServletRequest) {
        productDAO.updateProduct(product);
        System.out.println(product);
        String url = httpServletRequest.getContextPath()+"listAllProducts";
        RedirectView view = new RedirectView(url);
        return view;
    }
}
