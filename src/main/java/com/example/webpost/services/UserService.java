package com.example.webpost.services;

import java.util.List;

public interface UserService<E> {
    List<E> findAll();
}
