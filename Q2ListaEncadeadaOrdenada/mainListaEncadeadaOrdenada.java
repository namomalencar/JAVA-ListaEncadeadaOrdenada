package Q2ListaEncadeadaOrdenada;

public class mainListaEncadeadaOrdenada {

	public static void main(String[] args) {
		ListaEncadeadaOrdenada lista = new ListaEncadeadaOrdenada();

		// Criar lista
		System.out.println("=====================================");
		// Verificar se vazio
		// Sim, deve está vazia
		lista.isEmpty();
		System.out.println("=====================================");
		// Inserções
		lista.insert(13);
		lista.insert(20);
		lista.insert(11);
		lista.insert(19);
		for (int i = 1; i <= 5; i++) {
			lista.insert(i);
		}
		System.out.println("=====================================");
		// Print lista iterativamente
		lista.printIterativo();
		System.out.println("=====================================");
		// Print lista recursivamente
		lista.printRecursivo();
		System.out.println("=====================================");
		// Print lista recursivamente reverso, da cauda para a cabeça
		lista.printReverso();
		System.out.println("=====================================");
		// Verificar se está vazia
		lista.isEmpty();
		System.out.println("=====================================");
		// Verificar se tem determinado elemento, se retorna null não tem
		int busca = 4;
		No no = (No) lista.getElementOnList(busca);
		if (no != null) {
			System.out.println("Elemento " + no.getValue() + " encontrado");
		} else {
			System.out.println("Elemento " + busca + " NÃO encontrado");
		}
		System.out.println("=====================================");
		// Verificar se tem determinado elemento, se retorna null não tem
		busca = 999;
		no = (No) lista.getElementOnList(999);
		if (no != null) {
			System.out.println("Elemento" + no.getValue() + " encontrado");
		} else {
			System.out.println("Elemento " + busca + " NÃO encontrado");
		}
		System.out.println("=====================================");
		// Remover elemento iterativamente
		int remove = 2;
		lista.removeElementOnListIterativo(remove);
		System.out.println("=====================================");
		remove = 999;
		lista.removeElementOnListIterativo(remove);
		System.out.println("=====================================");
		// Print lista iterativamente
		lista.printIterativo();
		System.out.println("=====================================");
		// Remoção elemento recursiva
		remove = 4;
		lista.removeElementOnListRecursivo(remove);
		System.out.println("=====================================");
		lista.printIterativo();
		System.out.println("=====================================");
		// Remoção elemento recursiva
		remove = 999;
		lista.removeElementOnListRecursivo(remove);
		System.out.println("=====================================");
		lista.printIterativo();
		System.out.println("=====================================");
		// Verificar se duas listas são iguais
		ListaEncadeadaOrdenada lista2 = new ListaEncadeadaOrdenada();
		lista2.insert(1);
		lista2.insert(3);
		lista2.insert(5);
		lista2.insert(11);
		lista2.insert(13);
		lista2.insert(19);
		lista2.insert(20);
		if (lista.listaIgualIterativo(lista, lista2)) {
			System.out.println("Correto - As duas listas são iguais - Iterativo");
		} else {
			System.out.println("Listas Diferentes");
		}
		System.out.println("=====================================");
		if (lista.listaIgualRecursivo(lista, lista2)) {
			System.out.println("Correto - As duas listas são iguais - Recursivo");
		} else {
			System.out.println("Listas Diferentes");
		}
		System.out.println("=====================================");
		System.out.println("Lista 1");
		lista.printIterativo();
		System.out.println("=====================================");
		System.out.println("Lista 2");
		lista2.printIterativo();
		// Remover elemento para torna-las diferentes
		System.out.println("=====================================");
		System.out.println("Removendo elemento 19 e 1 da lista 2");
		lista2.removeElementOnListIterativo(19);
		lista2.removeElementOnListIterativo(1);
		if (lista.listaIgualIterativo(lista, lista2)) {
			System.out.println("As duas listas são iguais");
		} else {
			System.out.println("Correto - Listas Diferentes - Iterativo");
		}
		System.out.println("=====================================");
		if (lista.listaIgualRecursivo(lista, lista2)) {
			System.out.println("As duas listas são iguais");
		} else {
			System.out.println("Correto - Listas Diferentes - Recursivo");
		}
		System.out.println("=====================================");
		System.out.println("Lista 1");
		lista.printIterativo();
		System.out.println("=====================================");
		System.out.println("Lista 2");
		lista2.printIterativo();
		lista.clear();
		lista2.clear();
	}
}
