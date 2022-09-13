package level;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LevelData {

    private Header header;
    private String jsonVersion;
    private long appBuildId;
    private long nextUid;
    private String identifierStyle;
    private String worldLayout;
    private long worldGridWidth;
    private long worldGridHeight;
    private long defaultLevelWidth;
    private long defaultLevelHeight;
    private long defaultPivotX;
    private long defaultPivotY;
    private long defaultGridSize;
    private String bgColor;
    private String defaultLevelBgColor;
    private boolean minifyJson;
    private boolean externalLevels;
    private boolean exportTiled;
    private boolean simplifiedExport;
    private String imageExportMode;
    private Object pngFilePattern;
    private boolean backupOnSave;
    private long backupLimit;
    private String levelNamePattern;
    private Object tutorialDesc;
    private Object[] flags;
    private Defs defs;
    private Level[] levels;
    private Object[] worlds;

    @JsonProperty("__header__")
    public Header getHeader() { return header; }

    @JsonProperty("__header__")
    public void setHeader(Header value) { this.header = value; }

    @JsonProperty("jsonVersion")
    public String getJsonVersion() { return jsonVersion; }

    @JsonProperty("jsonVersion")
    public void setJsonVersion(String value) { this.jsonVersion = value; }

    @JsonProperty("appBuildId")
    public long getAppBuildId() { return appBuildId; }

    @JsonProperty("appBuildId")
    public void setAppBuildId(long value) { this.appBuildId = value; }

    @JsonProperty("nextUid")
    public long getNextUid() { return nextUid; }

    @JsonProperty("nextUid")
    public void setNextUid(long value) { this.nextUid = value; }

    @JsonProperty("identifierStyle")
    public String getIdentifierStyle() { return identifierStyle; }

    @JsonProperty("identifierStyle")
    public void setIdentifierStyle(String value) { this.identifierStyle = value; }

    @JsonProperty("worldLayout")
    public String getWorldLayout() { return worldLayout; }

    @JsonProperty("worldLayout")
    public void setWorldLayout(String value) { this.worldLayout = value; }

    @JsonProperty("worldGridWidth")
    public long getWorldGridWidth() { return worldGridWidth; }

    @JsonProperty("worldGridWidth")
    public void setWorldGridWidth(long value) { this.worldGridWidth = value; }

    @JsonProperty("worldGridHeight")
    public long getWorldGridHeight() { return worldGridHeight; }

    @JsonProperty("worldGridHeight")
    public void setWorldGridHeight(long value) { this.worldGridHeight = value; }

    @JsonProperty("defaultLevelWidth")
    public long getDefaultLevelWidth() { return defaultLevelWidth; }

    @JsonProperty("defaultLevelWidth")
    public void setDefaultLevelWidth(long value) { this.defaultLevelWidth = value; }

    @JsonProperty("defaultLevelHeight")
    public long getDefaultLevelHeight() { return defaultLevelHeight; }

    @JsonProperty("defaultLevelHeight")
    public void setDefaultLevelHeight(long value) { this.defaultLevelHeight = value; }

    @JsonProperty("defaultPivotX")
    public long getDefaultPivotX() { return defaultPivotX; }

    @JsonProperty("defaultPivotX")
    public void setDefaultPivotX(long value) { this.defaultPivotX = value; }

    @JsonProperty("defaultPivotY")
    public long getDefaultPivotY() { return defaultPivotY; }

    @JsonProperty("defaultPivotY")
    public void setDefaultPivotY(long value) { this.defaultPivotY = value; }

    @JsonProperty("defaultGridSize")
    public long getDefaultGridSize() { return defaultGridSize; }

    @JsonProperty("defaultGridSize")
    public void setDefaultGridSize(long value) { this.defaultGridSize = value; }

    @JsonProperty("bgColor")
    public String getBgColor() { return bgColor; }

    @JsonProperty("bgColor")
    public void setBgColor(String value) { this.bgColor = value; }

    @JsonProperty("defaultLevelBgColor")
    public String getDefaultLevelBgColor() { return defaultLevelBgColor; }

    @JsonProperty("defaultLevelBgColor")
    public void setDefaultLevelBgColor(String value) { this.defaultLevelBgColor = value; }

    @JsonProperty("minifyJson")
    public boolean getMinifyJson() { return minifyJson; }

    @JsonProperty("minifyJson")
    public void setMinifyJson(boolean value) { this.minifyJson = value; }

    @JsonProperty("externalLevels")
    public boolean getExternalLevels() { return externalLevels; }

    @JsonProperty("externalLevels")
    public void setExternalLevels(boolean value) { this.externalLevels = value; }

    @JsonProperty("exportTiled")
    public boolean getExportTiled() { return exportTiled; }

    @JsonProperty("exportTiled")
    public void setExportTiled(boolean value) { this.exportTiled = value; }

    @JsonProperty("simplifiedExport")
    public boolean getSimplifiedExport() { return simplifiedExport; }

    @JsonProperty("simplifiedExport")
    public void setSimplifiedExport(boolean value) { this.simplifiedExport = value; }

    @JsonProperty("imageExportMode")
    public String getImageExportMode() { return imageExportMode; }

    @JsonProperty("imageExportMode")
    public void setImageExportMode(String value) { this.imageExportMode = value; }

    @JsonProperty("pngFilePattern")
    public Object getPngFilePattern() { return pngFilePattern; }

    @JsonProperty("pngFilePattern")
    public void setPngFilePattern(Object value) { this.pngFilePattern = value; }

    @JsonProperty("backupOnSave")
    public boolean getBackupOnSave() { return backupOnSave; }

    @JsonProperty("backupOnSave")
    public void setBackupOnSave(boolean value) { this.backupOnSave = value; }

    @JsonProperty("backupLimit")
    public long getBackupLimit() { return backupLimit; }

    @JsonProperty("backupLimit")
    public void setBackupLimit(long value) { this.backupLimit = value; }

    @JsonProperty("levelNamePattern")
    public String getLevelNamePattern() { return levelNamePattern; }

    @JsonProperty("levelNamePattern")
    public void setLevelNamePattern(String value) { this.levelNamePattern = value; }

    @JsonProperty("tutorialDesc")
    public Object getTutorialDesc() { return tutorialDesc; }

    @JsonProperty("tutorialDesc")
    public void setTutorialDesc(Object value) { this.tutorialDesc = value; }

    @JsonProperty("flags")
    public Object[] getFlags() { return flags; }

    @JsonProperty("flags")
    public void setFlags(Object[] value) { this.flags = value; }

    @JsonProperty("defs")
    public Defs getDefs() { return defs; }

    @JsonProperty("defs")
    public void setDefs(Defs value) { this.defs = value; }

    @JsonProperty("levels")
    public Level[] getLevels() { return levels; }

    @JsonProperty("levels")
    public void setLevels(Level[] value) { this.levels = value; }

    @JsonProperty("worlds")
    public Object[] getWorlds() { return worlds; }

    @JsonProperty("worlds")
    public void setWorlds(Object[] value) { this.worlds = value; }

}
