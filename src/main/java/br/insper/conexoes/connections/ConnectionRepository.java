package br.insper.conexoes.connections;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ConnectionRepository
        extends MongoRepository<Connection, String> {

    List<Connection> findByFromUserId(String fromUserId);

    void deleteByFromUserIdAndToUserId(String fromUserId, String toUserId);
}
