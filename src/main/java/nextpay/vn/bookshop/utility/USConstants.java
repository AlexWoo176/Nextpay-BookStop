package nextpay.vn.bookshop.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class USConstants {

    public final static String US = "US";

    public final static Map<String, String> mapOfUSStates = new HashMap<String, String>() {
        {
            put("Ha Noi", "Ha Noi");
            put("Cau Giay", "Cau Giay");
            put("Hai Ba Trung", "Hai Ba Trung");
            put("Hoan Kiem", "Hoan Kiem");
            put("Ba Dinh", "Ba Dinh");
            put("My Dinh", "My Dinh");
            put("Long Bien", "Long Bien");
            put("Nam Tu Liem", "Nam Tu Liem");

        }
    };

    public final static List<String> listOfUSStatesCode = new ArrayList<>(mapOfUSStates.keySet());
    public final static List<String> listOfUSStatesName = new ArrayList<>(mapOfUSStates.values());

}
