package com.example.Proyecto.Final_Cine.services;

import com.example.Proyecto.Final_Cine.entities.Entrada;
import com.example.Proyecto.Final_Cine.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntradaServiceImpl extends BaseServiceImpl<Entrada, Long> implements EntradaService {
    @Autowired
    public EntradaServiceImpl(BaseRepository<Entrada, Long> baseRepository) {
        super(baseRepository);
    }
}
