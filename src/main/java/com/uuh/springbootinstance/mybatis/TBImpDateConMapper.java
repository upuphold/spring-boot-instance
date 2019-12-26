package com.uuh.springbootinstance.mybatis;

import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

/**
 * @author cg
 * @description
 * @date 2019/12/20 17:31
 * @since 1.0
 */
@Mapper
public interface TBImpDateConMapper {


    @Select("SELECT * FROM TBImpDateCon")
    TBImpDateCon findAll();

}