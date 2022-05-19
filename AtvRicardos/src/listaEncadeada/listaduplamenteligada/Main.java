package listaEncadeada.listaduplamenteligada;

public class Main {

public static void main(String[]args) {
	
	ListaDupla ld =new ListaDupla();
	PessoaD p=new PessoaD();
	p.nome="Fulano";
	p.idade = 18;
	ld.informacao= p;
	ld.proximo= null;
	
	ListaDupla ld1=new ListaDupla();
	PessoaD p1=new PessoaD();
	p1.nome="Ciclano";
	p1.idade = 23;
	ld1.informacao=p1;
	ld1.anterior= ld;
	ld.proximo=ld1;
	
	ListaDupla ld2=new ListaDupla();
	PessoaD p2=new PessoaD();
	p2.nome="Ciclaninho";
	p2.idade= 19;
	ld2.informacao=p2;
	ld2.anterior= ld1;
	ld1.proximo= ld2;
	
	ListaDupla ld3=new ListaDupla();
	PessoaD p3=new PessoaD();
	p3.nome="Ciclaninha";
	p3.idade= 15;
	ld3.informacao=p3;
	ld3.anterior= ld2;
	ld2.proximo= ld3;
	
	imprimeListaDupla(ld);
   }


   public static void imprimeListaDupla(ListaDupla ld) {
    
	 
	if(ld != null ) {
	System.out.println("Nome: "+ld.informacao.nome);
	System.out.println("Idade: "+ld.informacao.idade);
	
     
	if(ld.anterior != null) {
		System.out.println("Anterior: "+ld.anterior.informacao.nome);
		System.out.println("==========");
	}

		else{
			System.out.println("Anterior: null");
			System.out.println("==========");
			
			//fiverr.	
		}
	}
 
	
	/*
	if(ld != null ) {
		System.out.println("Nome: "+ld.informacao.nome);
		System.out.println("Idade: "+ld.informacao.idade);
		System.out.println("==========");
	     
		if(ld.anterior != null) {
			System.out.println("Nome: "+ld.informacao.nome);
			System.out.println("Idade: "+ld.informacao.idade);
			System.out.println("Anterior de "+ld.informacao.nome+": "+ld.anterior.informacao.nome);
			System.out.println("==========");
		
			if (ld.anterior == null) {
				System.out.println("Nome: "+ld.informacao.nome);
				System.out.println("Idade: "+ld.informacao.idade);
				System.out.println("Anterior: null");
				System.out.println("==========");
				
					
			}
		}
	   } 
  */

   if(ld != null) {
   imprimeListaDupla(ld.proximo);
   }
   
 
   }
}