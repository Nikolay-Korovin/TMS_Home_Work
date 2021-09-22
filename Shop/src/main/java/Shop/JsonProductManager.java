package Shop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class JsonProductManager {
    private static final String jsonFile = "Shop/src/main/java/Shop/file.json";
    private final ObjectMapper mapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    public List<Product> loadProductsFromJson() {
        try {
            return mapper.readValue(new File(jsonFile), new TypeReference<List<Product>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
            return Collections.EMPTY_LIST;
        }
    }

    public void saveProductsToJson(List<Product> productList) {
        try {
            mapper.writeValue(new File(jsonFile), productList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}