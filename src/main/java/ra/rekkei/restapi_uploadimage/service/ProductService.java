package ra.rekkei.restapi_uploadimage.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.web.multipart.MultipartFile;
import ra.rekkei.restapi_uploadimage.model.entity.Product;

public interface ProductService {
    public Product insertProduct(MultipartFile fileUpload, String data) throws JsonProcessingException;
}
