package alchhelper_draft2;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Jaska Börner
 * @author NullCoding
 * @author Abby Johnston / AZZIKA 
 * a class to find Nature rune prices and stuff
 * like that.
 */
public class NatureRuneHelper {

    private static final int NATURE_ITEM_ID = 561;
    private static final int PURE_ESS_ID = 7936;
    public int nature_rune_current_price;
    public int pure_essence_current_price;

    public NatureRuneHelper() {
    }

    public int getNatPrice() throws IOException {
        String url = "http://services.runescape.com/m=itemdb_rs/api/graph/" + NATURE_ITEM_ID + ".json";
        JSONObject json = JSONReader.readJsonFromUrl(url);
        JSONObject jd = json.getJSONObject("daily");
        JSONArray ja = new JSONArray(jd.keySet());
        String latestdaystring = (ja.get(ja.length() - 1).toString());
        int latestprice = jd.getInt(latestdaystring);
        this.nature_rune_current_price = latestprice;
        System.out.println("Nats: " + nature_rune_current_price);
        return nature_rune_current_price;
    }

    public int getEssPrice() throws IOException {
        String url = "http://services.runescape.com/m=itemdb_rs/api/graph/" + PURE_ESS_ID + ".json";
        JSONObject json = JSONReader.readJsonFromUrl(url);
        JSONObject jd = json.getJSONObject("daily");
        JSONArray ja = new JSONArray(jd.keySet());
        String latestdaystring = (ja.get(ja.length() - 1).toString());
        int latestprice = jd.getInt(latestdaystring);
        this.pure_essence_current_price = latestprice;
        System.out.println("Ess: " + pure_essence_current_price);
        return pure_essence_current_price;
    }
}
