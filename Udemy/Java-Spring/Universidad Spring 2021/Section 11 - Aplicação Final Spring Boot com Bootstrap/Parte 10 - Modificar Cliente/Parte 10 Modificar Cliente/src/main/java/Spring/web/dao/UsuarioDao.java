package Spring.web.dao;

import Spring.web.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface UsuarioDao extends JpaRepository<Usuario, Long> {

    Usuario findByusername(String username);
}
