package model;

public class ItemPedido {

	   private Long id;
	    private Produto produto;
	    private Integer quantidade;
	    private Pedido pedido;
	    
	    
	    
		public ItemPedido(Long id, Produto produto, Integer quantidade, Pedido pedido) {
			super();
			this.id = id;
			this.produto = produto;
			this.quantidade = quantidade;
			this.pedido = pedido;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Produto getProduto() {
			return produto;
		}
		public void setProduto(Produto produto) {
			this.produto = produto;
		}
		public Integer getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(Integer quantidade) {
			this.quantidade = quantidade;
		}
		public Pedido getPedido() {
			return pedido;
		}
		public void setPedido(Pedido pedido) {
			this.pedido = pedido;
		}

	    
	    
}
