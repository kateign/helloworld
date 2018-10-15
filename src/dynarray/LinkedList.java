package dynarray;

public class LinkedList {

	Node first; //Създавам характеристика first, която ще се отнася за бръмката, но е характеристика на LinkedList;
	int size; //Някаква неясна стойност;

	public LinkedList() { //Създава LinkedList с размер 0 и характеристика first, която още никъде не сочи = null;
		size = 0; //размер 0;default-nata stoinost taka i taka e null, nqma nujda da go pishem;
		first = null; //ima dryjka, ama ne sochi kym nishto, zashtoto oshte nishto nqma syzdadeno;default-nata stoinost taka i taka e null, nqma nujda da go pishem;
	}

	public void add(int value) {//Добавяме един node със стойност value НАКРАЯ;
		Node node = new Node(value); //Създаваме бръмка;

		if (first == null) { //Ако характеристиката first все още не сочи към нищо, тази явно е първа и тя ще е first.
			//Дръжката ще сочи към нея;;
			first = node; //Дръжката за първо да сочи към това.
			return; //Излизаме от метода;
		}

		// Finding the last node
		Node last = get(size - 1);
		last.setNext(node); //Вече като е стигнало последната, next za last da sochi kym node.
		//???node.setNext(null); - default-nata stoinost taka i taka e null, nqma nujda da go pishem;
		size++; //Увеличи размера на LnkedList с 1.
	}

	public void insert(int value, int pos) {
		Node nodeAtPos = get(pos - 1);

		Node nodeToInsert = new Node(value, nodeAtPos.getNext());
		nodeAtPos.setNext(nodeToInsert);
		size++;
	}

	public void remove(int pos) {
		if (pos < 0 || pos > size - 1)
			throw new ArrayIndexOutOfBoundsException(pos);

		if (size == 1) {
			first = null;
			size--;
			return;
		}

		if (pos == 0) {
			first = first.getNext();//???=null;
			size--;
			return;
		}

		if (size > pos+1) {
			Node beforeRemove = get(pos - 1);
			beforeRemove.setNext(beforeRemove.getNext().getNext());
			size--;
		}
	}

	/**
	 * Gets the node at position pos
	 * @param pos - the position
	 * @return the Node at the specified position
	 */
	private Node get(int pos) {
		if (pos < 0 || pos > size - 1)
			throw new ArrayIndexOutOfBoundsException(pos);

		int counter = 0;
		Node ourEl = first;

		while (counter++ < pos) {
			ourEl = ourEl.getNext();
		}
		return ourEl;
	}
}
