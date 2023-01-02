package com.example.webpost.services;

import java.util.List;

public interface PublicationService<E> {
    List<E> findAll() throws Exception;
}
