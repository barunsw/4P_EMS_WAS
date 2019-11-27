package com.barunsw.ems.kt_4p_ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barunsw.ems.kt_4p_ems.dao.PackageDao;
import com.barunsw.ems.kt_4p_ems.model.PackageVo;

@Service
public class PackageService {
	@Autowired
	private PackageDao packageDao;
	
	public List<PackageVo> selectList(PackageVo paramVo) {
		return packageDao.selectList(paramVo);
	}
}
