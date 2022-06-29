/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ITicket.controller;

import ITicket.entity.Conciertos;
import ITicket.service.IConciertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Fio
 */
@Controller
public class ConciertosController {
    
    @Autowired
    private IConciertoService conciertoService;
    
    @GetMapping("/concierto") 
    public String index (Model model){ 
        List<Conciertos> listaConciertos = conciertoService.getAllConciertos();
        model.addAttribute("eventos", "Tabla Conciertos");
        model.addAttribute("eventos", listaConciertos); 
        return "concierto"; 
    }
    
     @GetMapping("/conciertoN") 
    public String crearConcierto (Model model){ 
        List<Conciertos> listaConciertos= conciertoService.getAllConciertos();
        model.addAttribute("eventos", new Conciertos());
        model.addAttribute("eventos", listaConciertos); 
        return "crear";
    }
    
     @PostMapping("/save") 
    public String guardarConcierto(@ModelAttribute Conciertos artista){ 
        
       conciertoService.saveArtista(artista);
        return "redirect:/concierto";
      
    }
    
}
