package model;

public class Pedido {

	 private Long id;

	    
	    private String status;
	    private Double valorTotal;
	    private String metodoPagamento;
	    private String enderecoEntrega;
	    
	    
	    
	    public Pedido() {};
	    
		public Pedido(Long id, String status, Double valorTotal, String metodoPagamento, String enderecoEntrega) {
			super();
			this.id = id;
			this.status = status;
			this.valorTotal = valorTotal;
			this.metodoPagamento = metodoPagamento;
			this.enderecoEntrega = enderecoEntrega;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Double getValorTotal() {
			return valorTotal;
		}

		public void setValorTotal(Double valorTotal) {
			this.valorTotal = valorTotal;
		}

		public String getMetodoPagamento() {
			return metodoPagamento;
		}

		public void setMetodoPagamento(String metodoPagamento) {
			this.metodoPagamento = metodoPagamento;
		}

		public String getEnderecoEntrega() {
			return enderecoEntrega;
		}

		public void setEnderecoEntrega(String enderecoEntrega) {
			this.enderecoEntrega = enderecoEntrega;
		}
	    
	    
	    
	    
}
