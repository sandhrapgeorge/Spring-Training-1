package com.scg.training.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import com.scg.training.entity.Student;
import com.scg.training.vo.StudentVO;

@Mapper(componentModel = "spring", uses = { StudentDetailsMapper.class, LaptopMapper.class, SchoolMapper.class })

@Component
public interface StudentMapper {
	StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

	StudentVO toVO(Student student);

	Student toEntity(StudentVO StudentVO);

	List<StudentVO> toVOList(List<Student> studentList);

	List<Student> toEntityList(List<StudentVO> studentVoList);

}
