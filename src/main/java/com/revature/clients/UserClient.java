package com.revature.clients;

import java.util.Collection;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.PostMapping;

import com.revature.models.User;



@FeignClient(name = "User-Service", url = "http://localhost:8081/user/")
public interface UserClient {

	@PostMapping("/authorize")
	public User authUser(User user);
	
	@PostMapping("/roles")
	public Collection<GrantedAuthority> getRoles(User user);
}