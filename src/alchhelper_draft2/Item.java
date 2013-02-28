package alchhelper_draft2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

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
    public int itemdb, category;

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
      /*  try {
            setCurrentData();
        } catch (IOException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
    /**
     * Constructs an Item instance given a JSONObject containing keys
     * for name, database ID, alch value, and category; current price comes
     * later.
     * @param o a JSONObject representing a single item 
     * @param category passed by the initializer
     */
    public Item(JSONObject o, int category) {
        this.name = o.getString("itemName");
        this.alchvalue = o.getInt("alchValue");
        this.itemdb = o.getInt("itemID");
        this.geprice = o.getInt("gePrice");
        this.category = category;
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

    private void setCurrentData() throws IOException, JSONException {
        JSONReader rd = new JSONReader();
        String url = "http://services.runescape.com/m=itemdb_rs/api/graph/" + itemdb + ".json";
        JSONObject json = rd.readJsonFromUrl(url);
        JSONObject jd = json.getJSONObject("daily");
        JSONArray ja = new JSONArray(jd.keySet());
        String latestdaystring = (ja.get(ja.length() - 1).toString());
        System.out.println(latestdaystring); // string key value of latest day's data
        int latestprice = jd.getInt(latestdaystring);
        System.out.println(latestprice); // int value of latest price!
        this.geprice = latestprice;
    }
}
