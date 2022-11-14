package com.scg.training.mapper;

import org.mapstruct.Mapper;

import com.scg.training.entity.StudentDetails;
import com.scg.training.vo.StudentDetailsVO;

@Mapper
public interface StudentDetailsMapper {

	StudentDetailsVO toVo(StudentDetails studentDetails);

	StudentDetails toEntity(StudentDetailsVO studentDetailsVO);

}
