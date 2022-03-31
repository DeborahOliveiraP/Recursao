package atv;


import java.util.ArrayList;
public class Servicos {

	public static void main(String[] args) {	
		ArrayList<Informacao> Animais = new ArrayList <>();
		
		Informacao Bella = new Informacao();
		Informacao Amora = new Informacao();
		Informacao Max = new Informacao();
		Informacao Millo = new Informacao();
		Informacao Maui = new Informacao();
		
		Bella.setSom("au au");
		Bella.setNome("Bella");
		Bella.setTipo("Cachorro");
		Bella.setIdade(5);
		
		Amora.setSom("miau");
		Amora.setNome("Amora");
		Amora.setTipo("gato");
		Amora.setIdade(6);
		
		Max.setSom("piu piu");
		Max.setNome("Max");
		Max.setTipo("passaro");
		Max.setIdade(2);
		
		Millo.setSom("bloob bloob");
		Millo.setNome("Millo");
		Millo.setTipo("peixe");
		Millo.setIdade(10);
		
		Maui.setSom("coo cooo");
		Maui.setNome("Maui");
		Maui.setTipo("coruja");
		Maui.setIdade(3);
		
		
		Animais.add(Bella);
		Animais.add(Amora);
		Animais.add(Max);
		Animais.add(Millo);
		Animais.add(Maui);
		
		for(int i = 0; 1 <= Animais.size(); i++) {
			System.out.println(" " + Animais.get(i).getSom());
			System.out.println("Tipo: " + Animais.get(i).getTipo());
			System.out.println("Nome: " + Animais.get(i).getNome());
			System.out.println("Idade: " + Animais.get(i).getIdade());
			System.out.println("\n");
		}
	}

}
