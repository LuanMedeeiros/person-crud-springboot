package com.medeiros.people.service;

import com.medeiros.people.dto.request.PersonRequestDTO;
import com.medeiros.people.dto.response.PersonResponseDTO;
import java.util.List;

public interface PersonService {

    PersonResponseDTO findById(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update(Long id, PersonRequestDTO personDTO);

    String delete(Long id);

}
