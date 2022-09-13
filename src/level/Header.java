package level;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Header {

    private String fileType;
    private String app;
    private String doc;
    private String schema;
    private String appAuthor;
    private String appVersion;
    private String url;

    @JsonProperty("fileType")
    public String getFileType() { return fileType; }

    @JsonProperty("fileType")
    public void setFileType(String value) { this.fileType = value; }

    @JsonProperty("app")
    public String getApp() { return app; }

    @JsonProperty("app")
    public void setApp(String value) { this.app = value; }

    @JsonProperty("doc")
    public String getDoc() { return doc; }

    @JsonProperty("doc")
    public void setDoc(String value) { this.doc = value; }

    @JsonProperty("schema")
    public String getSchema() { return schema; }

    @JsonProperty("schema")
    public void setSchema(String value) { this.schema = value; }

    @JsonProperty("appAuthor")
    public String getAppAuthor() { return appAuthor; }

    @JsonProperty("appAuthor")
    public void setAppAuthor(String value) { this.appAuthor = value; }

    @JsonProperty("appVersion")
    public String getAppVersion() { return appVersion; }

    @JsonProperty("appVersion")
    public void setAppVersion(String value) { this.appVersion = value; }

    @JsonProperty("url")
    public String getUrl() { return url; }

    @JsonProperty("url")
    public void setUrl(String value) { this.url = value; }

}
