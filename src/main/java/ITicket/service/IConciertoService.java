/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ITicket.service;

import ITicket.entity.Conciertos;
import java.util.List;

/**
 *
 * @author Fio
 */
public interface IConciertoService {
    
    public List<Conciertos> getAllConciertos(); 
    public Conciertos findByArtista (String artista); 
    public void saveArtista (Conciertos artista); 
    public void delete (String artista); 
    
}
