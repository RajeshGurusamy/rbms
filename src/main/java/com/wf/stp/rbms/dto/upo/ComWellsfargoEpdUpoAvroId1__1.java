
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
    "iban",
    "othr"
})
@Generated("jsonschema2pojo")
public class ComWellsfargoEpdUpoAvroId1__1 {

    @JsonProperty("iban")
    private Iban__1 iban;
    @JsonProperty("othr")
    private Othr__2 othr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("iban")
    public Iban__1 getIban() {
        return iban;
    }

    @JsonProperty("iban")
    public void setIban(Iban__1 iban) {
        this.iban = iban;
    }

    @JsonProperty("othr")
    public Othr__2 getOthr() {
        return othr;
    }

    @JsonProperty("othr")
    public void setOthr(Othr__2 othr) {
        this.othr = othr;
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
