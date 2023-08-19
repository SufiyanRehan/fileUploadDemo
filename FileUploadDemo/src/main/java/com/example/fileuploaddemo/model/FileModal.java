package com.example.fileuploaddemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "filemodel")
public class FileModal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	long id;
	
	@Column(name = "name")
	String fileName;
	
	@Column(name = "fileContent")
	String fileContent;
	
	@Column(name = "filetype")
	String fileType;
	
	public FileModal() {
        super();
    }
    public FileModal(String fileName, String fileContent, String fileType) {
        super();
        this.fileName = fileName;
        this.fileContent = fileContent;
        this.fileType = fileType;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getContent() {
        return fileContent;
    }
    public void setContent(String fileContent) {
        this.fileContent = fileContent;
    }
    public String getFileType() {
        return fileType;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
