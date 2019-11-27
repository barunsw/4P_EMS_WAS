package com.barunsw.ems.kt_4p_ems.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.barunsw.ems.kt_4p_ems.model.PackageVo;

@Mapper
public interface PackageDao {
	public List<PackageVo> selectList(PackageVo paramVo);
}
