package com.example.fileuploaddemo.fileservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fileuploaddemo.filerepository.FileRepository;
import com.example.fileuploaddemo.model.FileModal;

@Service
public class FileServiceImpl implements FileService {

	
	@Autowired 
    FileRepository fileRepository;
	
	@Override
	public List<FileModal> getAllFiles(){
		
		return fileRepository.findAll();
	}


	@Override
	public void saveAllFilesList(List<FileModal> fileList) {
		// TODO Auto-generated method stub
		for(FileModal fileModel : fileList) {
			fileRepository.save(fileModel);
		}
	}
}
