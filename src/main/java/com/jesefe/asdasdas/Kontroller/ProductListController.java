package com.jesefe.asdasdas.Kontroller;

import com.jesefe.asdasdas.Repository.ProductRepository;
import com.jesefe.asdasdas.model.Product;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.annotation.RequestAction;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.ocpsoft.rewrite.faces.annotation.Deferred;
import org.ocpsoft.rewrite.faces.annotation.IgnorePostback;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Scope (value = "session")
@Component (value = "productList")
@ELBeanName(value = "productList")
@Join(path = "/", to = "/product-list.xhtml")



public class ProductListController {
    private ProductRepository productRepository;

    public ProductListController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    private List<Product> products;

    @Deferred
    @RequestAction
    @IgnorePostback
    public void loadData() {
        products = productRepository.findAll();
    }

    public List<Product> getProducts() {
        return products;
    }
}

