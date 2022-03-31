package atvHeraditaria;

public class Heraquia {
	
	public static void imprimeFilhos(Pessoa pai) {

	     if(pai.filhoA!=null || pai.filhoB!=null ) {
				System.out.println("-----------------------");
				System.out.println("Pai: "+pai.nome);
				System.out.println("FilhoA: "+pai.filhoA.nome);
				System.out.println("FilhoB: "+pai.filhoB.nome);
				
			   if(pai.filhoA != null) 
				imprimeFilhos(pai.filhoA);
				
				if(pai.filhoB!=null) 
				imprimeFilhos(pai.filhoB);
	
			}
		}

	public static void main(String[]args) {
		//Pai
		Pessoa p0=new Pessoa();
		p0.nome="Adao";
		p0.filhoA=null;
		p0.filhoB=null;
		p0.ancestral=null;
		
		//Filho AdaoA
		Pessoa p01=new Pessoa();
		p01.nome="Miranda";
		p01.filhoA=null;
		p01.filhoB=null;
		p01.ancestral=p0;
		
		p0.filhoA=p01;
		
		//Filho AdaoB
		Pessoa p02=new Pessoa();
		p02.nome="Marcos";
		p02.filhoA=null;
		p02.filhoB=null;
		p02.ancestral=p0;
		
		p0.filhoB=p02;
		
		
		//Miranda FilhoA
		Pessoa p03=new Pessoa();
		p03.nome="Jose";
		p03.filhoA=null;
		p03.filhoB=null;
		p03.ancestral=p01;
		
		p01.filhoA=p03;
		
		//Miranda FilhoB
		Pessoa p04=new Pessoa();
		p04.nome="Aurora";
		p04.filhoA=null;
		p04.filhoB=null;
		p04.ancestral=p01;
		
		p01.filhoB=p04;
		
		//Marcos FilhoA
		Pessoa p05=new Pessoa();
		p05.nome="Amanda";
		p05.filhoA=null;
		p05.filhoB=null;
		p05.ancestral=p02;
				
		p02.filhoA=p05;
		
		//Marcos FilhoB
		Pessoa p06=new Pessoa();
		p06.nome="Gabriel";
		p06.filhoA=null;
		p06.filhoB=null;
		p06.ancestral=p02;
				
		p02.filhoB=p06;
		
		
		imprimeFilhos(p0);

	 
		
		 
		
		
	}

}