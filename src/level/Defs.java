package level;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Defs {

    private Layer[] layers;
    private Object[] entities;
    private Tileset[] tilesets;
    private Object[] enums;
    private Object[] externalEnums;
    private Object[] levelFields;

    @JsonProperty("layers")
    public Layer[] getLayers() { return layers; }

    @JsonProperty("layers")
    public void setLayers(Layer[] value) { this.layers = value; }

    @JsonProperty("entities")
    public Object[] getEntities() { return entities; }

    @JsonProperty("entities")
    public void setEntities(Object[] value) { this.entities = value; }

    @JsonProperty("tilesets")
    public Tileset[] getTilesets() { return tilesets; }

    @JsonProperty("tilesets")
    public void setTilesets(Tileset[] value) { this.tilesets = value; }

    @JsonProperty("enums")
    public Object[] getEnums() { return enums; }

    @JsonProperty("enums")
    public void setEnums(Object[] value) { this.enums = value; }

    @JsonProperty("externalEnums")
    public Object[] getExternalEnums() { return externalEnums; }

    @JsonProperty("externalEnums")
    public void setExternalEnums(Object[] value) { this.externalEnums = value; }

    @JsonProperty("levelFields")
    public Object[] getLevelFields() { return levelFields; }

    @JsonProperty("levelFields")
    public void setLevelFields(Object[] value) { this.levelFields = value; }

}
