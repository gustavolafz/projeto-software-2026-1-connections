package br.insper.conexoes.connections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "connections")
public class Connection {

    @Id
    private String id;

    private String fromUserId;
    private String toUserId;

    public Connection(String fromUserId, String toUserId) {
        this.fromUserId = fromUserId;
        this.toUserId = toUserId;
    }

    public Connection() {}

    public String getId() {
        return id;
    }

    public String getFromUserId() {
        return fromUserId;
    }

    public String getToUserId() {
        return toUserId;
    }
}
