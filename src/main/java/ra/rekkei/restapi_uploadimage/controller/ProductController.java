package ra.rekkei.restapi_uploadimage.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ra.rekkei.restapi_uploadimage.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<?> insertProduct(@RequestParam("imageFile")MultipartFile imageFile, @RequestParam("data")String data) throws JsonProcessingException {
        productService.insertProduct(imageFile,data);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
}
