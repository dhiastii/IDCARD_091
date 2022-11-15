/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wscidcard.praktikumidcard;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
//    @ResponseBody
    @RequestMapping("/getData")
    public String getData(@RequestParam("nama") String nama,
                          @RequestParam("foto") MultipartFile foto,
                          @RequestParam("lahir")@DateTimeFormat(pattern="yyyy-MM-dd")Date date,
                          Model model) throws IOException {
        
    SimpleDateFormat formattgl = new SimpleDateFormat("EEEE, dd MMMM yyyy");
    String lahir = formattgl.format(date);
    
    String blob = Base64.encodeBase64String(foto.getBytes());
    String fotoo = "data:image/jpeg;base64,".concat(blob);
    
    model.addAttribute("nma", nama);
    model.addAttribute("ttl", lahir);
    model.addAttribute("fto", fotoo);
    
    return "show";
    }
}

