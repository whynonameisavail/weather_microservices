package com.example.providerapi;

import com.example.providerapi.pojo.Provider;
import com.example.providerapi.repository.ProviderRepository;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
class ProviderapiApplicationTests {
    private static Logger logger = LoggerFactory.getLogger(ProviderapiApplicationTests.class);
    private static MockMvc mockMVC;
    private static int idRecord = 0;
    private ProviderRepository providerRepository;
    DateFormat dateFormat =  new SimpleDateFormat("yyyyMMdd");
    @Autowired
    private WebApplicationContext webApplicationContext;
    public ProviderapiApplicationTests(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

    @Before
    public void before() {
        mockMVC = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testInsertion() throws Exception {
        Provider newProvider = new Provider(null, "a", "b", "c", dateFormat.parse("19900101"));
        Provider savedProvider = providerRepository.save(newProvider);
        Assertions.assertEquals(savedProvider, newProvider);
    }

}
