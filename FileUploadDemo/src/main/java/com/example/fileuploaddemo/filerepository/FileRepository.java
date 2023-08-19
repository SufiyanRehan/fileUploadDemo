package com.example.fileuploaddemo.filerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fileuploaddemo.model.FileModal;

@Repository
public interface FileRepository extends JpaRepository<FileModal, Long> {

}
