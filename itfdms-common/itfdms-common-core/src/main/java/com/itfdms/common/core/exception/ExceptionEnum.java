package com.itfdms.common.core.exception;

public enum ExceptionEnum {

    /**
     * 空问题
     */
    PARAM_NOT_NULL(101, "请求参数不能为空!"),
    ID_NOT_NULL(102, "ID不能为空!"),
    IDS_NOT_NULL(103, "IDS数组不能为空!"),
    USERNAME_NOT_NULL(104, "用户名不能为空!"),
    PWD_NOT_NULL(105, "密码不能为空!"),
    KAPTCHA_NOT_NULL(106, "验证码不能为空!"),
    KAPTCHA_ERROR(107, "验证码错误!"),
    MOBILE_NOT_NULL(108, "手机号不能为空!"),
    MOBILE_REPEAT(109, "该手机号已注册!"),
    USERNAME_REPEAT(110, "该用户名已存在!"),

    /**
     * 不合法问题
     */
    TOKEN_NOLEGAL(201, "不合法的token或token过期!"),
    DATE_NOLEGAL(202, "不合法的日期格式!"),
    REQ_NOLEGAL(203, "不合法的请求参数!"),
    FILE_SIZE_NOLEGAL(204, "不合法的文件大小!"),

	/**
	 * 支付问题
	 */
	WECHAT_ERROR(205, "微信支付失败"),
	WECHAT_NOTIFY_ERROR(206, "微信回调失败"),
	ALIPAY_ERROR(207, "支付宝支付失败"),
	PAY_SUCCESS(208, "支付成功"),
    /**
     * 权限问题
     */
    NOT_PERMISSION(403, "无资源访问权限!"),

    /**
     * 账户问题
     */
    USER_ALREADY_REG(408, "该用户已经注册!"),
    USER_NOT_EXISTED(409, "没有此用户!"),
    USER_LOGIN_EXISTED(410, "登录成功!"),
    ACCOUNT_FREEZED(401, "账号被冻结!"),
    OLD_PWD_NOT_RIGHT(402, "原密码不正确!"),
    TWO_PWD_NOT_MATCH(407, "两次输入密码不一致!"),
    USER_PWD_ERROR(406, "用户名或密码不对!!"),
    USER_MOBILE_NOT_EXISTED(411, "手机绑定用户不存在!"),
    USER_COMPANY_INFO_EXISTED(412, "用户关联企业信息不存在!"),
    /**
     * 增删改查
     */
    QUERY_SUCCESS(501, "查询成功!"), QUERY_ERROR(502, "查询失败!"), INSERT_SUCCESS(503, "保存成功!"), INSERT_ERROR(504, "保存失败!"), DELETE_SUCCESS(505, "删除成功!"), DELETE_ERROR(506, "删除失败!"), UPDATE_SUCCESS(507, "更新成功!"), UPDATE_ERROR(508, "更新失败!"),
    BATCH_DELETE_SUCCESS(509, "批量删除成功!"), BATCH_DELETE_ERROR(510, "批量删除失败!"), BATCH_INSERT_SUCCESS(511,
            "批量添加成功!"), BATCH_INSERT_ERROR(512,
            "批量添加失败!"), BATCH_UPDATE_SUCCESS(513, "批量更新成功!"), BATCH_UPDATE_ERROR(514, "批量更新失败!"),

    /**
     * 请求状态
     */
    SYS_SUCCESS(200, "请求成功!"), SYS_ERROR(400, "请求失败!"), NOT_FOUND(404, "接口不存在!"),
    /**
     * 错误的请求
     */
    SERVER_ERROR(500, "系统繁忙，请稍候再试!");


    ExceptionEnum(int resCode, String resMsg) {
        this.resCode = resCode;
        this.resMsg = resMsg;
    }

    /**
     * 错误信息
     */
    private String resMsg;
    /**
     * 错误码 0：成功 非0：失败
     */
    private Integer resCode;

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public Integer getResCode() {
        return resCode;
    }

    public void setResCode(Integer resCode) {
        this.resCode = resCode;
    }
}
