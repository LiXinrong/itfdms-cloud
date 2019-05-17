package com.itfdms.common.security.component;



import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.itfdms.common.core.constant.CommonConstants;
import com.itfdms.common.security.exception.ItfdmsAuth2Exception;
import lombok.SneakyThrows;

/**
　　* @description: OAuth2 异常格式化
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/14 17:47
　　*/
public class ItfdmsAuth2ExceptionSerializer extends StdSerializer<ItfdmsAuth2Exception> {
	public ItfdmsAuth2ExceptionSerializer() {
		super(ItfdmsAuth2Exception.class);
	}

	@Override
	@SneakyThrows
	public void serialize(ItfdmsAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
		gen.writeStartObject();
		gen.writeObjectField("code", CommonConstants.FAIL);
		gen.writeStringField("msg", value.getMessage());
		gen.writeStringField("data", value.getErrorCode());
		gen.writeEndObject();
	}
}
