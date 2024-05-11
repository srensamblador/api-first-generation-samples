package com.srensamblador.apifirst.rest.controller;

import com.srensamblador.apifirst.rest.api.PetApi;
import com.srensamblador.apifirst.rest.dto.ApiResponseDTO;
import com.srensamblador.apifirst.rest.dto.PetDTO;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

import java.util.List;

// Sample Controller
public class PetController implements PetApi {

    @Override
    public ResponseEntity<PetDTO> addPet(PetDTO petDTO) {
        return PetApi.super.addPet(petDTO);
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey) {
        return PetApi.super.deletePet(petId, apiKey);
    }

    @Override
    public ResponseEntity<List<PetDTO>> findPetsByStatus(String status) {
        return PetApi.super.findPetsByStatus(status);
    }

    @Override
    public ResponseEntity<List<PetDTO>> findPetsByTags(List<String> tags) {
        return PetApi.super.findPetsByTags(tags);
    }

    @Override
    public ResponseEntity<PetDTO> getPetById(Long petId) {
        return PetApi.super.getPetById(petId);
    }

    @Override
    public ResponseEntity<PetDTO> updatePet(PetDTO petDTO) {
        return PetApi.super.updatePet(petDTO);
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status) {
        return PetApi.super.updatePetWithForm(petId, name, status);
    }

    @Override
    public ResponseEntity<ApiResponseDTO> uploadFile(Long petId, String additionalMetadata, Resource body) {
        return PetApi.super.uploadFile(petId, additionalMetadata, body);
    }
}
