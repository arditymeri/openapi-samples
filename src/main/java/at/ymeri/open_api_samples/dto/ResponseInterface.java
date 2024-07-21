package at.ymeri.open_api_samples.dto;

public interface ResponseInterface<T, C> {

    void setResponse(T response);

    void setResponseCommon(C responseCommon);
}
