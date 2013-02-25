package alchhelper_draft2;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.AbstractListModel;
import javax.swing.JList;

/**
 * 25 Feb 2013
 *
 * @version 1
 * @author Jaska Börner
 * @author Ivan Khoprov
 *
 * This is our attempt at making a decent, sortable list-view model for all the
 * items (results)...
 */
public class ItemList extends JList implements Observer {

    public ArrayList<Item> listmodel;
    public int category;

    public ItemList(int category) {
        this.setBorder(javax.swing.BorderFactory.createTitledBorder("Items"));
        this.category = category;
        changeModel(category);
    }

    /**
     * Sets the model for the list based on the currently selected category.
     *
     * @param CATEGORY passed by the category radio button action listener
     */
    public void changeModel(int CATEGORY) {
        switch (CATEGORY) {
            case Lenapj.ARMOR:
                System.out.println("changeModel: Armor");
                break;
            case Lenapj.WEAPONS:
                System.out.println("changeModel: Weapons");
                break;
            case Lenapj.DHIDE:
                System.out.println("changeModel: D'hide");
                break;
            case Lenapj.OTHER:
                System.out.println("changeModel: Other");
                break;

        }

    }

    /**
     * Once notified the selected category has changed, this method shall update
     * the list...hopefully...
     *
     * @param o
     * @param o1
     */
    @Override
    public void update(Observable o, Object o1) {
        if (o instanceof Lenapj.CategoryButtonsObservable) {
            System.out.println("Category changed!");

        } else {
            System.out.println("Nature rune status changed!");
        }
    }

    class AbstractModelExtension extends AbstractListModel {

        public String[] strings;

        public AbstractModelExtension(int length) {
            strings = new String[length + 1];

        }

        @Override
        public int getSize() {
            return strings.length;
        }

        @Override
        public Object getElementAt(int i) {
            return strings[i];
        }
    }
}
//for reference only beyond this point

/*
 *         this.setModel(new javax.swing.AbstractListModel() {
            String[] strings = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
 */