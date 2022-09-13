package level;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CachedPixelData {

    private String opaqueTiles;
    private String averageColors;

    @JsonProperty("opaqueTiles")
    public String getOpaqueTiles() { return opaqueTiles; }

    @JsonProperty("opaqueTiles")
    public void setOpaqueTiles(String value) { this.opaqueTiles = value; }

    @JsonProperty("averageColors")
    public String getAverageColors() { return averageColors; }

    @JsonProperty("averageColors")
    public void setAverageColors(String value) { this.averageColors = value; }

}
