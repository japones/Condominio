package br.com.xkinfo.slc.Service.Exceptions;

public class ConfiguracaoServiceException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ConfiguracaoServiceException(String message) {
        super(message);
    }

    public ConfiguracaoServiceException(Throwable cause) {
        super(cause);
    }

    public ConfiguracaoServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}
