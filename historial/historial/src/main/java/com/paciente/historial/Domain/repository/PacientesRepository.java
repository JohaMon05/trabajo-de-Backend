package com.paciente.historial.Domain.repository;

import com.paciente.historial.Domain.model.Entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepository extends JpaRepository<PacienteEntity, Long> {
}
