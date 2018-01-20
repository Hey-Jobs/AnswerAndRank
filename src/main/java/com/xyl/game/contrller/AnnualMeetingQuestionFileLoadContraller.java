package com.xyl.game.contrller;

import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.xyl.game.Service.AnnualMeetingQuestionExctFileSerivce;
import com.xyl.game.vo.AnnualMeetingGameQuestionVo;

/**
 * 接收Exct文件
 * @author dazhi
 *
 */
@Controller
public class AnnualMeetingQuestionFileLoadContraller {

	@Autowired 
	private AnnualMeetingQuestionExctFileSerivce exctFileSerivce;
	
	/**
	 * 接收年会游戏上传的exct表格文件
	 */
	@RequestMapping("/loadExctFile")
	@ResponseBody
	public AnnualMeetingGameQuestionVo uploadExct(@RequestParam(value="exctFile")MultipartFile multipartFile){
		AnnualMeetingGameQuestionVo savaDataForExct = null;
		try {
			savaDataForExct = exctFileSerivce.savaDataForExct(multipartFile.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return savaDataForExct;
	}
	
	/**
	 * 查询数据库以及存储的数据
	 */
	@RequestMapping("/loadExctFile")
	@ResponseBody
	public AnnualMeetingGameQuestionVo getAllGameQuestion(){
		AnnualMeetingGameQuestionVo savaDataForExct = null;
		
		
		
		return savaDataForExct;
	}
}
