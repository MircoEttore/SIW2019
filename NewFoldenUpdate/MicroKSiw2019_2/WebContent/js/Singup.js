function Utente (nickname , nome , cognome , utenteartista , indirizzo , email , password , confirm ){
	this.nickname = nickname;
	this.nome = nome;
	this.cognome = cognome;
	this.utenteartista = utenteartista;
	this.indirizzo = indirizzo;
	this.email = email;
	this.password = password;
	this.confirm = confirm ; 
}

function checkPasswordMatch () {
	var password = $("#password").val () ; 
	var confirmPassword = $("#confirm").val();
	
	if (password != "" && confirmPassword != "") {
		if (password.length != confirmPassword.length
				&& password != confirmPassword) {
			$("#confirm").css("border", "2px solid red");
			$("#save_btn").attr("disabled", "disabled");
		} else {
			if (password == confirmPassword) {
				$("#confirm").css("border", "2px solid green");
				if ($("#name").val() != "" && $("#surname").val() != ""
						&& $("#email").val() != "" && $("#phone").val() != ""
						&& $("#address").val() != "") {
					$("#save_btn").removeAttr("disabled");
				}
			}
		}
	} else {
		$("#confirm").removeAttr("style");
		$("#save_btn").attr("disabled", "disabled"); 
	}
}

function sendData() {
	var nickname = $("#nickname").val();
	var nome = $("#nome").val();
	var cognome = $("#cognome").val();
	var utenteartista = $("#utenteartista").val();
	var indirizzo = $("#indirizzo").val();
	var email = $("#email").val();
	var password = $("#password").val();
	var confirm = $("#confirm").val(); 
	
	var utente = new Utente (nickname , nome , cognome , utenteartista , indirizzo , email , password , confirm ) ; 
	
	var jsonUtente = {
			nickname : utente.nickname,
			nome : utente.nome ,
			cognome : utente.cognome,
			utenteartista : utente.utenteartista,
			indirizzo : utente.indirizzo ,
			email : utente.email,
			password : utente.password,
			confirm : utente.confirm,
		}
	
	$.ajax({
		type : "POST",
		url : "SignUpServlet",
		datatype : "json",
		data : {
			toModify : JSON.stringify(jsonUser),
		},
		success : function(data) {
			location.reload();
		},
		error : function(data) {
			alert("Sorry some error occured please retry later");
		}
	});
	
	function init() {
		/*
		$("#modify_form_data").submit(function(event) {
			event.preventDefault();
		});
		$("#save_btn").on("click", function() {
			sendData();
		});

		$("#notification").submit(function(event) {
			event.preventDefault();
		});

		$("#save_btn_mailing").on("click", function() {
			sendMailing();
		});
		*/
	}
}