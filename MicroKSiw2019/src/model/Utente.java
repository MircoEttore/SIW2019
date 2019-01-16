package model;

import java.util.ArrayList;

public class Utente {
	
		private int idUtente;
		private int idArtista;
		private String nickname;
		private String nome;
		private String cognome;
		private String telefono;
		private String indirizzo;
		private String email;
		private String password;
		private String conferma;
		private Carrello carrelloUtente;
		

		public Utente() {
			super();
		}

		public Utente(int id, String name, String surname, String phone, String address, String email, String password,String nickname) {
			super();
			carrelloUtente=new Carrello();
			this.idUtente = id;
			this.nickname=nickname;
			this.nome = name;
			this.cognome = surname;
			this.telefono = phone;
			this.indirizzo = address;
			this.email = email;
			this.password = password;
			
		}

		public int getId() {
			return idUtente;
		}

		public void setId(int id) {
			this.idUtente = id;
		}

		public String getName() {
			return nome;
		}

		public void setName(String name) {
			this.nome = name;
		}

		public String getSurname() {
			return cognome;
		}

		public void setSurname(String surname) {
			this.cognome = surname;
		}

		public String getPhone() {
			return telefono;
		}

		public void setPhone(String phone) {
			this.telefono = phone;
		}

		public String getAddress() {
			return indirizzo;
		}

		public void setAddress(String address) {
			this.indirizzo = address;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getConfirm() {
			return conferma;
		}

		public void setConfirm(String confirm) {
			this.conferma = confirm;
		}
	}
