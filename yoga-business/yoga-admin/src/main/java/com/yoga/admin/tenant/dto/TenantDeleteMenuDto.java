package com.yoga.admin.tenant.dto;

import com.yoga.core.base.BaseDto;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
public class TenantDeleteMenuDto extends BaseDto {

	@ApiModelProperty(value = "租户ID", required = true)
	@NotNull(message = "请指定租户")
	private Long tenantId;
	@ApiModelProperty(value = "菜单ID", required = true)
	@NotNull(message = "请指定菜单ID")
	private Long menuId;
}
