package atec.pt.testejava25junho.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import atec.pt.testejava25junho.model.ModelTeste;

public interface ModeloRepository extends MongoRepository<ModelTeste, String>{



}
