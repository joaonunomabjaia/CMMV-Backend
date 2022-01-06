package mz.org.fgh.cmmv.backend.protection

import grails.plugin.springsecurity.userdetails.GrailsUser
import org.grails.web.json.JSONArray
import org.grails.web.json.JSONObject
import org.springframework.security.core.GrantedAuthority

class CustomUserDetails extends GrailsUser {

    final String fullname

    CustomUserDetails(String username, String password, boolean enabled,
                      boolean accountNonExpired, boolean credentialsNonExpired,
                      boolean accountNonLocked,
                      Collection<GrantedAuthority> authorities,
                      long id, String fullname) {
        super(username, password, enabled, accountNonExpired,
                credentialsNonExpired, accountNonLocked, authorities, id)

        this.fullname = fullname
    }
}
