package Spring.web.dao;

import Spring.web.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface IPessoaDao extends JpaRepository<Pessoa,Long > {
}
