package name.eskildsen.zoneminder.api.host;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import name.eskildsen.zoneminder.IZoneMinderHostLoad;
import name.eskildsen.zoneminder.api.ZoneMinderData;

public class ZoneMinderHostLoad extends ZoneMinderData implements IZoneMinderHostLoad {

	@SerializedName("load")
	@Expose
	private List<Float> load = new ArrayList<Float>();


	public Float getCpuLoad() {
		if (load.size()>0) {
			return load.get(0);
		}
		return null;
	}
}
