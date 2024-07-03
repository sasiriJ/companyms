package com.sasiri.jobapp.companyms.company.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("reviewms")
public interface ReviewClient {
    @GetMapping("/reviews/averageRating")
    Double averageRating(@RequestParam Long companyId);
}