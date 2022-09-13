package level;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Layer {

    private String type;
    private String identifier;
    private String layerType;
    private long uid;
    private long gridSize;
    private long guideGridWid;
    private long guideGridHei;
    private long displayOpacity;
    private long inactiveOpacity;
    private boolean hideInList;
    private boolean hideFieldsWhenInactive;
    private long pxOffsetX;
    private long pxOffsetY;
    private long parallaxFactorX;
    private long parallaxFactorY;
    private boolean parallaxScaling;
    private Object[] requiredTags;
    private Object[] excludedTags;
    private Object[] intGridValues;
    private long autoTilesetDefUid;
    private Object[] autoRuleGroups;
    private Object autoSourceLayerDefUid;
    private long tilesetDefUid;
    private long tilePivotX;
    private long tilePivotY;

    @JsonProperty("__type")
    public String getType() { return type; }

    @JsonProperty("__type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }

    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    @JsonProperty("type")
    public String getLayerType() { return layerType; }

    @JsonProperty("type")
    public void setLayerType(String value) { this.layerType = value; }

    @JsonProperty("uid")
    public long getUid() { return uid; }

    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }

    @JsonProperty("gridSize")
    public long getGridSize() { return gridSize; }

    @JsonProperty("gridSize")
    public void setGridSize(long value) { this.gridSize = value; }

    @JsonProperty("guideGridWid")
    public long getGuideGridWid() { return guideGridWid; }

    @JsonProperty("guideGridWid")
    public void setGuideGridWid(long value) { this.guideGridWid = value; }

    @JsonProperty("guideGridHei")
    public long getGuideGridHei() { return guideGridHei; }

    @JsonProperty("guideGridHei")
    public void setGuideGridHei(long value) { this.guideGridHei = value; }

    @JsonProperty("displayOpacity")
    public long getDisplayOpacity() { return displayOpacity; }

    @JsonProperty("displayOpacity")
    public void setDisplayOpacity(long value) { this.displayOpacity = value; }

    @JsonProperty("inactiveOpacity")
    public long getInactiveOpacity() { return inactiveOpacity; }

    @JsonProperty("inactiveOpacity")
    public void setInactiveOpacity(long value) { this.inactiveOpacity = value; }

    @JsonProperty("hideInList")
    public boolean getHideInList() { return hideInList; }

    @JsonProperty("hideInList")
    public void setHideInList(boolean value) { this.hideInList = value; }

    @JsonProperty("hideFieldsWhenInactive")
    public boolean getHideFieldsWhenInactive() { return hideFieldsWhenInactive; }

    @JsonProperty("hideFieldsWhenInactive")
    public void setHideFieldsWhenInactive(boolean value) { this.hideFieldsWhenInactive = value; }

    @JsonProperty("pxOffsetX")
    public long getPxOffsetX() { return pxOffsetX; }

    @JsonProperty("pxOffsetX")
    public void setPxOffsetX(long value) { this.pxOffsetX = value; }

    @JsonProperty("pxOffsetY")
    public long getPxOffsetY() { return pxOffsetY; }

    @JsonProperty("pxOffsetY")
    public void setPxOffsetY(long value) { this.pxOffsetY = value; }

    @JsonProperty("parallaxFactorX")
    public long getParallaxFactorX() { return parallaxFactorX; }

    @JsonProperty("parallaxFactorX")
    public void setParallaxFactorX(long value) { this.parallaxFactorX = value; }

    @JsonProperty("parallaxFactorY")
    public long getParallaxFactorY() { return parallaxFactorY; }

    @JsonProperty("parallaxFactorY")
    public void setParallaxFactorY(long value) { this.parallaxFactorY = value; }

    @JsonProperty("parallaxScaling")
    public boolean getParallaxScaling() { return parallaxScaling; }

    @JsonProperty("parallaxScaling")
    public void setParallaxScaling(boolean value) { this.parallaxScaling = value; }

    @JsonProperty("requiredTags")
    public Object[] getRequiredTags() { return requiredTags; }

    @JsonProperty("requiredTags")
    public void setRequiredTags(Object[] value) { this.requiredTags = value; }

    @JsonProperty("excludedTags")
    public Object[] getExcludedTags() { return excludedTags; }

    @JsonProperty("excludedTags")
    public void setExcludedTags(Object[] value) { this.excludedTags = value; }

    @JsonProperty("intGridValues")
    public Object[] getIntGridValues() { return intGridValues; }

    @JsonProperty("intGridValues")
    public void setIntGridValues(Object[] value) { this.intGridValues = value; }

    @JsonProperty("autoTilesetDefUid")
    public long getAutoTilesetDefUid() { return autoTilesetDefUid; }

    @JsonProperty("autoTilesetDefUid")
    public void setAutoTilesetDefUid(long value) { this.autoTilesetDefUid = value; }

    @JsonProperty("autoRuleGroups")
    public Object[] getAutoRuleGroups() { return autoRuleGroups; }

    @JsonProperty("autoRuleGroups")
    public void setAutoRuleGroups(Object[] value) { this.autoRuleGroups = value; }

    @JsonProperty("autoSourceLayerDefUid")
    public Object getAutoSourceLayerDefUid() { return autoSourceLayerDefUid; }

    @JsonProperty("autoSourceLayerDefUid")
    public void setAutoSourceLayerDefUid(Object value) { this.autoSourceLayerDefUid = value; }

    @JsonProperty("tilesetDefUid")
    public long getTilesetDefUid() { return tilesetDefUid; }

    @JsonProperty("tilesetDefUid")
    public void setTilesetDefUid(long value) { this.tilesetDefUid = value; }

    @JsonProperty("tilePivotX")
    public long getTilePivotX() { return tilePivotX; }

    @JsonProperty("tilePivotX")
    public void setTilePivotX(long value) { this.tilePivotX = value; }

    @JsonProperty("tilePivotY")
    public long getTilePivotY() { return tilePivotY; }

    @JsonProperty("tilePivotY")
    public void setTilePivotY(long value) { this.tilePivotY = value; }

}
