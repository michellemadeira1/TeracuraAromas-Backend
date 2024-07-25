package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.ItemPedido;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
