package com.github.viniciusvk1.HibernateLessons.Repository;

import com.github.viniciusvk1.HibernateLessons.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
