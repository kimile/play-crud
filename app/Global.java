import com.avaje.ebean.Ebean;
import models.Store;
import play.Application;
import play.GlobalSettings;
import play.libs.Yaml;

import java.util.List;
import java.util.Map;

public class Global extends GlobalSettings {

    public void onStart(Application app) {
        InitialData.insert(app);
    }

    static class InitialData {


        public static void insert(Application app) {
            @SuppressWarnings("unchecked")
            Map<String, List<Object>> all = (Map<String, List<Object>>) Yaml.load("initial-data.yaml");

            if (Ebean.find(Store.class).findRowCount() == 0) {
                Ebean.save(all.get("stores"));
            }
        }
    }

}
