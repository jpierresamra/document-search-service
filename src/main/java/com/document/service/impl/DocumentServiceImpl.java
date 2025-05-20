package com.document.service.impl;

import org.springframework.stereotype.Service;

import com.document.beans.Document;
import com.document.repository.DocumentRepositoryJPA;
import com.document.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService
{
	private DocumentRepositoryJPA documentJPA;
	
	public DocumentServiceImpl(DocumentRepositoryJPA documentJPA) {
		super();
		this.documentJPA = documentJPA;
	}

	@Override
	public Iterable<Document> getDocuments(String filter) throws Exception {
		return documentJPA.findByFilter(filter);
	}

	@Override
	public Document addDocument(Document paramDoc) throws Exception {
		return documentJPA.save(paramDoc);
	}

}
