package alchhelper_draft2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.json.JSONException;

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
    public InputFileReader reader;
    private AbstractModelExtension ame;
    private Lenapj mw;

    public ItemList(int category, Lenapj mw) {
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        try {
            reader = new InputFileReader();
            reader.readIntoItem();
            this.setBorder(javax.swing.BorderFactory.createTitledBorder("Items"));
            this.category = category;
            changeModel(category);
        } catch (JSONException ex) {
            Logger.getLogger(ItemList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ItemList.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.mw = mw;
        this.addListSelectionListener(new ItemListener(this));
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
                ame = null;
                ame = new AbstractModelExtension(reader.getArmorListModel());
                this.setModel(ame);
                this.repaint();
                break;
            case Lenapj.WEAPONS:
                System.out.println("changeModel: Weapons");
                ame = null;
                ame = new AbstractModelExtension(reader.getWeaponsListModel());
                this.setModel(ame);
                this.repaint();
                break;
            case Lenapj.DHIDE:
                System.out.println("changeModel: D'hide");
                ame = null;
                ame = new AbstractModelExtension(reader.getDhideListModel());
                this.setModel(ame);
                this.repaint();
                break;
            case Lenapj.OTHER:
                System.out.println("changeModel: Other");
                ame = null;
                ame = new AbstractModelExtension(reader.getOtherListModel());
                this.setModel(ame);
                this.repaint();
                break;
        }
    }

    /**
     * sent by the list data listener (valueChanged()) with instructions to load
     * the selected item's information instead!
     *
     * @param index passed by the LSE
     */
    public void fillFields(int index) {
        Item newItem = ame.getItemAt(index);
        System.out.println(newItem.name + " itemID is: " + newItem.itemdb + " and current GE Price is: " + newItem.geprice);
        mw.AlchValue.setText(String.valueOf(newItem.getAlchValue()));
        mw.GEPrice.setText(String.valueOf(newItem.getGEPrice()));
        mw.AlchValue.repaint();
        mw.GEPrice.repaint();
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
        private ArrayList<Item> pl;

        public AbstractModelExtension(int length) {
            strings = new String[length + 1];

        }

        public AbstractModelExtension(ArrayList<Item> al) {
            this.pl = al;
            strings = new String[al.size() + 1];
            for (int i = 0; i < al.size(); i++) {
                strings[i] = al.get(i).getName();
            }
        }

        @Override
        public int getSize() {
            return strings.length;
        }

        @Override
        public String getElementAt(int i) {
            return strings[i];
        }

        public Item getItemAt(int i) {
            return pl.get(i);
        }
    }

    class ItemListener implements ListSelectionListener {

        private ItemList il;

        public ItemListener(ItemList il) {
            this.il = il;
        }

        @Override
        public void valueChanged(ListSelectionEvent lse) {
            il.fillFields(il.getSelectedIndex());
        }
    }
}
