package com.scg.training.mapper;

import org.mapstruct.Mapper;

import com.scg.training.entity.Laptop;
import com.scg.training.vo.LaptopVO;

@Mapper
public interface LaptopMapper {
	LaptopVO toVo(Laptop laptop);

	Laptop toEntity(LaptopVO laptopvo);

}
