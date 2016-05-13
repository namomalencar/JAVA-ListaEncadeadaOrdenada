package Q2ListaEncadeadaOrdenada;

public class ListaEncadeadaOrdenada implements InterfaceListaEncadeadaOrdenada {

	// Referência para a cabeça da lista
	private No cabeca = null;


	@Override
	public int insert(int value) {
		// TODO Auto-generated method stub
		No newNo = new No();
		No ant = null;
		No aux = cabeca;
		while (aux != null && aux.getValue() < value) {
			ant = aux;
			aux = aux.getNext();
		}
		newNo.setValue(value);
		if (ant == null) {
			cabeca = newNo;
			cabeca.setNext(aux);
		} else {
			newNo.setNext(ant.getNext());
			ant.setNext(newNo);
		}
		return 0;
	}

	@Override
	public void printIterativo() {
		// TODO Auto-generated method stub
		No iterativo = new No();
		iterativo = cabeca;
		int i = 1;
		while (iterativo != null) {
			System.out.println("Iterativo - Elemento " + i + " da lista é: " + iterativo.getValue());
			iterativo = iterativo.getNext();
			i++;
		}

	}

	@Override
	public void printRecursivo() {
		// TODO Auto-generated method stub
		printRecursivoInterno(1, cabeca);
	}

	private void printRecursivoInterno(int i, No no) {
		// TODO Auto-generated method stub
		if (no != null) {
			System.out.println("Recursivo - Elemento " + i + " da lista é: " + no.getValue());
			i++;
			printRecursivoInterno(i, no.getNext());
		}
	}

	@Override
	public void printReverso() {
		// TODO Auto-generated method stub
		printReversoInterno(0, cabeca);
	}

	private void printReversoInterno(int i, No no) {
		// TODO Auto-generated method stub
		if (no != null) {
			i++;
			printReversoInterno(i, no.getNext());
			System.out.println("Reverso Recursivo - Elemento " + i + " da lista é: " + no.getValue());
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (cabeca == null) {
			System.out.println("Lista vazia");
			return true;
		} else {
			System.out.println("A lista não é vazia");
			return false;
		}
	}

	@Override
	public Object getElementOnList(int elemento) {
		// TODO Auto-generated method stub
		// Recursivo, mais elegante
		return getElementOnListInterno(elemento, cabeca);
	}

	private Object getElementOnListInterno(int elemento, No no) {
		// TODO Auto-generated method stub
		if (no.getValue() == elemento) {
			return no;
		} else {
			if (no.getNext() == null) {
				return null;
			} else {
				return getElementOnListInterno(elemento, no.getNext());
			}
		}
	}

	@Override
	public void removeElementOnListIterativo(int value) {
		// TODO Auto-generated method stub
		No ant = null;
		No atual = cabeca;
		while (atual != null && atual.getValue() != value) {
			ant = atual;
			atual = atual.getNext();
		}
		if (atual == null) {
			System.out.println("Elemento com valor " + value + " não pode ser removido, pois não existe na lista");
		} else {
			// O elemento a ser removido é a cabeça então cabeça recebe o
			// proximo
			if (ant == null) {
				System.out.println("Elemento com valor " + atual.getValue() + " removido");
				cabeca = atual.getNext();
			} else {
				// Remove o elemento atual, set o anterior para o next do atual
				System.out.println("Elemento com valor  " + atual.getValue() + " removido");
				ant.setNext(atual.getNext());
			}
		}
	}

	@Override
	public void removeElementOnListRecursivo(int value) {
		cabeca = (No) removeElementOnListRecursivoInterno(cabeca, value);
	}

	private Object removeElementOnListRecursivoInterno(No no, int value) {
		// TODO Auto-generated method stub
		if (!isEmpty()) {
			// Se o nó a ser retirado é o primeiro
			if (no.getValue() == value) {
				// No iterativo = new No();
				// iterativo = cabeca;
				no = no.getNext();
				System.out.println("Valor " + value + " retirado RECURSIVAMENTE com sucesso");
			} else {
				if (no.getNext() != null) {
					no.setNext((No) removeElementOnListRecursivoInterno(no.getNext(), value));
				} else {
					System.out.println("O elemento " + value + " não existe na lista");
				}
			}
		}
		return no;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		No iterativo = new No();
		iterativo = cabeca;
		while (iterativo != null) {
			cabeca = iterativo;
			iterativo = cabeca.getNext();
			cabeca = null;
		}
		System.out.println("Limpeza da lista efetuada com sucesso");
	}

	@Override
	public boolean listaIgualIterativo(Object lista1, Object lista2) {
		// TODO Auto-generated method stub
		No aux1 = new No();
		No aux2 = new No();
		aux1 = ((ListaEncadeadaOrdenada) lista1).getCabeca();
		aux2 = ((ListaEncadeadaOrdenada) lista2).getCabeca();
		while (aux1 != null && aux2 != null) {
			if (aux1.getValue() != aux2.getValue()) {
				return false;
			}
			aux1 = aux1.getNext();
			aux2 = aux2.getNext();
		}
		return true;
	}

	@Override
	public boolean listaIgualRecursivo(Object lista1, Object lista2) {
		// TODO Auto-generated method stub
		boolean igual = listaIgualRecursivoInterno(((ListaEncadeadaOrdenada) lista1).getCabeca(),
				((ListaEncadeadaOrdenada) lista2).getCabeca());
		return igual;
	}

	private boolean listaIgualRecursivoInterno(No aux1, No aux2) {
		// TODO Auto-generated method stub
		if (aux1 == null && aux2 == null) {
			return true;
		} else {
			if ((aux1 == null && aux2 != null) || (aux1 != null && aux2 == null)) {
				return false;
			} else {
				return listaIgualRecursivoInterno(aux1.getNext(), aux2.getNext());
			}
		}
//		 true;
	}

	public No getCabeca() {
		return cabeca;
	}

	public void setCabeca(No cabeca) {
		this.cabeca = cabeca;
	}

}
