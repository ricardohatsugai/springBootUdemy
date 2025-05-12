package br.rep.trindade.produtoapi.repository;

import br.rep.trindade.produtoapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

    List<Produto> findByNome(String nome);

}