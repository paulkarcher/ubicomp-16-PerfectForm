/* Code used for testing purposes from http://code.tutsplus.com/tutorials/create-a-weather-app-on-android--cms-21587
   Will be further modified.
 */

package ah.hathi.simpleweather;

import android.app.Activity;
import android.content.SharedPreferences;

public class CityPreference {

    SharedPreferences prefs;

    public CityPreference(Activity activity){
        prefs = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    // If the user has not chosen a city yet, return
    // Sydney as the default city
    String getCity(){
        return prefs.getString("city", "Sydney, AU");
    }

    void setCity(String city){
        prefs.edit().putString("city", city).commit();
    }

}