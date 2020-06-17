package com.juliocesar.resources;

import com.juliocesar.domain.Categoria;
import com.juliocesar.services.CategoriaService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.mockito.ArgumentMatchers.anyInt;

@WebMvcTest(CategoriaResources.class) //sobe o spring so para o mvc que você precisa
public class CategoriaResourceUnitTest {

    @Autowired
    private MockMvc mockMvc;

    //mocka o bean que será itoçozamdp ma sua classe, dependencia utilizada na classe
    @MockBean
    private CategoriaService categoriaService;

    @Test
    public void deveRetornarCategoriaUsandoId() throws Exception {

        int id = 1;
        Categoria categoria = new Categoria(id,"Informática");

        given(categoriaService.buscar(anyInt())).willReturn(categoria);
        mockMvc.perform(get("/categorias/" + id)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1))) //$ indica q é o objeto do json no topo do arquivo
                .andExpect(jsonPath("$.nome", is("Informática")));
    }
}
