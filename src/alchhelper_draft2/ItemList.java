package alchhelper_draft2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.JList;
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

    public ItemList(int category) {
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
                //setArmorModel();
                this.setModel(new AbstractModelExtension(reader.getArmorListModel()));
                this.repaint();
                break;
            case Lenapj.WEAPONS:
                setWeaponsModel();
                System.out.println("changeModel: Weapons");
                break;
            case Lenapj.DHIDE:
                setDhideModel();
                System.out.println("changeModel: D'hide");
                break;
            case Lenapj.OTHER:
                setOtherModel();
                System.out.println("changeModel: Other");
                break;
        }
    }

    private void setArmorModel() {
        listmodel = reader.getArmorListModel();
        ame = new AbstractModelExtension(listmodel.size());
        for (int i = 0; i < listmodel.size(); i++) {
            ame.strings[i] = listmodel.get(i).getName();
        }
        this.setModel(ame);
        this.repaint();
    }

    private void setWeaponsModel() {
        listmodel = reader.getWeaponsListModel();
        ame = new AbstractModelExtension(listmodel.size());
        for (int i = 0; i < listmodel.size(); i++) {
            ame.strings[i] = listmodel.get(i).getName();
        }
        this.setModel(ame);
        this.repaint();
    }

    private void setDhideModel() {
        listmodel = reader.getDhideListModel();
        ame = new AbstractModelExtension(listmodel.size());
        for (int i = 0; i < listmodel.size(); i++) {
            ame.strings[i] = listmodel.get(i).getName();
        }
        this.setModel(ame);
        this.repaint();
    }

    private void setOtherModel() {
        listmodel = reader.getOtherListModel();
        ame = new AbstractModelExtension(listmodel.size());
        for (int i = 0; i < listmodel.size(); i++) {
            ame.strings[i] = listmodel.get(i).getName();
        }
        this.setModel(ame);
        this.repaint();
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

        public AbstractModelExtension(ArrayList<Item> al) {
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
    }
}