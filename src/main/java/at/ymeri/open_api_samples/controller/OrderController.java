package at.ymeri.open_api_samples.controller;

import at.ymeri.open_api_samples.dto.*;
import at.ymeri.open_api_samples.factory.ResponseFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements OrderControllerApi {

    @Override
    public ResponseEntity<OrderCreateResponse> createOrder(OrderCreateRequest orderCreateRequest) {

        Order order = new Order();
        order.setOrderName("name");
        order.setId("id");

        return ResponseFactory.createResponse("message", order, new OrderCreateResponse());
    }


    @Override
    public ResponseEntity<OrderGetResponse> getOrder(String orderId) {
        Order order = new Order();
        order.setId(orderId);
        order.setName("name");
        return ResponseFactory.createResponse("message", order, new OrderGetResponse());
    }
}
