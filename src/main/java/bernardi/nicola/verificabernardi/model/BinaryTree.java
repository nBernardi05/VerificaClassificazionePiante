package bernardi.nicola.verificabernardi.model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
/**
 *
 * @author bernardi.nicola
 */
public class BinaryTree<E> implements Iterable<E> {
    private E element;
    private BinaryTree<E> left, right;

    public BinaryTree(E element, BinaryTree<E> left, BinaryTree<E> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
    
    public int hTree(){
        int l=0, r=0;
        if(this.element==null)
            return 0;
        else if(this.right==null&&this.left!=null)
            l = 1+this.left.hTree();
        else if(this.right!=null&&this.left==null)
            r = 1+this.right.hTree();
        else if(this.right!=null&&this.left!=null){
            r = 1+this.right.hTree();
            l = 1+this.left.hTree();
        }
        if(r>l)
            return r;
        return l;
    }
    
    /*public int bTree(E element){
        int l=-1, r=-1;
        if(this.element==null&&(r==l||r==1+l||r==l-1))
            return 1;
        else if(this.element==null&&!(r==l||r==1+l||r==l-1))
            return 0;
        else if(this.right==null&&this.left!=null)
            l = 1+this.left.hTree();
        else if(this.right!=null&&this.left==null)
            r = 1+this.right.hTree();
        else if(this.right!=null&&this.left!=null){
            r = 1+this.right.hTree();
            l = 1+this.left.hTree();
        }
        if(r==l||r==1+l||r==l-1)
            return 1;
        */
    public int bTree(){
        int l=-1, r=-1;
        if(this.element==null&&(r==l||r==1+l||r==l-1))
            return 1;
        else if(this.element==null&&!(r==l||r==1+l||r==l-1))
            return 0;
        else if(this.right==null&&this.left!=null)
            l = 1+this.left.hTree();
        else if(this.right!=null&&this.left==null)
            r = 1+this.right.hTree();
        else if(this.right!=null&&this.left!=null){
            r = 1+this.right.hTree();
            l = 1+this.left.hTree();
        }
        if(r==l||r==1+l||r==l-1)
            return 1;
        return 0;
    }

    public BinaryTree(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public BinaryTree<E> getLeft() {
        return left;
    }
    public boolean isEmpty(){
        return element ==null && left==null && right == null;
    }

    public void setLeft(BinaryTree<E> left) {
        this.left = left;
    }

    public BinaryTree<E> getRight() {
        return right;
    }

    public void setRight(BinaryTree<E> right) {
        this.right = right;
    }
    public ArrayList<E> listaIn(){
        ArrayList<E> ar = new ArrayList<>();
        if(left!=null){
            ar.addAll(left.listaIn());
        }
        ar.add(element);
        if(right!=null){
            ar.addAll(right.listaIn());
        }
        return ar;
    }

    @Override
    public Iterator<E> iterator() {
        return new InorderIterator(this);
    }
    //-----------------------------------------------
    private static class InorderIterator<E> implements Iterator<E> {

        private BinaryTree<E> current;
        private Stack<BinaryTree<E>> stack;

        public InorderIterator(BinaryTree<E> root) {
            this.current = root;
            stack = new Stack<>();
            moveLeft(root);
        }

        private void moveLeft(BinaryTree<E> current) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.empty();
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            BinaryTree<E> current = stack.pop();
            if(current.getRight()!=null){
                moveLeft(current.getRight());
            }
            return current.getElement();
        }
    }
    /* ------------------------------------------------------- */
	public void test(){
		//inserire il codice per i test
		//richiamare questo metodo dal main dell'applicazione
                System.out.println("Altezza dell'albero: "+this.hTree());
                if(this.bTree()==0)
                    System.out.print("Non ");
                System.out.println("è bilanciato");
	}
}
