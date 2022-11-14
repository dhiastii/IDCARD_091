/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wscidcard.praktikumidcard;

import java.io.IOException;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author DELL
 */
@Controller
public class controllerdata {
    @ResponseBody
    @RequestMapping("/getData")
    public String getData(@RequestParam("nama") String text,
                          @RequestParam("image") MultipartFile file,
                          @RequestParam("lahir")@DateTimeFormat(pattern="yyyy-MM-dd")Date date)
                          throws IOException {
        
    }
}
