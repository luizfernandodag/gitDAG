package Spring.web.service;

import Spring.web.dao.UsuarioDao;
import Spring.web.domain.Rol;
import Spring.web.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userDetailsService")
public class UsuarioService implements UserDetailsService {
    @Autowired
    private UsuarioDao usuarioDao;
    @Transactional(readOnly = true)
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
    {
        Usuario usuario = usuarioDao.findByusername(username);
        if(usuario==null)
        {
            throw new UsernameNotFoundException(username);
        }
        List<GrantedAuthority> roles = new ArrayList<GrantedAuthority>();

        for(Rol rol: usuario.getRoles())
        {
            roles.add(new SimpleGrantedAuthority(rol.getName()));
        }

        return new User(usuario.getUsername(), usuario.getPassword(), roles);
    }


}
