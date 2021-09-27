package Shop;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JsonProductManager {
    private static final String jsonFile = "Shop/src/main/java/Shop/file.json";
    BufferedReader bufferedReader;

    {
        try {
            bufferedReader = new BufferedReader(new FileReader(jsonFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private final ObjectMapper mapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    public List<Product> loadProductsFromJson() {
        try {
            if (bufferedReader.read() == -1) {
                return new ArrayList<>();
            }
            return mapper.readValue(new File(jsonFile), new TypeReference<List<Product>>() {
            });
        } catch (IOException e) {
            return new ArrayList<>();
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