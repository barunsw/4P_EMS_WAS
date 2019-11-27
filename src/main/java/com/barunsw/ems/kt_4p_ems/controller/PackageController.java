package com.barunsw.ems.kt_4p_ems.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.barunsw.ems.kt_4p_ems.constants.Result;
import com.barunsw.ems.kt_4p_ems.model.PackageVo;
import com.barunsw.ems.kt_4p_ems.model.ResponseVo;
import com.barunsw.ems.kt_4p_ems.service.PackageService;

@Controller
public class PackageController {
	private static Logger LOGGER = LogManager.getLogger(PackageController.class);
	
	@Autowired
	private PackageService packageService;
	
	@RequestMapping(value = "/4p/package", method = RequestMethod.GET)
	public ResponseEntity<ResponseVo> selectList(PackageVo packageVo) {
		LOGGER.debug("selectList paramData:" + packageVo);
		
		ResponseVo response = new ResponseVo();
		
		try {
			List<PackageVo> data = packageService.selectList(packageVo);
			
			response.setResult(Result.OK);
			response.setData(data);
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);
			
			response.setResult(Result.FAIL);
			response.setMessage(ex.getMessage());
		}
		
		return response.build();
	}
}
