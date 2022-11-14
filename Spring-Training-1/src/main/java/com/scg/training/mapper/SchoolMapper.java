package com.scg.training.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.scg.training.entity.School;
import com.scg.training.vo.SchoolVO;

@Mapper
public interface SchoolMapper {
	@Mapping(source = "student", target = "studentVO")
	SchoolVO toVO(School school);

	@Mapping(target = "contact", ignore = true)
	@Mapping(target = "student", source = "studentVO")
	School toEntity(SchoolVO schoolvo);

	List<SchoolVO> toVOList(List<School> schoolList);

	List<School> toEntityList(List<SchoolVO> schoolVoList);

}
