package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
    
}
