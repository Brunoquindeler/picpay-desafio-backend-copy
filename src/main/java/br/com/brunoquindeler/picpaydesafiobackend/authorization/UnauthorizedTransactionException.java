package br.com.brunoquindeler.picpaydesafiobackend.authorization;

public class UnauthorizedTransactionException extends RuntimeException {
    public UnauthorizedTransactionException(String message) {
        super(message);
    }
}
