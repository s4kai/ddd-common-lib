package exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    // Erros genéricos
    UNKNOWN_ERROR("GEN-0001", "Ocorreu um erro inesperado."),
    VALIDATION_ERROR("GEN-0002", "Erro de validação nos dados informados."),
    NOT_FOUND("GEN-0003", "Entidade não encontrada."),
    ACCESS_DENIED("GEN-0004", "Acesso negado."),
    BUSINESS_RULE_VIOLATION("GEN-0005", "Regra de negócio violada."),
    TENANT_INVALID("GEN-0006", "Tenant inválido ou não encontrado.");

    private final String code;
    private final String message;
}