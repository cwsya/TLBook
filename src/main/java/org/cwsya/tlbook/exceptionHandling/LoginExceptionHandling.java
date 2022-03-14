package org.cwsya.tlbook.exceptionHandling;

import org.cwsya.tlbook.domain.Result;
import org.cwsya.tlbook.domain.config.ResultCodeEnum;
import org.cwsya.tlbook.exception.NotLogInException;
import org.cwsya.tlbook.exception.UserErrorException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cws
 */

@ControllerAdvice
@ResponseBody
public class LoginExceptionHandling {

    @ExceptionHandler(UserErrorException.class)
    public Result<?> userErrorException(){
        ResultCodeEnum codeEnum = ResultCodeEnum.USER_ERROR;
        return new Result<>(codeEnum.getResultCode(), codeEnum.getMessage(),false);
    }

    @ExceptionHandler(NotLogInException.class)
    public Result<?> notLogInException(){
        ResultCodeEnum codeEnum = ResultCodeEnum.NOT_LOG_IN_EXCEPTION;
        return new Result<>(codeEnum.getResultCode(),codeEnum.getMessage(),false);
    }
}
