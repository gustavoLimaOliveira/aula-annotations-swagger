package br.com.fiap.gradle.groovy.service.validation;

import br.com.fiap.gradle.groovy.dto.UsuarioDTO;
import br.com.fiap.gradle.groovy.entities.Usuario;
import br.com.fiap.gradle.groovy.repository.UsuarioRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CriacaoUsuarioValidator implements ConstraintValidator<CriacaoUsuarioValid, UsuarioDTO> {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public void initialize(CriacaoUsuarioValid ann) {
    }

    @Override
    public boolean isValid(UsuarioDTO dto, ConstraintValidatorContext context) {
        Optional<Usuario> usuario = repository.findByEmail(dto.email());
        return usuario.isEmpty();
    }

}
