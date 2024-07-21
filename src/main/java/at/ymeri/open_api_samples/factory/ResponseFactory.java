package at.ymeri.open_api_samples.factory;

import at.ymeri.open_api_samples.dto.ResponseCommon;
import at.ymeri.open_api_samples.dto.ResponseInterface;
import lombok.experimental.UtilityClass;
import org.springframework.http.ResponseEntity;

@UtilityClass
public class ResponseFactory {

    public static <R, T extends ResponseInterface<R, ResponseCommon>> ResponseEntity<T> createResponse(
            String message,
            R response,
            T responseObject) {

        ResponseCommon responseCommon = new ResponseCommon();
        responseCommon.setMessage(message);

        responseObject.setResponse(response);
        responseObject.setResponseCommon(responseCommon);

        return ResponseEntity.ok(responseObject);

    }
}
