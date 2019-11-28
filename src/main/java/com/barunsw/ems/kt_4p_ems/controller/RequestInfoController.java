package com.barunsw.ems.kt_4p_ems.controller;

import java.util.List;

import com.barunsw.ems.kt_4p_ems.model.SetupFileInfoVo;
import com.barunsw.ems.kt_4p_ems.service.RequestInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.barunsw.ems.kt_4p_ems.constants.Result;
import com.barunsw.ems.kt_4p_ems.model.ResponseSetupFileInfoVo;

@Controller
public class RequestInfoController {
	private static Logger LOGGER = LogManager.getLogger(RequestInfoController.class);
	
	@Autowired
	private RequestInfoService requestService;
	
	@RequestMapping(value = "/4P-AGW/{macAddress}.txt", method = RequestMethod.GET)
	public ResponseEntity<ResponseSetupFileInfoVo> getSetupFileInfo4p(@PathVariable String macAddress) {
		LOGGER.debug("4p macAddress:" + macAddress);

		ResponseSetupFileInfoVo response = new ResponseSetupFileInfoVo();

		try {
			SetupFileInfoVo paramVo = new SetupFileInfoVo();
			paramVo.setMacAddress(macAddress);

			SetupFileInfoVo data = requestService.getSetupFileInfo(paramVo);

			response.setResult(Result.OK);
			response.setOltIp(data.getOltIp());
			response.setOltSubnet(data.getOltSubnet());
			response.setOltGw(data.getOltGw());
			response.setIpsecGw(data.getIpsecIp());
			response.setAgwIp(data.getAgwIp());
			response.setMgcIp(data.getMgcIp());
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);

			response.setResult(Result.FAIL);
			response.setMessage(ex.getMessage());
		}

		return response.build();
	}

	@RequestMapping(value = "/8P-AGW/{macAddress}.txt", method = RequestMethod.GET)
	public ResponseEntity<ResponseSetupFileInfoVo> getSetupFileInfo8p(@PathVariable String macAddress) {
		LOGGER.debug("8p macAddress:" + macAddress);

		ResponseSetupFileInfoVo response = new ResponseSetupFileInfoVo();

		try {
			SetupFileInfoVo paramVo = new SetupFileInfoVo();
			paramVo.setMacAddress(macAddress);

			SetupFileInfoVo data = requestService.getSetupFileInfo(paramVo);

			response.setResult(Result.OK);
			response.setOltIp(data.getOltIp());
			response.setOltSubnet(data.getOltSubnet());
			response.setOltGw(data.getOltGw());
			response.setIpsecGw(data.getIpsecIp());
			response.setAgwIp(data.getAgwIp());
			response.setMgcIp(data.getMgcIp());
		}
		catch (Exception ex) {
			LOGGER.error(ex.getMessage(), ex);

			response.setResult(Result.FAIL);
			response.setMessage(ex.getMessage());
		}

		return response.build();
	}
}
