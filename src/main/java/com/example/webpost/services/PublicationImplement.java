package com.example.webpost.services;

import com.example.webpost.entities.Publication;
import com.example.webpost.repositories.PublicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationImplement implements PublicationService<Publication> {
    private final PublicationRepository publicationRepository;

    public PublicationImplement(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }

    @Override
    public List<Publication> findAll() throws Exception {
        try {
            return publicationRepository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage(), e);
        }
    }
}
