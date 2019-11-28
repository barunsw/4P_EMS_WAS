package com.barunsw.ems.kt_4p_ems.dao;

import com.barunsw.ems.kt_4p_ems.model.PackageInfoVo;
import com.barunsw.ems.kt_4p_ems.model.SetupFileInfoVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RequestInfoDao {
	public SetupFileInfoVo getSetupFileInfo(SetupFileInfoVo paramVo);
	public PackageInfoVo getPackageInfo(PackageInfoVo paramVo);
}
