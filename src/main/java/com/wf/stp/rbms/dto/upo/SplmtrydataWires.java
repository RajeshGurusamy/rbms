
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
    "com_wellsfargo_epd_upo_avro_SplmtryDataWIRES"
})
@Generated("jsonschema2pojo")
public class SplmtrydataWires {

    @JsonProperty("com_wellsfargo_epd_upo_avro_SplmtryDataWIRES")
    private ComWellsfargoEpdUpoAvroSplmtryDataWIRES comWellsfargoEpdUpoAvroSplmtryDataWIRES;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("com_wellsfargo_epd_upo_avro_SplmtryDataWIRES")
    public ComWellsfargoEpdUpoAvroSplmtryDataWIRES getComWellsfargoEpdUpoAvroSplmtryDataWIRES() {
        return comWellsfargoEpdUpoAvroSplmtryDataWIRES;
    }

    @JsonProperty("com_wellsfargo_epd_upo_avro_SplmtryDataWIRES")
    public void setComWellsfargoEpdUpoAvroSplmtryDataWIRES(ComWellsfargoEpdUpoAvroSplmtryDataWIRES comWellsfargoEpdUpoAvroSplmtryDataWIRES) {
        this.comWellsfargoEpdUpoAvroSplmtryDataWIRES = comWellsfargoEpdUpoAvroSplmtryDataWIRES;
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
