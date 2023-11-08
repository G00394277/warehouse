package ie.atu.warehouse;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WarehouseDetails {
    @JsonProperty("warehouseId")
    private int warehouseId;

    @JsonProperty("location")
    private String location;

    @JsonProperty("capacity")
    private int capacity;
}
