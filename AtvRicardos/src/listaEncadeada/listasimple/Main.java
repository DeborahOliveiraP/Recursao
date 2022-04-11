package listaEncadeada.listasimple;

public class Main {
	
	
	
	public static void main(String[] args) {
		
		ListaSimples ls =new ListaSimples();
		PessoaS p=new PessoaS();
		p.nome="Fulano";
		p.idade= 23;
	    ls.informacao=p;
		
		ListaSimples ls1=new ListaSimples();
		PessoaS p1=new PessoaS();
		p1.nome="Ciclano";
		p1.idade= 18;
		ls1.informacao=p1;
		ls.proximo=ls1;
		
		ListaSimples ls2 =new ListaSimples();
		PessoaS p2=new PessoaS();
		p2.nome="Fulano";
		p2.idade= 23;
		ls2.informacao=p2;
		ls1.proximo=ls2;
		
		ListaSimples ls3=new ListaSimples();
		PessoaS p3=new PessoaS();
		p3.nome="Ciclano";
		p3.idade= 18;
		ls3.informacao=p3;
		ls2.proximo=ls3;

		System.out.println(ls.informacao.nome);
		System.out.println(ls.informacao.idade);
		System.out.println(ls.proximo.informacao.nome);
		System.out.println(ls.proximo.informacao.idade);
		}
}