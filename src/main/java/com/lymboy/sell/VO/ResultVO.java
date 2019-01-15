package com.lymboy.sell.VO;

import lombok.Data;

/**
 * http 请求的最外层对象
 */
@Data
public class ResultVO<T> {
    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 返回的具体信息 */
    private T data;
}
