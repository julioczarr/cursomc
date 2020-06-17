//package com.juliocesar.services;
//
//import com.juliocesar.domain.Categoria;
//import com.juliocesar.repositories.CategoriaRepository;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.TestConfiguration;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Optional;
//
//import static org.mockito.ArgumentMatchers.anyInt;
//import static org.mockito.BDDMockito.given;
//
//@RunWith(SpringRunner.class)
//public class CategoriaServiceUnitTest {
//
//    @TestConfiguration
//    private class CategoriaServiceTestContextConfiguration{
//
//        @Bean
//        public CategoriaService categoriaService(){
//            return new CategoriaService();
//        }
//
//        @Autowired
//        private CategoriaService categoriaService;
//
//        @MockBean
//        private CategoriaRepository categoriaRepository;
//
//        @Before
//        Integer id = 1;
//        Categoria categoria = new Categoria( id, "Informática");
//        Mockito.when(categoriaRepository.findById(anyInt())).thenReturn(Optional.of(categoria));
//    }
//
//
//    @Test
//    public void deveConsultarCategoriaUsandoId(){
//
//        Categoria categoriaBuscada = categoriaService.buscar(1);
//
//        assert categoriaBuscada.getId() == 1;
//        assert categoria.getNome().equals("Informática");
//    }
//}
