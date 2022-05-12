package com.example.awsuploadtest.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;

@Entity
@Table(name = "usr")
@Data
@FieldDefaults(level = AccessLevel.PROTECTED)
@NoArgsConstructor
@DynamicUpdate
public class Usr //implements UserDetails
{
	@Id
	@Column(name = "id", nullable = false)
	long id;

	@Column(name = "first_name", length = 128)
	@NotNull
	String firstName;

//	@Column(name = "last_name", length = 128)
//	@NotNull
//	String lastName;
//
//	@Column(name = "email", length = 320)
//	@NotNull
//	String email;
//
//	@Enumerated(EnumType.STRING)
//	@Column(name = "role")
//	RoleEnum role;
//
//	// @Lob ??
//	@Column(name = "password")
//	@JsonIgnore
//	String password;

	@Override
	public String toString() {
		return "Usr{" +
				       "id=" + id +
				       ", firstName='" + firstName + '\'' +
				       '}';
	}

	//	@Override
//	@JsonIgnore
//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return AuthorityUtils.createAuthorityList(role.name());
//			// AuthorityUtils.authorityListToSet(AuthorityUtils.NO_AUTHORITIES);
//	}
//
//	@Override
//	@JsonIgnore
//	public String getUsername() {
//		return email;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isAccountNonExpired() {
//		return true;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isAccountNonLocked() {
//		return true;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isCredentialsNonExpired() {
//		return true;
//	}
//
//	@Override
//	@JsonIgnore
//	public boolean isEnabled() {
//		return true;
//	}
}