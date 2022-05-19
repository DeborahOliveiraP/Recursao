package lista_Filha;

public class Lista {

	No inicio = null;
	int tamanho = 0;
	
	public void inserirInicio(String info) {
		 No no = new No();
		 no.info= info;
		 no.proximo= inicio;
		 inicio = no;
		 tamanho++;
	}
	
	public String retirarIncio() {
		if (inicio == null) {
			return null;
		}
		String info = inicio.info;
		inicio = inicio.proximo;
		tamanho--;
		return info;
	}
	
	public void inserirFim(String info) {
		
		
		
	}
	
	public String toString() {
		String lista = "(" + tamanho + ")";
		No local = inicio;
		while(local != null) {
			lista += local.info + " ";
			local = local.proximo;
		}
		return lista;
		
	}
	
	public static void main(String[] args) {
		Lista l = new Lista();
		System.out.println(l);
		l.inserirInicio("a");
		System.out.println(l);
		l.inserirInicio("b");
		System.out.println(l);
		l.inserirInicio("c");
		System.out.println(l);
		
		
		while ((l.retirarIncio())!= null) {
			System.out.println(l);
		}
		
		
	}
	
}
