package com.example.docs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainIron {

     @GetMapping("/iron")
     public String getMethodName() {
          return "documentation.html";
     }
     @GetMapping("/bib")
     public String getMethodNam() {
          return "biblia.html";
     }
}
