package io;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class LevelData {

    private Header header;
    private String identifier;
    private UUID iid;
    private long uid;
    private long worldX;
    private long worldY;
    private long worldDepth;
    private long pxWid;
    private long pxHei;
    private String bgColor;
    private Object levelDataBgColor;
    private boolean useAutoIdentifier;
    private Object bgRelPath;
    private Object levelDataBgPos;
    private double bgPivotX;
    private double bgPivotY;
    private String smartColor;
    private Object bgPos;
    private Object externalRelPath;
    private Object[] fieldInstances;
    private LayerInstance[] layerInstances;
    private Object[] neighbours;

    @JsonProperty("__header__")
    public Header getHeader() { return header; }

    @JsonProperty("__header__")
    public void setHeader(Header value) { this.header = value; }

    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }

    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    @JsonProperty("iid")
    public UUID getIid() { return iid; }

    @JsonProperty("iid")
    public void setIid(UUID value) { this.iid = value; }

    @JsonProperty("uid")
    public long getUid() { return uid; }

    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }

    @JsonProperty("worldX")
    public long getWorldX() { return worldX; }

    @JsonProperty("worldX")
    public void setWorldX(long value) { this.worldX = value; }

    @JsonProperty("worldY")
    public long getWorldY() { return worldY; }

    @JsonProperty("worldY")
    public void setWorldY(long value) { this.worldY = value; }

    @JsonProperty("worldDepth")
    public long getWorldDepth() { return worldDepth; }

    @JsonProperty("worldDepth")
    public void setWorldDepth(long value) { this.worldDepth = value; }

    @JsonProperty("pxWid")
    public long getPxWid() { return pxWid; }

    @JsonProperty("pxWid")
    public void setPxWid(long value) { this.pxWid = value; }

    @JsonProperty("pxHei")
    public long getPxHei() { return pxHei; }

    @JsonProperty("pxHei")
    public void setPxHei(long value) { this.pxHei = value; }

    @JsonProperty("__bgColor")
    public String getBgColor() { return bgColor; }

    @JsonProperty("__bgColor")
    public void setBgColor(String value) { this.bgColor = value; }

    @JsonProperty("bgColor")
    public Object getLevelDataBgColor() { return levelDataBgColor; }

    @JsonProperty("bgColor")
    public void setLevelDataBgColor(Object value) { this.levelDataBgColor = value; }

    @JsonProperty("useAutoIdentifier")
    public boolean getUseAutoIdentifier() { return useAutoIdentifier; }

    @JsonProperty("useAutoIdentifier")
    public void setUseAutoIdentifier(boolean value) { this.useAutoIdentifier = value; }

    @JsonProperty("bgRelPath")
    public Object getBgRelPath() { return bgRelPath; }

    @JsonProperty("bgRelPath")
    public void setBgRelPath(Object value) { this.bgRelPath = value; }

    @JsonProperty("bgPos")
    public Object getLevelDataBgPos() { return levelDataBgPos; }

    @JsonProperty("bgPos")
    public void setLevelDataBgPos(Object value) { this.levelDataBgPos = value; }

    @JsonProperty("bgPivotX")
    public double getBgPivotX() { return bgPivotX; }

    @JsonProperty("bgPivotX")
    public void setBgPivotX(double value) { this.bgPivotX = value; }

    @JsonProperty("bgPivotY")
    public double getBgPivotY() { return bgPivotY; }

    @JsonProperty("bgPivotY")
    public void setBgPivotY(double value) { this.bgPivotY = value; }

    @JsonProperty("__smartColor")
    public String getSmartColor() { return smartColor; }

    @JsonProperty("__smartColor")
    public void setSmartColor(String value) { this.smartColor = value; }

    @JsonProperty("__bgPos")
    public Object getBgPos() { return bgPos; }

    @JsonProperty("__bgPos")
    public void setBgPos(Object value) { this.bgPos = value; }

    @JsonProperty("externalRelPath")
    public Object getExternalRelPath() { return externalRelPath; }

    @JsonProperty("externalRelPath")
    public void setExternalRelPath(Object value) { this.externalRelPath = value; }

    @JsonProperty("fieldInstances")
    public Object[] getFieldInstances() { return fieldInstances; }

    @JsonProperty("fieldInstances")
    public void setFieldInstances(Object[] value) { this.fieldInstances = value; }

    @JsonProperty("layerInstances")
    public LayerInstance[] getLayerInstances() { return layerInstances; }

    @JsonProperty("layerInstances")
    public void setLayerInstances(LayerInstance[] value) { this.layerInstances = value; }

    @JsonProperty("__neighbours")
    public Object[] getNeighbours() { return neighbours; }

    @JsonProperty("__neighbours")
    public void setNeighbours(Object[] value) { this.neighbours = value; }

}
