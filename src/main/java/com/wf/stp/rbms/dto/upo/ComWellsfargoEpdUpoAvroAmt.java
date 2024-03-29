
package com.wf.stp.rbms.dto.upo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "instdAmt",
    "dbtAmt",
    "cdtAmt"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroAmt {

    @JsonProperty("instdAmt")
    private InstdAmt instdAmt;
    @JsonProperty("dbtAmt")
    private DbtAmt dbtAmt;
    @JsonProperty("cdtAmt")
    private CdtAmt cdtAmt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("instdAmt")
    public InstdAmt getInstdAmt() {
        return instdAmt;
    }

    @JsonProperty("instdAmt")
    public void setInstdAmt(InstdAmt instdAmt) {
        this.instdAmt = instdAmt;
    }

    @JsonProperty("dbtAmt")
    public DbtAmt getDbtAmt() {
        return dbtAmt;
    }

    @JsonProperty("dbtAmt")
    public void setDbtAmt(DbtAmt dbtAmt) {
        this.dbtAmt = dbtAmt;
    }

    @JsonProperty("cdtAmt")
    public CdtAmt getCdtAmt() {
        return cdtAmt;
    }

    @JsonProperty("cdtAmt")
    public void setCdtAmt(CdtAmt cdtAmt) {
        this.cdtAmt = cdtAmt;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
