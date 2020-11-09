package com.muggle.exception;

/**
 * @program: poseidon-cloud-starter
 * @description: 通用业务异常
 * @author: muggle
 * @create: 2019-11-05
 **/

public class SimplePoseidonException extends BasePoseidonException {

    private Integer code;

    public SimplePoseidonException(String message, Integer code) {
        super(message);
        this.code = code;
    }

    public SimplePoseidonException(String message) {
        super(message);
        this.code = 5001;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
