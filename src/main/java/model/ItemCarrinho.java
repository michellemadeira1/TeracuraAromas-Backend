package model;

public class ItemCarrinho {

	
	    private Long id;
	    private Produto produto;
	    private Integer quantidade;
	    
	    
	    
	    
	    
		public ItemCarrinho(Long id, Produto produto, Integer quantidade) {
			super();
			this.id = id;
			this.produto = produto;
			this.quantidade = quantidade;
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

	    
	    
}
