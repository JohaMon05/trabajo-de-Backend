package com.paciente.historial.infraestructure.controller;

import com.paciente.historial.Domain.model.Entity.PacienteEntity;
import com.paciente.historial.Domain.service.PacientesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Pacientes")
@CrossOrigin(origins = "*")
public class PacientesController {

    private final PacientesService pacientesService;

    public PacientesController(PacientesService pacientesService) {
        this.pacientesService = pacientesService;
    }

    @GetMapping("/lista")
    public List<PacienteEntity> listarPacientes() {
        return pacientesService.listarPacientes();
    }

    @PostMapping("/guardar")
    public PacienteEntity guardarPaciente(@RequestBody PacienteEntity paciente) {
        return pacientesService.guardarPaciente(paciente);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPaciente(@PathVariable Long id) {
        pacientesService.eliminarPaciente(id);
        return ResponseEntity.noContent().build();
    }



}
