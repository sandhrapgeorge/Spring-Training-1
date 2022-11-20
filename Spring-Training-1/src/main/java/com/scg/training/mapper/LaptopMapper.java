package com.scg.training.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.scg.training.entity.Laptop;
import com.scg.training.vo.LaptopVO;

@Mapper(componentModel = "spring", uses = { StudentMapper.class })
public interface LaptopMapper {

	@Mapping(source = "laptopid", target = "laptopId")
//	@Mapping(source = "student", target = "studentVO")
	LaptopVO toVo(Laptop laptop);

	@Mapping(source = "laptopId", target = "laptopid")
	// @Mapping(source = "studentVO", target = "student")
	@Mapping(target = "student", ignore = true)
	Laptop toEntity(LaptopVO laptopvo);

}
