package com.document.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.document.beans.Document;

public interface DocumentRepositoryJPA extends JpaRepository<Document, UUID> {

	@Query("SELECT d FROM Document d WHERE d.body LIKE %:filter% OR d.title LIKE %:filter% OR d.author LIKE %:filter%")
	Iterable<Document> findByFilter(@Param("filter") String filter);

}
