package br.insper.conexoes.connections;

public record DeleteConnectionRequest(
        String fromUserId,
        String toUserId
) {}