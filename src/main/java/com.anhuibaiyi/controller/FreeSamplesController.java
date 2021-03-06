package com.anhuibaiyi.controller;

import com.anhuibaiyi.dto.FreeSamplesDto;
import com.anhuibaiyi.dto.ResultCode;
import com.anhuibaiyi.dto.ResultDto;
import com.anhuibaiyi.utils.SendEmailUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guy
 */
@RestController
public class FreeSamplesController {

    /**
     * 发送短信
     * @param dto
     * @return
     */
    @PostMapping(value = "/send/email")
    public ResultDto sendEmail(FreeSamplesDto dto) {
        ResultDto resultDto = new ResultDto();
        if (StringUtils.isAllBlank(dto.getName(), dto.getMobile(), dto.getAddress())) {
            resultDto.setResultMsg("必要信息不能为空！");
            return resultDto;
        }
        boolean flag = SendEmailUtil.sendEmail(dto);
        if (!flag) {
            resultDto.setResultMsg("发送失败！");
            return resultDto;
        }
        resultDto.setResultMsg("发送成功！");
        resultDto.setResultCode(ResultCode.SUCCESS_CODE);
        return resultDto;
    }

}
