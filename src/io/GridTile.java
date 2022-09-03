package io;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GridTile {

    private long[] px;
    private long[] src;
    private long f;
    private long t;
    private long[] d;

    @JsonProperty("px")
    public long[] getPx() { return px; }

    @JsonProperty("px")
    public void setPx(long[] value) { this.px = value; }

    @JsonProperty("src")
    public long[] getSrc() { return src; }

    @JsonProperty("src")
    public void setSrc(long[] value) { this.src = value; }

    @JsonProperty("f")
    public long getF() { return f; }

    @JsonProperty("f")
    public void setF(long value) { this.f = value; }

    @JsonProperty("t")
    public long getT() { return t; }

    @JsonProperty("t")
    public void setT(long value) { this.t = value; }

    @JsonProperty("d")
    public long[] getD() { return d; }

    @JsonProperty("d")
    public void setD(long[] value) { this.d = value; }

}
