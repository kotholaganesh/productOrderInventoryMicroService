package com.engineeringtechie.product_service.testController;


import com.engineeringtechie.product_service.dto.ProductRequest;
import com.engineeringtechie.product_service.dto.ProductResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateProduct() throws Exception {
        ProductRequest productRequest = ProductRequest.builder()
                .name("Samsung")
                .description("Android 1 description")
                .price(new BigDecimal(400.00))
                .build();

        String productRequestString = objectMapper.writeValueAsString(productRequest);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(productRequestString))
                .andExpect(status().isCreated());

    }

    @Test
    public void testGetAllProducts() throws Exception {
        var result = mockMvc.perform(MockMvcRequestBuilders.get("/api/product/all")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String jsonResponse = result.getResponse().getContentAsString();
        List<ProductResponse> productList = objectMapper.readValue(jsonResponse, new TypeReference<List<ProductResponse>>() {
        });

        assertThat(productList).isNotNull();
        assertThat(productList.size()).isGreaterThan(0);
    }

    @Test
    public void testGetProductByName() throws Exception {
        var result = mockMvc.perform(MockMvcRequestBuilders.get("/api/product/Samsung")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
        String jsonResponse = result.getResponse().getContentAsString();
        ProductResponse product = objectMapper.readValue(jsonResponse, new TypeReference<ProductResponse>() {
        });

        assertThat(product).isNotNull();
    }


}
