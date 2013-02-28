package alchhelper_draft2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

/**
 *
 * @author Jaska Börner This class will (hopefully) take a properly formatted
 * JSON as input from a URL and form an array (a JSONArray) from its data, from
 * which we can then draw individual item information out at will in the rest of
 * the program, provided the file is correctly formatted and the data is in the
 * right places! :)
 */
public class InputFileReader {

    public JSONArray ja;
    public int LIST_TOTAL;

    public InputFileReader() {
    }

    public int getID(int index) {
        int ID;
        ID = ja.getJSONObject(index).getInt("id");
        return ID;
    }

    public String getItemName(int index) {
        String name;
        name = ja.getJSONObject(index).getString("itemName");
        return name;
    }

    public int getItemID(int index) {
        int itemID;
        itemID = ja.getJSONObject(index).getInt("itemID");
        return itemID;
    }

    public int getAlchValue(int index) {
        int alchvalue;
        alchvalue = ja.getJSONObject(index).getInt("alchValue");
        return alchvalue;
    }

    public int getCategory(int index) {
        String catstring;
        catstring = ja.getJSONObject(index).getString("itemCategory");

        if (catstring.equalsIgnoreCase("WEAPONS")) {
            return Lenapj.WEAPONS;
        }
        if (catstring.equalsIgnoreCase("ARMOR")) {
            return Lenapj.ARMOR;
        }
        if (catstring.equalsIgnoreCase("DHIDE")) {
            return Lenapj.DHIDE;
        }
        if (catstring.equalsIgnoreCase("OTHER")) {
            return Lenapj.OTHER;
        }

        return 0;
    }

    public int getCategory(JSONObject o) {
        String catstring;
        catstring = o.getString("itemCategory");

        if (catstring.equalsIgnoreCase("WEAPONS")) {
            return Lenapj.WEAPONS;
        }
        if (catstring.equalsIgnoreCase("ARMOR")) {
            return Lenapj.ARMOR;
        }
        if (catstring.equalsIgnoreCase("DHIDE")) {
            return Lenapj.DHIDE;
        }
        if (catstring.equalsIgnoreCase("OTHER")) {
            return Lenapj.OTHER;
        }

        return 0;
    }

    public int setCurrentGEPrice(JSONObject o) {
        try {
            int itemID = o.getInt("itemID");
            String url = "http://services.runescape.com/m=itemdb_rs/api/graph/" + itemID + ".json";
            JSONObject json = JSONReader.readJsonFromUrl(url);
            JSONObject jd = json.getJSONObject("daily");
            JSONArray ja2 = new JSONArray(jd.keySet());
            String latestdaystring = (ja2.get(ja2.length() - 1).toString());
            System.out.println(latestdaystring); // string key value of latest day's data
            int latestprice = jd.getInt(latestdaystring);
            System.out.println(latestprice); // int value of latest price!
            return latestprice;
        } catch (IOException ex) {
            Logger.getLogger(InputFileReader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(InputFileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public void readIntoItem() throws JSONException, IOException {
        String url = "http://127.0.0.1/~jaska/vsc_alch/items_28213_0012.json";
        String rawText = JSONReader.returnUrlText(url);
        ja = new JSONArray(rawText);
        System.out.println(ja.length() + " items currently in the master list - loaded!");
        LIST_TOTAL = ja.length() - 1;
        System.out.println(ja.getJSONObject(0).keySet());
        // key set is [id, gePrice, itemName, itemID, alchValue, alchProfit, itemCategory] just for the record.

    }

    public ArrayList<Item> getArmorListModel() {
        ArrayList<Item> al = new ArrayList();
        for (int i = 0; i < LIST_TOTAL; i++) {
            JSONObject o = ja.getJSONObject(i);
            if (o.getString("itemCategory").equalsIgnoreCase("ARMOR")) {
                int c = setCurrentGEPrice(o);
                o.put("gePrice", c);
                al.add(new Item(o, Lenapj.ARMOR));
            }
        }

        System.out.println("Number of armor items parsed: " + al.size());
        return al;
    }

    public ArrayList<Item> getWeaponsListModel() {
        ArrayList<Item> al = new ArrayList();
        for (int i = 0; i < LIST_TOTAL; i++) {
            JSONObject o = ja.getJSONObject(i);
            if (o.getString("itemCategory").equalsIgnoreCase("WEAPONS")) {
                int c = setCurrentGEPrice(o);
                o.put("gePrice", c);
                al.add(new Item(o, Lenapj.WEAPONS));
            }
        }

        System.out.println("Number of weapons items parsed: " + al.size());
        return al;
    }

    public ArrayList<Item> getDhideListModel() {
        ArrayList<Item> al = new ArrayList();
        for (int i = 0; i < LIST_TOTAL; i++) {
            JSONObject o = ja.getJSONObject(i);
            if (o.getString("itemCategory").equalsIgnoreCase("DHIDE")) {
                int c = setCurrentGEPrice(o);
                o.put("gePrice", c);
                al.add(new Item(o, Lenapj.DHIDE));
            }
        }

        System.out.println("Number of dragonhide items parsed: " + al.size());
        return al;
    }

    public ArrayList<Item> getOtherListModel() {
        ArrayList<Item> al = new ArrayList();
        for (int i = 0; i < LIST_TOTAL; i++) {
            JSONObject o = ja.getJSONObject(i);
            if (o.getString("itemCategory").equalsIgnoreCase("OTHER")) {
                int c = setCurrentGEPrice(o);
                o.put("gePrice", c);
                al.add(new Item(o, Lenapj.OTHER));
            }
        }

        System.out.println("Number of miscellaneous items parsed: " + al.size());
        return al;
    }
}