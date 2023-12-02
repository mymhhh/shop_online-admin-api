package com.shop_online.vo;

import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.shop_online.converter.GenderConverter;
import com.shop_online.utils.DateUtils;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(description = "用户")
@ExcelIgnoreUnannotated
public class UserVO {
    @Schema(description = "主键")
    private Integer id;
    @ExcelProperty(value = "账号", index = 0)
    @Schema(description = "账号")
    private String account;
    @Schema(description = "昵称")
    @ExcelProperty(value = "昵称", index = 1)
    private String nickname;
    @Schema(description = "手机号")
    @ExcelProperty(value = "手机号", index = 2)
    private String mobile;
    @Schema(description = "认证id")
    @ExcelProperty(value = "认证id", index = 3)
    private String openId;
    @Schema(description = "性别（0男1女）")
    @ExcelProperty(value = "性别", index = 4, converter = GenderConverter.class)
    private Integer gender;
    @Schema(description = "职业")
    @ExcelProperty(value = "职业", index = 5)
    private String profession;
    @Schema(description = "生日")
    @ExcelProperty(value = "生日", index = 6)
    @JsonFormat(pattern = DateUtils.DATE_PATTERN)
    private LocalDateTime birthday;
    @Schema(description = "头像")
    @ExcelProperty(value = "头像", index = 7)
    private String avatar;
}
