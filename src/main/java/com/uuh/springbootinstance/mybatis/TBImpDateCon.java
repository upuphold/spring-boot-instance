package com.uuh.springbootinstance.mybatis;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TBImpDateCon {

	@ApiModelProperty(value = "主键标识")
	private Integer id;

	@ApiModelProperty(value = "接入数据源名称")
	private String datasourceName;

	@ApiModelProperty(value = "接入数据源类型")
	private String datasourceType;

	@ApiModelProperty(value = "表名称")
	private String dbTable;

	@ApiModelProperty(value = "是否删除：0-删除；1-有效")
	private Boolean isFlag;

	@ApiModelProperty(value = "状态")
	private Boolean status;

	@ApiModelProperty(value = "创建日期")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date idate;

	@ApiModelProperty(value = "更新日期")
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
	private Date udate;

}