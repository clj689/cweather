package lucas.com.cweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018/5/28 028.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
