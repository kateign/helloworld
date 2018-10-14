package dynarray;

public class LinkedList {

    Node first; //Създавам характеристика first, която ще се отнася за бръмката, но е характеристика на LinkedList;
    Node last;
    int size; //Някаква неясна стойност;
    
    public LinkedList() { //Създава LinkedList с размер 0 и характеристика first, която още никъде не сочи = null;
        size = 0; //размер 0;
        first = null; //не сочи никъде;
    }
    
    public void add(int value) {//Добавяме един node със стойност value НАКРАЯ;
        Node node = new Node(value); //Създаваме бръмка;
        
        if (first == null) { //Ако характеристиката first все още не сочи към нищо, тази явно е първа и тя ще е first.
            //Дръжката ще сочи към нея;;
            first = node; //Дръжката за първо да сочи към това.
            return; //Излизаме от метода;
        }

        // Finding the last node
        last = first; //Ако не е първа, трябва да търсим коя е последната, за да insert-нем след нея;
        //Започваме обхождане за търсене на last от първата.
           while(last.getNext() != null) { //Докато не сме намерили последната, 
            last = last.getNext(); //премествай към следващата.
        }
        last.setNext(node); //Вече като е стигнало последната, премести дръжката с надпис последна на следващата, която insert-ваме;
        size++; //Увеличи размера на LnkedList с 1.
    }
}
