package com.barunsw.ems.kt_4p_ems.service;

import com.barunsw.ems.kt_4p_ems.dao.RequestInfoDao;
import com.barunsw.ems.kt_4p_ems.model.SetupFileInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestInfoService {
	@Autowired
	private RequestInfoDao requestInfoDao;
	
	public SetupFileInfoVo getSetupFileInfo(SetupFileInfoVo paramVo) {
		return requestInfoDao.getSetupFileInfo(paramVo);
	}
}
