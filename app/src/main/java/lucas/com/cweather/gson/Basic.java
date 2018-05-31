package lucas.com.cweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/5/28 028.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
