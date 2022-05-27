package com.ibm.academia.restapi.fraude.modelo.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.restapi.fraude.modelo.entidad.Ip;

@Repository
public interface IpRepository extends CrudRepository<Ip, String>{

}
