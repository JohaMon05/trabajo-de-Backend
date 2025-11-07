package com.paciente.historial.Domain.service;

import com.paciente.historial.Domain.model.Entity.PacienteEntity;
import com.paciente.historial.Domain.repository.PacientesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacientesService {

    private final PacientesRepository pacientesRepository;

    public PacientesService(PacientesRepository pacientesRepository) {
        this.pacientesRepository = pacientesRepository;
    }

    public List<PacienteEntity> listarPacientes() {
        return pacientesRepository.findAll();
    }

    public PacienteEntity guardarPaciente(PacienteEntity paciente) {
        return pacientesRepository.save(paciente);
    }

    public void eliminarPaciente() { return pacientesRepository.deleteById(id); }


}


