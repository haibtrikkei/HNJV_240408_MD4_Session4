package ra.rekkei.restapi_uploadimage.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductRequest {
    private String name;
    private String producer;
    private int yearMaking;
    private Date expireDate;
    private int quantity;
    private double price;
}
