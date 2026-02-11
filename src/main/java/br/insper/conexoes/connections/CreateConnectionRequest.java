package br.insper.conexoes.connections;

public record CreateConnectionRequest(
        String fromUserId,
        String toUserId
) {}
