package org.cwsya.tlbook.exceptionHandling;

import org.cwsya.tlbook.domain.Result;
import org.cwsya.tlbook.domain.config.ResultCodeEnum;
import org.cwsya.tlbook.exception.RequestParametersException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cws
 */
@ControllerAdvice
@ResponseBody
public class RequestExceptionHandling {
    @ExceptionHandler(RequestParametersException.class)
    public Result<?> requestParametersException(){
        ResultCodeEnum codeEnum = ResultCodeEnum.REQUEST_EXCEPTION;
        return new Result<>(codeEnum.getResultCode(),codeEnum.getMessage(),false);
    }
}
