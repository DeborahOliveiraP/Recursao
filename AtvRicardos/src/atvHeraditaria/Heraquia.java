package atvHeraditaria;

public class Heraquia {
	
	public static void imprimeFilhos(Pessoa pai) {

		/* Rodar apenas Filhos A & B
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
		}*/
	
//Roda Pai,Filhos A/B, e Ancestrais 
	if(pai.filhoA!=null || pai.filhoB!=null ) {
		
		 if(pai.filhoA != null) {
				imprimeFilhos(pai.filhoA);
		 }    
		 
		 if(pai.filhoB!=null) { 
				imprimeFilhos(pai.filhoB);
	}
           if(pai.ancestral != null) {
				System.out.println("Pai: "+pai.nome);
				System.out.println("FilhoA: "+pai.filhoA.nome);
				System.out.println("FilhoB: "+pai.filhoB.nome);
				System.out.println("Ancestral: "+pai.ancestral.nome);	
				System.out.println("-----------------------");
           }
				else {
					System.out.println("Pai: "+pai.nome);
					System.out.println("FilhoA: "+pai.filhoA.nome);
					System.out.println("FilhoB: "+pai.filhoB.nome);
					System.out.println("Ancestral: N/A ");	
					System.out.println("-----------------------");
				}
					
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
		
		//Amanda FilhoA
		Pessoa p07=new Pessoa();
		p07.nome="Ana Clara";
		p07.filhoA=null;
		p07.filhoB=null;
		p07.ancestral=p05;
				
		p05.filhoA=p07;
		
		//Amanda FilhoB
		Pessoa p08=new Pessoa();
		p08.nome="Julia";
		p08.filhoA=null;
		p08.filhoB=null;
		p08.ancestral=p05;
						
		p05.filhoB=p08;
				
		//Gabriel FilhoA
		Pessoa p09=new Pessoa();
		p09.nome="Gabriel Junior";
		p09.filhoA=null;
		p09.filhoB=null;
		p09.ancestral=p06;
				
		p06.filhoA=p09;
		
		//Gabriel FilhoB
		Pessoa p010=new Pessoa();
		p010.nome="Pedro";
		p010.filhoA=null;
		p010.filhoB=null;
		p010.ancestral=p06;
				
		p06.filhoB=p010;
		
		imprimeFilhos(p0);

		//Jose FilhoA
		Pessoa p011=new Pessoa();
		p011.nome="Laura";
		p011.filhoA=null;
		p011.filhoB=null;
		p011.ancestral=p03;
			
		p03.filhoA=p011;
		
		//Jose FilhoB
		Pessoa p012=new Pessoa();
		p012.nome="Maria";
		p012.filhoA=null;
		p012.filhoB=null;
		p012.ancestral=p03;
	 
		p03.filhoB=p012;
		
		 
		
		
	}

}