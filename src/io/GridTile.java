package io;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GridTile {

    private int[] px;
    private int[] src;
    private long f;
    private long t;
    private long[] d;

    @JsonProperty("px")
    public int[] getPx() { return px; }

    @JsonProperty("px")
    public void setPx(int[] value) { this.px = value; }

    @JsonProperty("src")
    public int[] getSrc() { return src; }

    @JsonProperty("src")
    public void setSrc(int[] value) { this.src = value; }

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
