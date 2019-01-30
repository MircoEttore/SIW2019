$("#contactForm").submit(function(event){
    // cancels the form submission
    event.preventDefault();
    submitForm();
});

function submitForm(){
    // Initiate Variables With Form Content
   
	var name = $("#nome").val();
	var surname = $("#cognome").val();
	var email = $("#email").val();
	var nickname = $("#nickname").val();
	var address = $("#indirizzo").val();
	var password = $("#password").val();
	var confirm = $("#conferma").val();

 
    $.ajax({
        type: "POST",
        url: "SingUpServlet",
        data: "name=" + name + "&email=" + email + "cognome=" + surname + "password=" + password + "nickname=" +nickname,
        success : function(text){
            if (text == "success"){
                formSuccess();
            }
        }
    });
}
function formSuccess(){
    $( "#msgSubmit" ).removeClass( "hidden" );
}