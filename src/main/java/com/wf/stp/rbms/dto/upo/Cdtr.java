
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
    "com_wellsfargo_epd_upo_avro_Cdtr"
})
@Generated("jsonschema2pojo")
public class Cdtr {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Cdtr")
    private ComWellsfargoEpdUpoAvroCdtr comWellsfargoEpdUpoAvroCdtr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Cdtr")
    public ComWellsfargoEpdUpoAvroCdtr getComWellsfargoEpdUpoAvroCdtr() {
        return comWellsfargoEpdUpoAvroCdtr;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Cdtr")
    public void setComWellsfargoEpdUpoAvroCdtr(ComWellsfargoEpdUpoAvroCdtr comWellsfargoEpdUpoAvroCdtr) {
        this.comWellsfargoEpdUpoAvroCdtr = comWellsfargoEpdUpoAvroCdtr;
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
