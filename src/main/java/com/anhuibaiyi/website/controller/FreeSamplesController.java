package com.anhuibaiyi.website.controller;

import com.anhuibaiyi.website.dto.FreeSamplesDto;
import com.anhuibaiyi.website.dto.ResultCode;
import com.anhuibaiyi.website.dto.ResultDto;
import com.anhuibaiyi.website.utils.SendEmailUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
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
