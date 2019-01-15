package com.lymboy.sell.utils;

import com.lymboy.sell.VO.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object) {

        ResultVO resultVO = new ResultVO();

        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");

        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String msg) {
        ResultVO resultVo = new ResultVO();
        resultVo.setCode(code);
        resultVo.setMsg(msg);
        return resultVo;
    }
}
