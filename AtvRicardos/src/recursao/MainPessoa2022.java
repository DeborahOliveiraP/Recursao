package recursao;

public class MainPessoa2022 {

		public static void imprimeFilhos(Pessoa pai) {

				if(pai.filhoA!=null || pai.filhoB!=null ) {
					
					 if(pai.filhoA != null) {
							imprimeFilhos(pai.filhoA);
				           }
					 
			           if(pai.ancestral == null) {
			        	   System.out.println("Pai: "+pai.nome);
							System.out.println("FilhoA: "+pai.filhoA.nome);
							System.out.println("Ancestral: N/A ");	
							System.out.println("-----------------------");
					
			           }
							else {
								
								System.out.println("Pai: "+pai.nome);
								System.out.println("FilhoA: "+pai.filhoA.nome);
								System.out.println("Ancestral: "+pai.ancestral.nome);
								System.out.println("-----------------------");
							
							}
				   }
			}
			



		public static void main(String[]args) {
			Pessoa p7=new Pessoa();
			p7.nome="Adao ";
			p7.filhoA=null;
			p7.filhoB=null;
			p7.ancestral=null;
			
			Pessoa p0=new Pessoa();
			p0.nome="Cain";
			p0.filhoA=null;
			p0.filhoB=null;
			p0.ancestral=p7;
			
			p7.filhoA=p0;
			
			
			Pessoa p01=new Pessoa();
			p01.nome="Cain Filho";
			p01.filhoA=null;
			p01.filhoB=null;
			p01.ancestral=p0;
			
			p0.filhoA=p01;
			
			Pessoa p001=new Pessoa();
			p001.nome="Cain Neto";
			p001.filhoA=null;
			p001.filhoB=null;
			p001.ancestral=p01;
			
			p01.filhoA=p001;
			
			Pessoa p0012=new Pessoa();
			p0012.nome="Noé";
			p0012.filhoA=null;
			p0012.filhoB=null;
			p0012.ancestral=p001;
			
			p001.filhoA=p0012;
			
			Pessoa p00123=new Pessoa();
			p00123.nome="Thor";
			p00123.filhoA=null;
			p00123.filhoB=null;
			p00123.ancestral=p0012;
			
			p0012.filhoA=p00123;
			
			imprimeFilhos(p7);
		 
			
			 
			
			
		}

	}

