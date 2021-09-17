package Spring.web.dao;

import Spring.web.domain.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface IPessoaDao extends CrudRepository<Pessoa,Long > {
}
