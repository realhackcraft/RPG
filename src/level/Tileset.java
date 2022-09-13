package level;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tileset {

    private long cWid;
    private long cHei;
    private String identifier;
    private long uid;
    private String relPath;
    private String embedAtlas;
    private long pxWid;
    private long pxHei;
    private long tileGridSize;
    private long spacing;
    private long padding;
    private Object[] tags;
    private Object tagsSourceEnumUid;
    private Object[] enumTags;
    private Object[] customData;
    private Object[] savedSelections;
    private CachedPixelData cachedPixelData;

    @JsonProperty("__cWid")
    public long getCWid() { return cWid; }

    @JsonProperty("__cWid")
    public void setCWid(long value) { this.cWid = value; }

    @JsonProperty("__cHei")
    public long getCHei() { return cHei; }

    @JsonProperty("__cHei")
    public void setCHei(long value) { this.cHei = value; }

    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }

    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    @JsonProperty("uid")
    public long getUid() { return uid; }

    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }

    @JsonProperty("relPath")
    public String getRelPath() { return relPath; }

    @JsonProperty("relPath")
    public void setRelPath(String value) { this.relPath = value; }

    @JsonProperty("embedAtlas")
    public String getEmbedAtlas() { return embedAtlas; }

    @JsonProperty("embedAtlas")
    public void setEmbedAtlas(String value) { this.embedAtlas = value; }

    @JsonProperty("pxWid")
    public long getPxWid() { return pxWid; }

    @JsonProperty("pxWid")
    public void setPxWid(long value) { this.pxWid = value; }

    @JsonProperty("pxHei")
    public long getPxHei() { return pxHei; }

    @JsonProperty("pxHei")
    public void setPxHei(long value) { this.pxHei = value; }

    @JsonProperty("tileGridSize")
    public long getTileGridSize() { return tileGridSize; }

    @JsonProperty("tileGridSize")
    public void setTileGridSize(long value) { this.tileGridSize = value; }

    @JsonProperty("spacing")
    public long getSpacing() { return spacing; }

    @JsonProperty("spacing")
    public void setSpacing(long value) { this.spacing = value; }

    @JsonProperty("padding")
    public long getPadding() { return padding; }

    @JsonProperty("padding")
    public void setPadding(long value) { this.padding = value; }

    @JsonProperty("tags")
    public Object[] getTags() { return tags; }

    @JsonProperty("tags")
    public void setTags(Object[] value) { this.tags = value; }

    @JsonProperty("tagsSourceEnumUid")
    public Object getTagsSourceEnumUid() { return tagsSourceEnumUid; }

    @JsonProperty("tagsSourceEnumUid")
    public void setTagsSourceEnumUid(Object value) { this.tagsSourceEnumUid = value; }

    @JsonProperty("enumTags")
    public Object[] getEnumTags() { return enumTags; }

    @JsonProperty("enumTags")
    public void setEnumTags(Object[] value) { this.enumTags = value; }

    @JsonProperty("customData")
    public Object[] getCustomData() { return customData; }

    @JsonProperty("customData")
    public void setCustomData(Object[] value) { this.customData = value; }

    @JsonProperty("savedSelections")
    public Object[] getSavedSelections() { return savedSelections; }

    @JsonProperty("savedSelections")
    public void setSavedSelections(Object[] value) { this.savedSelections = value; }

    @JsonProperty("cachedPixelData")
    public CachedPixelData getCachedPixelData() { return cachedPixelData; }

    @JsonProperty("cachedPixelData")
    public void setCachedPixelData(CachedPixelData value) { this.cachedPixelData = value; }

}
