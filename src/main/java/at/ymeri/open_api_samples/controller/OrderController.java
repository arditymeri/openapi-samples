package at.ymeri.open_api_samples.controller;

import at.ymeri.open_api_samples.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController implements OrderControllerApi {

    @Override
    public ResponseEntity<OrderCreateResponse> createOrder(OrderCreateRequest orderCreateRequest) {

        Order order = new Order();
        order.setOrderName("name");
        order.setId("id");

        OrderCreateResponseResponseCommon common = new OrderCreateResponseResponseCommon();
        common.setMessage("success");

        OrderCreateResponse body = new OrderCreateResponse();
        body.setResponse(order);
        body.setResponseCommon(common);

        return ResponseEntity.ok().body(body);
    }


    @Override
    public ResponseEntity<OrderGetResponse> getOrder(String orderId) {
        return OrderControllerApi.super.getOrder(orderId);
    }
}
