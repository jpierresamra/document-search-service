package com.document.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.document.beans.Document;
import com.document.service.DocumentService;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentSearchController {
	
    private final DocumentService documentService;

    public DocumentSearchController(DocumentService documentService) {
        this.documentService = documentService;
    }
   
    @GetMapping
    public ResponseEntity<Iterable<Document>> getTreatmentsByCustomer(@RequestParam(required = false) String filter) throws Exception {
		Iterable<Document> responseBody = documentService.getDocuments(filter);
		return ResponseEntity.ok(responseBody);
    }

    @PostMapping
    public @ResponseBody ResponseEntity<?> addDocument(@RequestBody Document paramDoc) throws Exception {
        Document responseTreatment = documentService.addDocument(paramDoc);
        return ResponseEntity.ok(responseTreatment);
    }

}