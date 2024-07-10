package com.mani.samplespringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DetailsController {

    @GetMapping("/getDetails")
    public Details getDetails() {
        return new Details("Manikanta", "+1 978-705-0505");
    }

    static class Details {
        private String name;
        private String number;

        public Details(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }
    }
}
