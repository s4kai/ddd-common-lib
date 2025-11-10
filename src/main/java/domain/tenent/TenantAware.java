package domain.tenent;

public interface TenantAware {
    String getTenantId();
    void setTenantId(String tenantId);
}