package ra.rekkei.restapi_uploadimage.model.entity;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    private String id;
    private String name;
    private String producer;
    private int yearMaking;
    private Date expireDate;
    private int quantity;
    private double price;
    private String imageName;
}
