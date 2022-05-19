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
		p2.nome="Fulaninho";
		p2.idade= 23;
		ls2.informacao=p2;
		ls1.proximo=ls2;
		
		ListaSimples ls3=new ListaSimples();
		PessoaS p3=new PessoaS();
		p3.nome="Ciclaninho";
		p3.idade= 18;
		ls3.informacao=p3;
		ls2.proximo=ls3;
        
		imprimeListaSimples(ls);
		}

	
	public static void imprimeListaSimples(ListaSimples ls) {
		if(ls != null) {
			System.out.println("Nome: "+ls.informacao.nome);
			System.out.println("Idade: "+ls.informacao.idade);
			System.out.println("=========");
			imprimeListaSimples(ls.proximo);
		}
		else {
			System.out.println("Nao tem info");
		}
		
		
		//try catch
		//hibernate
		//tomcat
		//mvc
		//maven
		//mysql

		
	}
}