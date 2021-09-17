package Spring.web.service;

import Spring.web.dao.IPessoaDao;
import Spring.web.domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
public class PessoaServiceImpl implements PessoaService {
    @Autowired
    private IPessoaDao pessoaDao;
    @Override
    @Transactional(readOnly = true)
    public List<Pessoa> listPessoa() {
        return (List<Pessoa>) pessoaDao.findAll();
    }

    @Override
    @Transactional
    public void savePessoa(Pessoa pessoa) {
        pessoaDao.save(pessoa);
    }

    @Override
    @Transactional
    public void deletePessoa(Pessoa pessoa) {
        pessoaDao.delete(pessoa);
    }

    @Override
    @Transactional(readOnly = true)
    public Pessoa findPessoa(Pessoa pessoa) {
       return pessoaDao.findById(pessoa.getId_pessoa()).orElse(null);
    }
}
