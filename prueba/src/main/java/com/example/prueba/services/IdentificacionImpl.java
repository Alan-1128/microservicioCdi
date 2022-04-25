package com.example.prueba.services;

import java.util.ArrayList;

import com.example.prueba.models.IdentificationCard;
import com.example.prueba.repository.IdentificationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentificacionImpl implements IdentificacionService {

  @Autowired
  private IdentificationRepository identificacionRepository;

  @Override
  public ArrayList<IdentificationCard> getIdentifications() {
    return (ArrayList<IdentificationCard>) identificacionRepository.findAll();
  }

  @Override
  public IdentificationCard getBynumberIdentificacion(Long numberIdentificacion) {
    return identificacionRepository.getBynumberIdentificacion(numberIdentificacion);
  }
  
}
