package com.jiayisheng.sericefeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="sevice-hi")
public interface SchedualServiceHi {
    @RequestMapping(value="/hi",method = RequestMethod.POST)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);}
