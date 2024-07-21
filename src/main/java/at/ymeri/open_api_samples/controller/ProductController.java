package at.ymeri.open_api_samples.controller;

import at.ymeri.open_api_samples.dto.*;
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

        ProductCreateResponseResponseCommon common = new ProductCreateResponseResponseCommon();
        common.setMessage("message");


        ProductCreateResponse response = new ProductCreateResponse();
        response.setResponse(product);
        response.setResponseCommon(common);
        return ResponseEntity.ok(response);
    }


    @Override
    public ResponseEntity<ProductGetResponse> getProduct(String productId) {
        return ProductControllerApi.super.getProduct(productId);
    }
}
