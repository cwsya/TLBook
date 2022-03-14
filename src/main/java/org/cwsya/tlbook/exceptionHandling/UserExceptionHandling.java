package org.cwsya.tlbook.exceptionHandling;

import org.cwsya.tlbook.domain.Result;
import org.cwsya.tlbook.domain.config.ResultCodeEnum;
import org.cwsya.tlbook.exception.userErrorException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cws
 */

@ControllerAdvice
@ResponseBody
public class UserExceptionHandling {

    @ExceptionHandler(userErrorException.class)
    public Result<String> userErrorException(){
        ResultCodeEnum codeEnum = ResultCodeEnum.USER_ERROR;
        return new Result<>(codeEnum.getResultCode(), codeEnum.getMessage(),codeEnum.getMessage());
    }
}
