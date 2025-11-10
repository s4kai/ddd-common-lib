package security;

import java.util.Set;

public record AuthorizedUser(String id, String tenantId, Set<String> roles) {

    public boolean hasRole(String role) {
        return roles.contains(role);
    }
}
