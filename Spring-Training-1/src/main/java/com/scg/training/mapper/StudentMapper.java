package com.scg.training.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.scg.training.entity.Student;
import com.scg.training.vo.StudentVO;

@Mapper(componentModel = "spring", uses = { StudentDetailsMapper.class, LaptopMapper.class, SchoolMapper.class })

public interface StudentMapper {

	@Mapping(source = "studentid", target = "id")
	@Mapping(source = "studentDetails", target = "studentDetailsVO")
	@Mapping(source = "laptop", target = "laptopVO")
	@Mapping(source = "school", target = "schoolVO")
//	@Mapping(target = "createdBy", ignore = true)
//	@Mapping(target = "createdTimestamp", ignore = true)
//	@Mapping(target = "lastUpdatedBy", ignore = true)
//	@Mapping(target = "lastUpdatedTimestamp", ignore = true)
//
	StudentVO toVO(Student student);

	@Mapping(target = "studentid", source = "id")
	@Mapping(target = "studentDetails", source = "studentDetailsVO")
	@Mapping(target = "laptop", source = "laptopVO")
	@Mapping(target = "school", source = "schoolVO")
	Student toEntity(StudentVO StudentVO);

	List<StudentVO> toVOList(List<Student> studentList);

	List<Student> toEntityList(List<StudentVO> studentVoList);

}
