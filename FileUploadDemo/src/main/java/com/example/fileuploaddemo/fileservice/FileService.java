package com.example.fileuploaddemo.fileservice;

import java.util.List;

import com.example.fileuploaddemo.model.FileModal;

public interface FileService {

	 List<FileModal> getAllFiles();
	    void saveAllFilesList(List<FileModal> fileList);
}
