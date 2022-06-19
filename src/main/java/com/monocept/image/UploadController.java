package com.monocept.image;

import java.io.IOException;
import java.util.Date;

import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadController {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	public UploadController() {
		System.out.println("Inside upload controller");
	}
	
	@PostMapping("/file/uploadImage")
	@ResponseBody
	public ResponseEntity<?> uploadImage(@RequestParam(value = "image") MultipartFile file){
		
		if(file.isEmpty())
			return ResponseEntity.badRequest().build();
		
		String fileName = file.getOriginalFilename();
		
		System.out.println(fileName);
		
		try {
			UploadFile uploadFile = new UploadFile();
			uploadFile.setName(fileName);
			uploadFile.setCreatedtime(new Date());
			uploadFile.setContent(new Binary(file.getBytes()));
			uploadFile.setContenttype(file.getContentType());
			uploadFile.setSize(file.getSize());
			
			UploadFile savedFile = mongoTemplate.save(uploadFile);
			
			String url = "http://localhost:8080/file/image/"+ savedFile.getId();
			
			DocumentUrl documentUrl = new DocumentUrl(url);
			
			return ResponseEntity.ok(documentUrl);
		} catch(IOException e) {
			return ResponseEntity.status(501).build();
		}
	}
	

	@GetMapping(value = "/file/image/{id}", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
	@ResponseBody
	public byte[] image(@PathVariable String id) {
		byte data[] = null;
		UploadFile file = mongoTemplate.findById(id, UploadFile.class);
		if(file != null) {
			data = file.getContent().getData();
		}
		return data;
	}

}
