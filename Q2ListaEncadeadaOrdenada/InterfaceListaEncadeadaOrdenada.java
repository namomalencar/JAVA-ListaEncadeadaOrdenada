package Q2ListaEncadeadaOrdenada;

public interface InterfaceListaEncadeadaOrdenada {

	// Cria uma lista
	// Quando cria o objeto

	// Insere elemento no inicio
	public int insert(int value);

	// Imprimir os valores armazenados na lista;
	public void printIterativo();

	// Imprimir os valores armazenados na lista usando recurs�o;
	public void printRecursivo();

	// Imprimir os valores armazenados na lista em ordem reversa (da cauda para
	// a cabe�a da lista);
	public void printReverso();

	// Verificar se a lista est� vazia (retorna 1 se vazia ou 0 se n�o vazia);
	public boolean isEmpty();

	// Recuperar/Buscar um determinado elemento da lista;
	public Object getElementOnList(int value);

	// Remover um determinado elemento da lista;
	public void removeElementOnListIterativo(int value);

	// Remover um determinado elemento da lista usando recurs�o;
	public void removeElementOnListRecursivo(int value);

	// Liberar a lista;
	public void clear();

	// Verificar se as listas s�o iguais iterativamente;
	public boolean listaIgualIterativo(Object lista1, Object lista2);

	// Verificar se as listas s�o iguais recursivamente;
	public boolean listaIgualRecursivo(Object lista1, Object lista2);

}
