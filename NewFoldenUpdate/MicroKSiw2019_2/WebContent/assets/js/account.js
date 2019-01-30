function Utente(nome,cognome,email,nickname,indirizzo, password, confirm ,utente_artista) {
	this.nome = nome;
	this.cognome = cognome;
	this.email = email;
	this.nickname = nickname;
	this.indirizzo = indirizzo;
	this.password = password;
	this.confirm = confirm;
}

function checkPasswordMatch() {
	var password = $("#password").val();
	var confirmPassword = $("#conferma").val();

	if (password != "" && confirmPassword != "") {
		if (password.length != confirmPassword.length
				&& password != confirmPassword) {
			$("#conferma").css("border", "2px solid red");
			$("#save_btn").attr("disabled", "disabled");
		} else {
			if (password == confermaPassword) {
				$("#conferma").css("border", "2px solid green");
				if ($("#nome").val() != "" && $("#cognome").val() != ""
						&& $("#email").val() != "" && $("#nickname").val() != ""
						&& $("#indirizzo").val() != "") {
					$("#save_btn").removeAttr("disabled");
				}
			}
		}
	} else {
		$("#conferma").removeAttr("style");
		$("#save_btn").attr("disabled", "disabled");
	}
}

function sendData() {
	var name = $("#nome").val();
	var surname = $("#cognome").val();
	var email = $("#email").val();
	var phone = $("#nickname").val();
	var address = $("#indirizzo").val();
	var password = $("#password").val();
	var confirm = $("#conferma").val();

	var user = new User(name, surname, email, phone, address, password, confirm);

	var jsonUser = {
		name : user.name,
		surname : user.surname,
		email : user.email,
		phone : user.phone,
		address : user.address,
		password : user.password,
		confirm : user.confirm,
	}
	$.ajax({
		type : "POST",
		url : "modify",
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
}

function sendMailing() {
	var checkbox;
	if ($("#receiveNotifications:checked").length == 0) {
		checkbox = true;
	} else {
		checkbox = false;
	}

	$.ajax({
		method : "POST",
		url : "mailingList",
		datatype : "json",

		data : {
			check : JSON.stringify(checkbox),
		},
		success : function(data) {
			alert("Done!");
		}
	});
}

function init() {
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
}

$(document).ready(function() {
	$("#modify_form_data").keyup(checkPasswordMatch);
});

$(document).ready(init);