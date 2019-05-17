
package com.itfdms.common.core.exception;

import com.itfdms.common.core.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

/**
　　* @description: 全局的的异常处理器
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:05
　　*/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {
	/**
	 * 全局异常.
	 *
	 * @param e the e
	 * @return Result
	 */
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	Result exception(Exception e) {
		log.error("全局异常信息 ex={}", e.getMessage(), e);
		return new Result<>(e);
	}

	/**
	 * validation Exception
	 *
	 * @param exception
	 * @return Result
	 */
	@ExceptionHandler({MethodArgumentNotValidException.class, BindException.class})
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public Result bodyValidExceptionHandler(MethodArgumentNotValidException exception) {
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		Result result = new Result();
		result.setMsg(fieldErrors.get(0).getDefaultMessage());
		log.warn(fieldErrors.get(0).getDefaultMessage());
		return result;
	}

}
