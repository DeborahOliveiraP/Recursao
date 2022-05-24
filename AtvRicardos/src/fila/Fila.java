package fila;

public class Fila {

	No inicio = null;
	int tamanho = 0;
	
	//enserir na fila
	public void inserirInicio(String info) {
		 No no = new No();
		 
		 no.info= info;
		 no.proximo= inicio;
		 inicio = no;
		 tamanho++;
	}
	
	//retirar na fila
	public String retirarIncio() {
		if (inicio == null) {
			return null;
		}
		
		String info = inicio.info;
		inicio = inicio.proximo;
		tamanho--;
		return info;
	}
	
	public String toString() {
		String fila = "(" + tamanho + ")";
		No local = inicio;
		while(local != null) {
			fila += local.info + " ";
			local = local.proximo;
		}
		return fila;
		
	}
	
	public static void main(String[] args) {
		Fila f = new Fila(); 
		
		System.out.println(f);//entrou na fila
		f.inserirInicio("a");// nome a
		
		System.out.println(f);// entrou na fila
		f.inserirInicio("b");// nome b
		
		System.out.println(f);// entrou na fila
		f.inserirInicio("c");// nome c
		
		System.out.println(f);// entrou na fila
		f.retirarIncio();// retira c
		
		System.out.println(f);// entrou na fila
		f.inserirInicio("d");// nome d
		System.out.println(f);// entrou na fila
	}
	
}
