package listaEncadeada.listaduplamenteligada;

public class Main {

public static void main(String[]args) {
	
	ListaDupla ld =new ListaDupla();
	PessoaD p=new PessoaD();
	p.nome="Fulano";
	p.idade = 18;
	ld.informacao= p;
	ld.proximo=null;
	
	ListaDupla ld1=new ListaDupla();
	PessoaD p1=new PessoaD();
	p1.nome="Ciclano";
	ld1.informacao=p1;
	ld1.anterior= ld;
	
	ld.proximo=ld1;
	ld1.proximo=ld;
	
		if(ld.anterior == null || ld.proximo == null) {
			System.out.println("Nome: "+ld.informacao.nome);
			System.out.println("Proximo: "+ld.proximo.informacao.nome);
			System.out.println("------------");
		}
	
	if (ld1.anterior != null || ld1.proximo != null) {
	System.out.println("Nome: "+ld1.informacao.nome);
	System.out.println("Proximo: "+ld1.proximo.informacao.nome);
	System.out.println("Anterior: "+ld1.anterior.informacao.nome);
	System.out.println("------------");
	}
	
	}
}