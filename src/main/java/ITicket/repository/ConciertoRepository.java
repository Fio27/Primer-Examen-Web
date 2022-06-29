/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ITicket.repository;

import ITicket.entity.Conciertos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fio
 */
@Repository
public interface ConciertoRepository extends CrudRepository<Conciertos, Long>{

    public Object findById(String artista);

    public void deleteById(String artista);
    
}
