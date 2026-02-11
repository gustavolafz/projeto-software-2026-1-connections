package br.insper.conexoes.connections;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionService {

    private final ConnectionRepository repository;

    public ConnectionService(ConnectionRepository repository) {
        this.repository = repository;
    }

    public Connection create(String fromUserId, String toUserId) {
        Connection connection = new Connection(fromUserId, toUserId);
        return repository.save(connection);
    }

    public List<Connection> listByUser(String userId) {
        return repository.findByFromUserId(userId);
    }

    public void delete(String fromUserId, String toUserId) {
        repository.deleteByFromUserIdAndToUserId(fromUserId, toUserId);
    }
}
