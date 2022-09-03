package io;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class LayerInstance {

    private String identifier;
    private String type;
    private long cWid;
    private long cHei;
    private long gridSize;
    private long opacity;
    private long pxTotalOffsetX;
    private long pxTotalOffsetY;
    private long tilesetDefUid;
    private String tilesetRelPath;
    private UUID iid;
    private long levelId;
    private long layerDefUid;
    private long pxOffsetX;
    private long pxOffsetY;
    private boolean visible;
    private Object[] optionalRules;
    private Object[] intGridCsv;
    private Object[] autoLayerTiles;
    private long seed;
    private long overrideTilesetUid;
    private GridTile[] gridTiles;
    private Object[] entityInstances;

    @JsonProperty("__identifier")
    public String getIdentifier() { return identifier; }

    @JsonProperty("__identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    @JsonProperty("__type")
    public String getType() { return type; }

    @JsonProperty("__type")
    public void setType(String value) { this.type = value; }

    @JsonProperty("__cWid")
    public long getCWid() { return cWid; }

    @JsonProperty("__cWid")
    public void setCWid(long value) { this.cWid = value; }

    @JsonProperty("__cHei")
    public long getCHei() { return cHei; }

    @JsonProperty("__cHei")
    public void setCHei(long value) { this.cHei = value; }

    @JsonProperty("__gridSize")
    public long getGridSize() { return gridSize; }

    @JsonProperty("__gridSize")
    public void setGridSize(long value) { this.gridSize = value; }

    @JsonProperty("__opacity")
    public long getOpacity() { return opacity; }

    @JsonProperty("__opacity")
    public void setOpacity(long value) { this.opacity = value; }

    @JsonProperty("__pxTotalOffsetX")
    public long getPxTotalOffsetX() { return pxTotalOffsetX; }

    @JsonProperty("__pxTotalOffsetX")
    public void setPxTotalOffsetX(long value) { this.pxTotalOffsetX = value; }

    @JsonProperty("__pxTotalOffsetY")
    public long getPxTotalOffsetY() { return pxTotalOffsetY; }

    @JsonProperty("__pxTotalOffsetY")
    public void setPxTotalOffsetY(long value) { this.pxTotalOffsetY = value; }

    @JsonProperty("__tilesetDefUid")
    public long getTilesetDefUid() { return tilesetDefUid; }

    @JsonProperty("__tilesetDefUid")
    public void setTilesetDefUid(long value) { this.tilesetDefUid = value; }

    @JsonProperty("__tilesetRelPath")
    public String getTilesetRelPath() { return tilesetRelPath; }

    @JsonProperty("__tilesetRelPath")
    public void setTilesetRelPath(String value) { this.tilesetRelPath = value; }

    @JsonProperty("iid")
    public UUID getIid() { return iid; }

    @JsonProperty("iid")
    public void setIid(UUID value) { this.iid = value; }

    @JsonProperty("levelId")
    public long getLevelId() { return levelId; }

    @JsonProperty("levelId")
    public void setLevelId(long value) { this.levelId = value; }

    @JsonProperty("layerDefUid")
    public long getLayerDefUid() { return layerDefUid; }

    @JsonProperty("layerDefUid")
    public void setLayerDefUid(long value) { this.layerDefUid = value; }

    @JsonProperty("pxOffsetX")
    public long getPxOffsetX() { return pxOffsetX; }

    @JsonProperty("pxOffsetX")
    public void setPxOffsetX(long value) { this.pxOffsetX = value; }

    @JsonProperty("pxOffsetY")
    public long getPxOffsetY() { return pxOffsetY; }

    @JsonProperty("pxOffsetY")
    public void setPxOffsetY(long value) { this.pxOffsetY = value; }

    @JsonProperty("visible")
    public boolean getVisible() { return visible; }

    @JsonProperty("visible")
    public void setVisible(boolean value) { this.visible = value; }

    @JsonProperty("optionalRules")
    public Object[] getOptionalRules() { return optionalRules; }

    @JsonProperty("optionalRules")
    public void setOptionalRules(Object[] value) { this.optionalRules = value; }

    @JsonProperty("intGridCsv")
    public Object[] getIntGridCsv() { return intGridCsv; }

    @JsonProperty("intGridCsv")
    public void setIntGridCsv(Object[] value) { this.intGridCsv = value; }

    @JsonProperty("autoLayerTiles")
    public Object[] getAutoLayerTiles() { return autoLayerTiles; }

    @JsonProperty("autoLayerTiles")
    public void setAutoLayerTiles(Object[] value) { this.autoLayerTiles = value; }

    @JsonProperty("seed")
    public long getSeed() { return seed; }

    @JsonProperty("seed")
    public void setSeed(long value) { this.seed = value; }

    @JsonProperty("overrideTilesetUid")
    public long getOverrideTilesetUid() { return overrideTilesetUid; }

    @JsonProperty("overrideTilesetUid")
    public void setOverrideTilesetUid(long value) { this.overrideTilesetUid = value; }

    @JsonProperty("gridTiles")
    public GridTile[] getGridTiles() { return gridTiles; }

    @JsonProperty("gridTiles")
    public void setGridTiles(GridTile[] value) { this.gridTiles = value; }

    @JsonProperty("entityInstances")
    public Object[] getEntityInstances() { return entityInstances; }

    @JsonProperty("entityInstances")
    public void setEntityInstances(Object[] value) { this.entityInstances = value; }

}
