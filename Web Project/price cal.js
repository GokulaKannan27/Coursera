var temp=0;
function name_price(foodname,price)
{
	var fname=foodname;
	var	fprice=price;
	localStorage.setItem("myfoodname",fname);
    localStorage.setItem("myfoodprice",fprice);
	gotologin();
}
function gotologin()
{
	window.location.href="login new.html";
}
function disp()
{
	var name=localStorage.getItem("myfoodname");
	var price=localStorage.getItem("myfoodprice");
	document.getElementById("i_name").innerHTML=name;
	document.getElementById("i_price").innerHTML=price;
}
function svalidatelogin()
{
	var slid=document.getElementById("slogin id").value;
	var slpassword=document.getElementById("slogin password").value;
	var slconfirm=document.getElementById("slogin confirm").value;
	
		var smyloginid=localStorage.getItem("smyloginid");
		var smypassword=localStorage.getItem("smypassword");

	if(slid=="")
	{
		window.alert("Please Enter the login Id");
		return false;
	}
	else if(slpassword=="")
	{
		window.alert("Please Enter the Password");
		return false;
	}
	else if(slpassword!=slconfirm)
	{
		window.alert("Password and cofirm password are not same");
		return false;
	}
	else if(smyloginid!=slid || slpassword!=smypassword)
	{
		window.alert("Can't find your account please register !");
		return false;
	}
	else
	{
		window.location.href="sgalary.html";
	}
}
function svalidateregister()
{
	var srname=document.getElementById("name").value;
	var srage=document.getElementById("age").value;
	var sremail=document.getElementById("email").value;
	var srphoneno=document.getElementById("phoneno").value;
	var srloginid=document.getElementById("slogin id").value;
	var srsetps=document.getElementById("spassword").value;
	var srconfirmps=document.getElementById("sconfirm password").value;	
	if(srname=="" )
	{
		window.alert("please Enter your name");
		return false;
	}
	else if(srage=="")
	{
		window.alert("please Enter your age");
		return false;
	}
	else if(sremail="")
	{
		window.alert("please Enter your email");
		return false;
	}
	else if(srphoneno="")
	{
		window.alert("please Enter your phone number");
		return false;
	}
	else if(srloginid=="")
	{
		window.alert("please Set a Login Id");
		return false;
	}
	else if(srsetps=="")
	{
		window.alert("Please Set a password");
		return false;
	}
	else if(srsetps!=srconfirmps)
	{
		window.alert("Set Password and cofirm password are not same");
		return false;
	}	
	else
	{	
    localStorage.setItem("smyloginid",srloginid);
    localStorage.setItem("smypassword",srsetps);
		window.location.href="STUDLOGIN.html";
	}
}
function tvalidatelogin()
{
	var tlid=document.getElementById("tlogin id").value;
	var tlpassword=document.getElementById("tlogin password").value;
	var tlconfirm=document.getElementById("tlogin confirm").value;
	
		var tmyloginid=localStorage.getItem("tmyloginid");
		var tmypassword=localStorage.getItem("tmypassword");

	if(tlid=="")
	{
		window.alert("Please Enter the login Id");
		return false;
	}
	else if(tlpassword=="")
	{
		window.alert("Please Enter the Password");
		return false;
	}
	else if(tlpassword!=tlconfirm)
	{
		window.alert("Password and cofirm password are not same");
		return false;
	}
	else if(tmyloginid!=tlid || tlpassword!=tmypassword)
	{
		window.alert("Can't find your account please register !");
		return false;
	}
	else
	{
		window.location.href="tgalary.html";
	}
}
function tvalidateregister()
{
	var trname=document.getElementById("name").value;
	var trage=document.getElementById("age").value;
	var tremail=document.getElementById("email").value;
	var trphoneno=document.getElementById("phoneno").value;
	var trloginid=document.getElementById("tlogin id").value;
	var trsetps=document.getElementById("tpassword").value;
	var trconfirmps=document.getElementById("tconfirm password").value;	
	if(trname=="" )
	{
		window.alert("please Enter your name");
		return false;
	}
	else if(trage=="")
	{
		window.alert("please Enter your age");
		return false;
	}
	else if(tremail="")
	{
		window.alert("please Enter your email");
		return false;
	}
	else if(trphoneno="")
	{
		window.alert("please Enter your phone number");
		return false;
	}
	else if(trloginid=="")
	{
		window.alert("please Set a Login Id");
		return false;
	}
	else if(trsetps=="")
	{
		window.alert("Please Set a password");
		return false;
	}
	else if(trsetps!=trconfirmps)
	{
		window.alert("Set Password and cofirm password are not same");
		return false;
	}	
	else
	{	
    tlocalStorage.setItem("tmyloginid",trloginid);
    tlocalStorage.setItem("tmypassword",trsetps);
		window.location.href="TUTORS.html";
	}
}
function avalidatelogin()
{
	var alid=document.getElementById("alogin id").value;
	var alpassword=document.getElementById("alogin password").value;
	var alconfirm=document.getElementById("alogin confirm").value;
	
	
		var amyloginid=localStorage.getItem("amyloginid");
		var amypassword=localStorage.getItem("amypassword");

	if(alid=="")
	{
		window.alert("Please Enter the login Id");
		return false;
	}
	else if(alpassword=="")
	{
		window.alert("Please Enter the Password");
		return false;
	}
	else if(alpassword!=alconfirm)
	{
		window.alert("Password and cofirm password are not same");
		return false;
	}
	else if(amyloginid!=alid || alpassword!=amypassword)
	{
		window.alert("Can't find your account please register !");
		return false;
	}
	else
	{
		window.location.href="agalary.html";
	}
}
function avalidateregister()
{
	var arname=document.getElementById("name").value;
	var arage=document.getElementById("age").value;
	var aremail=document.getElementById("email").value;
	var arphoneno=document.getElementById("phoneno").value;
	var arloginid=document.getElementById("alogin id").value;
	var arsetps=document.getElementById("apassword").value;
	var arconfirmps=document.getElementById("aconfirm password").value;	
	if(arname=="" )
	{
		window.alert("please Enter your name");
		return false;
	}
	else if(arage=="")
	{
		window.alert("please Enter your age");
		return false;
	}
	else if(aremail="")
	{
		window.alert("please Enter your email");
		return false;
	}
	else if(arphoneno="")
	{
		window.alert("please Enter your phone number");
		return false;
	}
	else if(arloginid=="")
	{
		window.alert("please Set a Login Id");
		return false;
	}
	else if(arsetps=="")
	{
		window.alert("Please Set a password");
		return false;
	}
	else if(arsetps!=arconfirmps)
	{
		window.alert("Set Password and cofirm password are not same");
		return false;
	}	
	else
	{	
    localStorage.setItem("amyloginid",arloginid);
    localStorage.setItem("amypassword",arsetps);
		window.location.href="ADMINLOGIN.html";
	}
}
function checkrphoneno()
{
	var rphoneno=document.getElementById("phoneno").value;	
	if(rphoneno.length<10 || rphoneno.length>10)
	{	
		window.alert("Invalid Phone number");
		rphoneno.focus();
	}
}	
function checkradio()
{
if(!document.getElementById("cd").checked && !document.getElementById("dd").checked && !document.getElementById("cod").checked)
{
window.alert("Please select the payement type");
return false;
}
if(document.getElementById("cd").checked)
{
	temp=1;
	var result="You have selected credit card ... so please fill the card details";	
	document.getElementById("sometext").innerHTML=result;
}
else
{
	var result="You no need to fill the credit card details";
	document.getElementById("sometext").innerHTML=result;
}
}
function checkcreditcard()
{
    var quantity=document.getElementById("quantity").value;	
	if(temp==1)
	{
		var cno=document.getElementById("cno").value;
		var month=document.getElementById("month").value;
		var year=document.getElementById("year").value;
		var cvv=document.getElementById("cvv").value;
		var quantity=document.getElementById("quantity").value;		
		if(cno == "" || month=="month" || year=="year" || cvv=="")
		{
			window.alert("please fill all credit card details");
			return false;
		}
		else if(cno.length<15)
		{
			window.alert("please enter a valid credit card number");
			return false;
		}
		else if(quantity=="")
		{
			window.alert("please enter the quantity");
			return false;
		}
		else{
			window.location.href="ordered successfully.html";
		}
	}
	else if(!document.getElementById("cd").checked && !document.getElementById("dd").checked && !document.getElementById("cod").checked)
    {
      window.alert("Please select the payement type");
      return false;
    }
	else if(quantity=="")
	{
			window.alert("please enter the quantity");
			return false;
	}
	else
	{
		var reply=confirm("Are you sure ... Do you want to place this order");
		if(reply == true)
		{
			window.location.href="ordered successfully.html";
			}
	}			
}
function checkcvv()
{
	var cvv=document.getElementById("cvv").value;
	if(cvv=="")
	{
		alert("Invalid CVV");
		cvv.focus();
		return false;
	}
}
function findprice()
{
	var quantity = document.getElementById("quantity").value;
	var price=localStorage.getItem("myfoodprice");	
	var tprice=quantity*price;	
	document.getElementById("totalprice").innerHTML=tprice;
}
			
		
		
function validatecontact()
{
var name=document.getElementById("name").value;
var email=document.getElementById("email").value;
var subject=document.getElementById("subject").value;
var phno=document.getElementById("phno").value;
var message=document.getElementById("message").value;

if(name=="" || email=="" ||  subject=="" || phno=="" || message=="")
{
window.alert("Please fill all the columns");
return false;
}
else{
document.location.href="contact done.html";
}
}	


	

function validateplaceorder()
{
	var fname=document.getElementById("fname").value;
	var phno=document.getElementById("phno").value;
	var pcode=document.getElementById("pcode").value;
	var state=document.getElementById("state").value;
	var city=document.getElementById("city").value;
	var district=document.getElementById("district").value;
	var text1=document.getElementById("text1").value;
	var text2=document.getElementById("text2").value;
	
	if(fname=="")
	{
		window.alert("Please Enter your First Name");
		return false;
	}
	else if(phno=="")
	{
		window.alert("Please Enter your phone number");
		return false;
	}
	else if(state=="")
	{
		window.alert("Please Enter your state");
		return false;
	}
	else if(city=="")
	{
		window.alert("Please Enter your city");
		return false;
	}
	else if(district=="")
	{
		window.alert("Please Enter your district");
		return false;
	}
	else if(text1=="" || text2=="")
	{
		window.alert("Please fill the address");
		return false;
	}
	else if(fname=="" && phno=="" && pcode=="" && state=="" && city=="" && district=="" && text1=="" && text2=="")
	{
		window.alert("please enter all the details");
		return false;
	}
	else{
		window.location.href="payement.html";
	}
}

function validatephno()
{
	
	var phno=document.getElementById("phno").value;
	if(phno.length>10 || phno.length<10)
	{
		window.alert("Invalid phone Number");
		return false;
	}
}
	
function pincodecheck()
{
	
	var pcode=document.getElementById("pcode").value;
	
	if(pcode.length>6 || pcode.length<6)
	{
		window.alert("Invalid Pin code");
		return false;
	}
}

function checkcnumber()
{
	var cno=document.getElementById("cno").value;
	if(cno.length<15)
	{
		window.alert("Invalid credit card number");
		return false;
	}
}
