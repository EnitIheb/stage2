package com.enit.adscrud.controller;//package com.enit.AdsManagement.com.enit.randomrecommandationservice.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.enit.AdsManagement.elastic.builder.SearchQueryBuilder;
//import com.enit.AdsManagement.com.enit.randomrecommandationservice.entity.Ads;
//
//@RestController
//@RequestMapping("/rest/manual/search")
//public class ManualSearchResource {
//
//    @Autowired
//    private SearchQueryBuilder searchQueryBuilder;
//
//    @GetMapping(value = "/{text}")
//    public List<Ads> getAll(@PathVariable final String text) {
//        return searchQueryBuilder.getAll(text);
//    }
//}
