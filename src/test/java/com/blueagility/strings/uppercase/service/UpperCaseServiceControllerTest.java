package com.blueagility.strings.uppercase.service;

import com.blueagility.strings.uppercase.service.UpperCaseServiceApplication;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

/**
 * Ensures UppercaseService works as expected.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = UpperCaseServiceApplication.class)
@WebAppConfiguration
public class UpperCaseServiceControllerTest {

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext webApplicationContext;


    @Before
    public void setUp() throws Exception {
        mvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void upper_case_abc() throws Exception {
        mvc.perform(get("/upperCase/abc").accept(MediaType.ALL_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("ABC")));
    }

    @Test
    public void upper_case_ABC() throws Exception {
        mvc.perform(get("/upperCase/ABC").accept(MediaType.ALL_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("ABC")));
    }

}


