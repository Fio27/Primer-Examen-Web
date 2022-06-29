/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ITicket.service;

import ITicket.entity.Conciertos;
import ITicket.repository.ConciertoRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Fio
 */
@Service
public class ConciertoService implements IConciertoService{
    
    private ConciertoRepository conciertoRepository; 

    @Override
    public List<Conciertos> getAllConciertos() {
        return (List<Conciertos>)conciertoRepository.findAll(); 
    }

    @Override
    public Conciertos findByArtista(String artista) {
     return (Conciertos) conciertoRepository.findById(artista); 
    }

    @Override
    public void saveArtista(Conciertos artista) {
        conciertoRepository.save(artista);

    }

    @Override
    public void delete(String artista) {
        conciertoRepository.deleteById(artista);
    }
}