package br.com.fiap.cp2.Domain.user;

public enum TypeRole {

  ADMIN("admin"),
  USER("user");

  private String role;

  TypeRole(String role) {
    this.role = role;
  }

  public String getRole() {
    return role;
  }

}
