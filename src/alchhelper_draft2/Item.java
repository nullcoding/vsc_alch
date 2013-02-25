package alchhelper_draft2;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * A general class for creating instances of items (essentially just objects)
 * for use in list models and profit/loss calculations.
 *
 * @author Jaska Börner
 * @version 2
 */
public class Item {

    public String name;
    public long alchvalue, geprice;
    public int itemdb;

    /**
     * Constructs a new Item instance given a database ID in the RuneScape Grand
     * Exchange Centre and the high-alchemy value (thus you must already know
     * both of these things before adding a new item to the master list!)
     *
     * @param databasenumber the database ID of the item, see notes for details
     * @param alchvalue how much you get for high-alching this item (a constant
     * as far as the game itself is concerned - this will never change)
     */
    public Item(int databasenumber, long alchvalue) {
        this.itemdb = databasenumber;
        this.alchvalue = alchvalue;
    }

    public long getAlchValue() {
        return alchvalue;
    }

    public long getGEPrice() {
        return geprice;
    }

    public String getName() {
        return name;
    }

    public void setCurrentData() throws IOException, JSONException {
        JSONReader rd = new JSONReader();
        String url = "http://services.runescape.com/m=itemdb_rs/api/graph/"+itemdb+".json";
        JSONObject json = rd.readJsonFromUrl(url);
        System.out.println(json.toString());
        System.out.println(json.get("id"));
        System.out.println(json.length());
    }
}
