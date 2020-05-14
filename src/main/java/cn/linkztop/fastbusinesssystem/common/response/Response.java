package cn.linkztop.fastbusinesssystem.common.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author nasico
 * @param <T> 返回类型
 */
@Data
public class Response<T> {
    private int code;
    private String message;
    private T data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Page page;

    public Response(T data) {
        this.data = data;
    }

    public Response(T data,ResponseEnum responseEnum) {
        this.data = data;
        this.code = responseEnum.getCode();
        this.message = responseEnum.getMessage();
    }


    public Response(T data, Page page) {
        this.data = data;
        this.page = page;
    }
}
