package lham.projects.lambda.casadocodigo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		forEachTradicional(usuarios);
		consumer(usuarios);
		lambda(usuarios);
	}
	
	private static void forEachTradicional(List<Usuario> usuarios) {
		System.out.println("#1 -- FOR EACH tradicional");
		System.out.println("--------------------------");
		
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}
		
		System.out.println("--------------------------");
	}
	
	private static void consumer(List<Usuario> usuarios) {
		System.out.println("#2 -- Consumer");
		System.out.println("--------------------------");
		
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario usuario) {
				System.out.println(usuario.getNome());
			}
		});
		
		System.out.println("--------------------------");
	}
	
	private static void lambda(List<Usuario> usuarios) {
		System.out.println("#3 -- Lambda");
		System.out.println("--------------------------");
		usuarios.forEach(usuario -> {
			System.out.println(usuario.getNome());
		});
		System.out.println("--------------------------");
	}
}