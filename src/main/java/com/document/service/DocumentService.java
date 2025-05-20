package com.document.service;

import com.document.beans.Document;

public interface DocumentService
{
	public Iterable<Document> getDocuments(String filter) throws Exception; 
	public Document addDocument(Document paramDoc) throws Exception;
}
