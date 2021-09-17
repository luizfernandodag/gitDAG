package Spring.web.service;

import Spring.web.domain.Pessoa;

import java.util.List;

public interface PessoaService {
    public List<Pessoa> listPessoa();
    public void savePessoa (Pessoa pessoa);
    public void deletePessoa (Pessoa pessoa);
    public Pessoa findPessoa(Pessoa pessoa);
}
