package at.ymeri.open_api_samples.controller;

import at.ymeri.open_api_samples.dto.*;
import at.ymeri.open_api_samples.factory.ResponseFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController implements ProductControllerApi {

    @Override
    public ResponseEntity<ProductCreateResponse> createProduct(ProductCreateRequest productCreateRequest) {

        Product product = new Product();
        product.setId("id");
        product.setName("name");
        product.setProductDescription(List.of("description"));

        return ResponseFactory.createResponse("message", product, new ProductCreateResponse());
    }


    @Override
    public ResponseEntity<ProductGetResponse> getProduct(String productId) {
        Product product = new Product();
        return ResponseFactory.createResponse("message", product, new ProductGetResponse());
    }
}
