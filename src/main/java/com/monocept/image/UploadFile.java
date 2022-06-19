package com.monocept.image;

import java.util.Date;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("CustomerDocuments")
public class UploadFile {
	@Id
	private String id;
	private String name;
	private Date createdtime;
	private Binary content;
	private String contenttype;
	private long size;
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCreatedtime(Date createdtime) {
		this.createdtime = createdtime;
	}
	public void setContent(Binary content) {
		this.content = content;
	}
	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getCreatedtime() {
		return createdtime;
	}
	public Binary getContent() {
		return content;
	}
	public String getContenttype() {
		return contenttype;
	}
	public long getSize() {
		return size;
	}
	
}
