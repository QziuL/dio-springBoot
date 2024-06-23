package qziul_web_api.handler;

public class RequiredException extends BusinessException{
    public RequiredException(String campo) {
        super("O campo %s é obrigatório.", campo);
    }
}
