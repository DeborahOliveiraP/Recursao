package listaDuplamenteCircular;

public class MainLDC {
 public static void main(String[] args) {
	 
	
	LDC l = new LDC(); // nova lista duplamente circurlar (uma nova entidade)
	Pessoa p = new Pessoa(); // aqui voce bota os registros da pessoa
	p.nome = "Deborah";
	p.idade = 19;
	l.informacao = p;
	l.proximo = null;
	
	LDC l1 = new LDC(); 
	Pessoa p1 = new Pessoa(); 
	p1.nome = "ricardo";
	p1.idade = 32;
	l1.informacao = p1;
	l1.anterior= l; //aqui voce bota quem e o anteriror de l1
	l.proximo = l1; //aqui ele vai botar em l que l1 e o proximo dele/que esta na frente dele
	
	LDC l2 = new LDC(); 
	Pessoa p2 = new Pessoa(); 
	p2.nome = "jonas";
	p2.idade = 17;
	l2.informacao = p2;
	l2.anterior= l1;
	l1.proximo = l2;
	
	LDC l3 = new LDC(); 
	Pessoa p3 = new Pessoa(); 
	p3.nome = "lucia";
	p3.idade = 20;
	l3.informacao = p3;
	l3.anterior= l2;
	l2.proximo = l3;
	
	LDC l4 = new LDC(); 
	Pessoa p4 = new Pessoa(); 
	p4.nome = "iara";
	p4.idade = 23;
	l4.informacao = p4;
	l4.anterior= l3;	
	l3.proximo = l4;
	
	
	l4.proximo = l;
    l.anterior = l4;
	
	imprimeLDC(l);
 }


 public static void imprimeLDC(LDC l) {
  
	 
	if(l != null ) {
	System.out.println("Nome: "+l.informacao.nome);
	System.out.println("Idade: "+l.informacao.idade);
	
	if(l.anterior != null) {
		System.out.println("Proximo: "+l.proximo.informacao.nome);
		System.out.println("Anterior: "+l.anterior.informacao.nome);
		System.out.println("==========");
		
	}

		else{
			System.out.println("Proximo: "+l.proximo.informacao.nome);
			System.out.println("Anterior: null");
			System.out.println("==========");
			
			
			//fiverr.	
		}
	}
	
	if(l != null) {
		   imprimeLDC(l.proximo);
		   }
		  
 }
}
