package com.scg.training.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.training.entity.School;
import com.scg.training.vo.SchoolVO;

@Mapper
public interface SchoolMapper {

	SchoolVO toVO(School school);

	School toEntity(SchoolVO schoolvo);

	List<SchoolVO> toVOList(List<School> schoolList);

	List<School> toEntityList(List<SchoolVO> schoolVoList);

}
