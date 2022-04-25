package com.example.prueba.services;

import java.util.ArrayList;

import com.example.prueba.models.IdentificationCard;

public interface IdentificacionService {
  
  public ArrayList<IdentificationCard> getIdentifications();

  public IdentificationCard getBynumberIdentificacion(Long numberIdentificacion);
}
