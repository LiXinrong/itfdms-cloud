package com.itfdms.common.security.exception;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.itfdms.common.security.component.ItfdmsAuth2ExceptionSerializer;
import org.springframework.http.HttpStatus;

/**
 * 　　* @description: TODO
 * 　　* @param
 * 　　* @return
 * 　　* @throws
 * 　　* @author lxr
 * 　　* @date 2019/5/14 17:37
 *
 */
@JsonSerialize(using = ItfdmsAuth2ExceptionSerializer.class)
public class ForbiddenException extends ItfdmsAuth2Exception {

    public ForbiddenException(String msg, Throwable t) {
        super(msg);
    }

    @Override
    public String getOAuth2ErrorCode() {
        return "access_denied";
    }

    @Override
    public int getHttpErrorCode() {
        return HttpStatus.FORBIDDEN.value();
    }

}

