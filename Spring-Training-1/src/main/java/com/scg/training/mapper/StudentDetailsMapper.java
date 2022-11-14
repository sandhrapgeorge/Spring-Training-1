package com.scg.training.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface StudentDetailsMapper<StudentDetailsVO, StudentDetails> {
	@Mapping(source = "studentDetailsId", target = "id")
	StudentDetailsVO toVo(StudentDetails studentDetails);

	@Mapping(source = "id", target = "studentDetailsId")
	@Mapping(target = "student", ignore = true)
	StudentDetails toEntity(StudentDetailsVO studentDetailsVO);

}
