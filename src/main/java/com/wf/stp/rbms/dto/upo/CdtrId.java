
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
    "com_wellsfargo_epd_upo_avro_Id"
})
@Generated("jsonschema2pojo")
public class CdtrId {

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id")
    private ComWellsfargoEpdUpoAvroId__1 comWellsfargoEpdUpoAvroId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id")
    public ComWellsfargoEpdUpoAvroId__1 getComWellsfargoEpdUpoAvroId() {
        return comWellsfargoEpdUpoAvroId;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_Id")
    public void setComWellsfargoEpdUpoAvroId(ComWellsfargoEpdUpoAvroId__1 comWellsfargoEpdUpoAvroId) {
        this.comWellsfargoEpdUpoAvroId = comWellsfargoEpdUpoAvroId;
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
