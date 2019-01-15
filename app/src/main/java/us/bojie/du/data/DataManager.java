package us.bojie.du.data;


import us.bojie.du.data.local.db.DbHelper;
import us.bojie.du.data.local.prefs.PreferencesHelper;
import us.bojie.du.data.remote.ApiHelper;

public interface DataManager extends DbHelper, PreferencesHelper, ApiHelper {

}
