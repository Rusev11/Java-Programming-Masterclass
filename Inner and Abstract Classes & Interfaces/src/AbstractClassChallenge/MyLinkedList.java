package AbstractClassChallenge;

public class MyLinkedList implements NodeList {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    newItem.setNext(currentItem);
                    newItem.setPrevious(currentItem.previous());
                    currentItem.previous().setNext(newItem);
                } else {
                    this.root = newItem;
                    newItem.setNext(currentItem);
                }
                currentItem.setPrevious(newItem);
                return true;
            } else {
                System.out.println(newItem.getValue() + "is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo((item));
            if(comparison == 0){
                if(currentItem == this.root){
                    this.root = currentItem.next();
                    this.root.setPrevious(null);
                    return true;
                }
                if (currentItem.next() != null){
                    currentItem.previous().setNext(currentItem.next());
                    currentItem.next().setPrevious(currentItem.previous());
                } else {
                    currentItem.previous().setNext(null);
                }
                return true;
            } else if (comparison<0){
                currentItem = currentItem.next();
            } else {
                System.out.println("There is no such item");
                return false;
            }

        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
            return;
        }
        while (root != null) {
            System.out.println(root.getValue());
            root = root.next();
        }
    }
}
