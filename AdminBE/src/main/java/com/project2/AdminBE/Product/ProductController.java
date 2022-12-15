package com.project2.AdminBE.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/sp1/product")
public class ProductController {
    @Autowired
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Product>> listProduct(){
        List<Product> list = productService.getProduct();

        return new ResponseEntity<>(list, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        Product newProduct =productService.addProduct(product);
        return new ResponseEntity<>(newProduct, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseObject> updProduct(@RequestBody Product product){
        if(product.getId() == null){
            ResponseObject responseObject = new ResponseObject( false, product);
            return new ResponseEntity<>(responseObject, HttpStatus.CONFLICT);
        }else{
            Product newProduct =productService.updProduct(product);
            ResponseObject responseObject = new ResponseObject( true, newProduct);
            return new ResponseEntity<>(responseObject, HttpStatus.OK);
        }
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseObject> deleteProduct(@PathVariable Long id){
        boolean test =productService.deleteProduct(id);
        ResponseObject responseObject = new ResponseObject( test, null);
        return new ResponseEntity<>(responseObject, HttpStatus.OK);
    }
}
