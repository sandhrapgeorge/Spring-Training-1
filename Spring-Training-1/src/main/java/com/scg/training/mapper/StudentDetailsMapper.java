package com.scg.training.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.scg.training.entity.StudentDetails;
import com.scg.training.vo.StudentDetailsVO;

@Mapper(componentModel = "spring")

public interface StudentDetailsMapper {

	@Mapping(source = "studentDetailsId", target = "id")
	StudentDetailsVO toVo(StudentDetails studentDetails);

	@Mapping(source = "id", target = "studentDetailsId")
	@Mapping(target = "student", ignore = true)
	StudentDetails toEntity(StudentDetailsVO studentDetailsVO);

}
