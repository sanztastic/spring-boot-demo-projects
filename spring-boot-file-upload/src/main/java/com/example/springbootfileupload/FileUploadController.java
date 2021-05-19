package com.example.springbootfileupload;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	Map<String, Object> result = new HashMap<String, Object>();
	/// Receive message
	@RequestMapping("/uploadFile")
	public Map<String,Object> upload(@RequestParam("attach")MultipartFile file) throws IOException{
		//File info
		System.out.println("File name = " + file.getOriginalFilename());
		System.out.println("File type = " + file.getContentType());
		//Save to disk
		String filepath = "/home/shanand"+File.separator+"Desktop"+File.separator;
		file.transferTo(new File(filepath+file.getOriginalFilename()));
		result.put("Success", true);
		return result;
	}
}
