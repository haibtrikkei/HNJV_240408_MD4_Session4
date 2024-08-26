package ra.rekkei.restapi_uploadimage.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ra.rekkei.restapi_uploadimage.model.entity.Product;
import ra.rekkei.restapi_uploadimage.model.request.ProductRequest;
import ra.rekkei.restapi_uploadimage.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ObjectMapper mapper;

    @Override
    public Product insertProduct(MultipartFile fileUpload, String data) throws JsonProcessingException {
        //xu ly upload file


        String imageName = "link anh lay tu link firebase";

        //chuyen doi du lieu String ve du lieu Product
        //Chuyen tu du lieu String ve du lieu json

        ProductRequest productRequest = mapper.readValue(data, ProductRequest.class);

        //chuyen du lieu tu ProductRequest ve du lieu Product
        Product prod = Product.builder()
                .name(productRequest.getName())
                .expireDate(productRequest.getExpireDate())
                .price(productRequest.getPrice())
                .producer(productRequest.getProducer())
                .quantity(productRequest.getQuantity())
                .yearMaking(productRequest.getYearMaking())
                .imageName(imageName)
                .build();

        //goi repo de save prod vao database
        return prod;
    }
}
